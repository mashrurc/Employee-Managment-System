package InheritanceGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.text.NumberFormatter;
import javax.swing.JTextField;
import javax.swing.JSlider;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;
import java.awt.Insets;
import java.text.NumberFormat;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;

import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.ImageIcon;

public class removeEmployee extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					removeEmployee frame = new removeEmployee();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public removeEmployee() {
		//ContentPane Attributes
		setBackground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 247);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMenuTitle = new JLabel("REMOVE EMPLOYEE");
		lblMenuTitle.setBackground(new Color(165, 42, 42));
		lblMenuTitle.setFont(new Font("Arial", Font.BOLD, 29));
		lblMenuTitle.setForeground(new Color(0, 191, 255));
		lblMenuTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuTitle.setBounds(155, 11, 366, 36);
		contentPane.add(lblMenuTitle);
		
		JLabel lblEmployeeNumber = new JLabel("Employee Number");
		lblEmployeeNumber.setFocusable(false);
		lblEmployeeNumber.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEmployeeNumber.setForeground(Color.WHITE);
		lblEmployeeNumber.setBounds(20, 58, 167, 30);
		contentPane.add(lblEmployeeNumber);
		
		NumberFormat format = NumberFormat.getInstance();
	    NumberFormatter formatter = new NumberFormatter(format);
	    formatter.setMinimum(0);
	    format.setGroupingUsed(false);
	    formatter.setMaximum(999999);
	    formatter.setAllowsInvalid(false);
	    
		JFormattedTextField formattedTextField = new JFormattedTextField(formatter);
		formattedTextField.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		formattedTextField.setFont(new Font("Arial", Font.PLAIN, 17));
		formattedTextField.setBounds(20, 88, 614, 30);
		contentPane.add(formattedTextField);
		
		NumberFormatter formatter2 = new NumberFormatter(format);
	    formatter2.setAllowsInvalid(false);
	    formatter2.setMinimum(0);
	    format.setGroupingUsed(false);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setFocusable(false);
		label.setBounds(467, 367, 167, 30);
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String search = formattedTextField.getText();
				File inputFile = new File("C:\\Users\\Mashrur\\eclipse-workspace\\MyHashTable\\src\\InheritanceGUI\\"+login.c+".txt");
				File tempFile = new File("C:\\Users\\Mashrur\\eclipse-workspace\\MyHashTable\\src\\InheritanceGUI\\tempFile.txt");
			    boolean found = false;

				try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Mashrur\\eclipse-workspace\\MyHashTable\\src\\InheritanceGUI\\"+login.c+".txt"))) {
				    String line;
				    while ((line = br.readLine()) != null) {
				    	
				       String[] employeeInfo = line.split(" ");
				       String employeeType = employeeInfo[0];
				       String writeInfo = "";
				       
				       if (employeeType.equals("FULL-TIME")) {
				    	   System.out.println("fte");
				    	   String employeeNumber = employeeInfo[1];
					       String firstName = employeeInfo[2];
					       String lastName = employeeInfo[3];
					       String gender = employeeInfo[4];
					       String workLocation = employeeInfo[5];
					       String deductionRate = employeeInfo[6];
					       String annualSalary = employeeInfo[7];
					   
					       writeInfo = employeeType+" "+employeeNumber+" "+firstName+" "+lastName+" "+gender+" "+workLocation+" "+deductionRate+" "+annualSalary+"\n";
				       } else {
				    	   String employeeNumber = employeeInfo[1];
					       String firstName = employeeInfo[2];
					       System.out.println(firstName);
					       String lastName = employeeInfo[3];
					       String gender = employeeInfo[4];
					       String workLocation = employeeInfo[5];
					       String deductionRate = employeeInfo[6];
					       String hourlyWage = employeeInfo[7];
					       String hoursWeek = employeeInfo[8];
					       String weeksYear = employeeInfo[9];
					       
					       writeInfo = employeeType+" "+employeeNumber+" "+firstName+" "+lastName+" "+gender+" "+workLocation+" "+deductionRate+" "+hourlyWage+" "+hoursWeek+" "+weeksYear+"\n";
				       }
				       
				       String employeeNumber = employeeInfo[1];
			
				       if (employeeNumber.equals(search)) {
				    	   found=true;
				       } else {
				    	   try (Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(tempFile, true)))) {
						        out.write(writeInfo); 
						        }
						    catch (IOException e){
						            JOptionPane.showMessageDialog(null,e.getMessage());
						            }
						    catch(Exception e){
						            JOptionPane.showMessageDialog(null,e.getMessage());        
						    }
				       }
				    }
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
			}
				
				inputFile.delete();
				tempFile.renameTo(inputFile);
				
				PrintWriter pw;
				try {
					pw = new PrintWriter("C:\\Users\\Mashrur\\eclipse-workspace\\MyHashTable\\src\\InheritanceGUI\\tempFile.txt");
					pw.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				if (found==true) {
					JOptionPane.showMessageDialog(null, 
	                        "Employee Removed!", 
	                        "", 
	                        JOptionPane.WARNING_MESSAGE);
					
					formattedTextField.setText("");
				} else {
					JOptionPane.showMessageDialog(null, 
	                        "That Employee Wasn't Found!", 
	                        "", 
	                        JOptionPane.WARNING_MESSAGE);
				}
			}});
		
		btnNewButton.setFocusable(false);
		btnNewButton.setForeground(new Color(47, 79, 79));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 25));
		btnNewButton.setBackground(new Color(135, 206, 235));
		btnNewButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setBounds(267, 145, 115, 45);
		contentPane.add(btnNewButton);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				try {
					new MainFrame().setVisible(true);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				removeEmployee.this.dispose();
			}
		});
		btnBack.setMargin(new Insets(2, 2, 2, 2));
		btnBack.setIconTextGap(10);
		btnBack.setIcon(new ImageIcon(addEmployee.class.getResource("/InheritanceGUI/return.png")));
		btnBack.setForeground(new Color(47, 79, 79));
		btnBack.setFont(new Font("Arial", Font.BOLD, 18));
		btnBack.setFocusable(false);
		btnBack.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnBack.setBackground(new Color(135, 206, 235));
		btnBack.setBounds(20, 11, 125, 36);
		contentPane.add(btnBack);
		
		NumberFormatter formatter3 = new NumberFormatter(format);
	    formatter3.setMaximum(168);
	    formatter3.setMinimum(0);
	    formatter3.setAllowsInvalid(false);
		
		NumberFormatter formatter4 = new NumberFormatter(format);
	    formatter4.setMaximum(52);
	    formatter4.setMinimum(0);
	    formatter4.setAllowsInvalid(false);
		
	}
}