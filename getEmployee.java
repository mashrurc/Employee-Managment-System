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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class getEmployee extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					getEmployee frame = new getEmployee();
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
	@SuppressWarnings("serial")
	public getEmployee() {
		setResizable(false);
		//ContentPane Attributes
		setBackground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(120, 50, 1430, 800);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		NumberFormat format = NumberFormat.getInstance();
	    NumberFormatter formatter = new NumberFormatter(format);
	    formatter.setMinimum(0);
	    format.setGroupingUsed(false);
	    formatter.setMaximum(999999);
	    formatter.setAllowsInvalid(false);
		
		NumberFormatter formatter2 = new NumberFormatter(format);
	    formatter2.setAllowsInvalid(false);
	    formatter2.setMinimum(0);
	    format.setGroupingUsed(false);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"TYPE", "EMPLOYEE #", "FIRST NAME", "LAST NAME", "GENDER", "LOCATION", "DEDUCTION %", "SALARY", "HOURLY WAGE", "WEEKLY HOURS", "YEARLY WEEKS"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Object.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table_1.getColumnModel().getColumn(0).setResizable(false);
		table_1.getColumnModel().getColumn(0).setPreferredWidth(57);
		table_1.getColumnModel().getColumn(1).setResizable(false);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(85);
		table_1.getColumnModel().getColumn(2).setResizable(false);
		table_1.getColumnModel().getColumn(3).setResizable(false);
		table_1.getColumnModel().getColumn(4).setResizable(false);
		table_1.getColumnModel().getColumn(4).setPreferredWidth(50);
		table_1.getColumnModel().getColumn(5).setResizable(false);
		table_1.getColumnModel().getColumn(6).setResizable(false);
		table_1.getColumnModel().getColumn(6).setPreferredWidth(84);
		table_1.getColumnModel().getColumn(7).setResizable(false);
		table_1.getColumnModel().getColumn(7).setPreferredWidth(61);
		table_1.getColumnModel().getColumn(8).setPreferredWidth(90);
		table_1.getColumnModel().getColumn(9).setResizable(false);
		table_1.getColumnModel().getColumn(9).setPreferredWidth(94);
		table_1.getColumnModel().getColumn(10).setResizable(false);
		table_1.getColumnModel().getColumn(10).setPreferredWidth(91);
		table_1.setBounds(440, 106, 974, 652);
		contentPane.add(table_1);
		
		JLabel lblType = new JLabel("TYPE");
		lblType.setForeground(Color.WHITE);
		lblType.setHorizontalAlignment(SwingConstants.CENTER);
		lblType.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblType.setBounds(440, 92, 68, 14);
		contentPane.add(lblType);
		
		JLabel lblEmployee = new JLabel("EMPLOYEE #");
		lblEmployee.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmployee.setForeground(Color.WHITE);
		lblEmployee.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblEmployee.setBounds(507, 92, 96, 14);
		contentPane.add(lblEmployee);
		
		JLabel lblFirstName = new JLabel("FIRST NAME");
		lblFirstName.setHorizontalAlignment(SwingConstants.CENTER);
		lblFirstName.setForeground(Color.WHITE);
		lblFirstName.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblFirstName.setBounds(602, 92, 89, 14);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("LAST NAME");
		lblLastName.setHorizontalAlignment(SwingConstants.CENTER);
		lblLastName.setForeground(Color.WHITE);
		lblLastName.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblLastName.setBounds(689, 92, 89, 14);
		contentPane.add(lblLastName);
		
		JLabel lblGender = new JLabel("GENDER");
		lblGender.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender.setForeground(Color.WHITE);
		lblGender.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblGender.setBounds(777, 92, 62, 14);
		contentPane.add(lblGender);
		
		JLabel lblLocation = new JLabel("LOCATION");
		lblLocation.setHorizontalAlignment(SwingConstants.CENTER);
		lblLocation.setForeground(Color.WHITE);
		lblLocation.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblLocation.setBounds(837, 92, 89, 14);
		contentPane.add(lblLocation);
		
		JLabel lblDeduction = new JLabel("DEDUCTION %");
		lblDeduction.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeduction.setForeground(Color.WHITE);
		lblDeduction.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblDeduction.setBounds(927, 92, 96, 14);
		contentPane.add(lblDeduction);
		
		JLabel lblSalary = new JLabel("SALARY");
		lblSalary.setHorizontalAlignment(SwingConstants.CENTER);
		lblSalary.setForeground(Color.WHITE);
		lblSalary.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblSalary.setBounds(1006, 92, 96, 14);
		contentPane.add(lblSalary);
		
		JLabel lblHourlyWage = new JLabel("HOURLY WAGE");
		lblHourlyWage.setHorizontalAlignment(SwingConstants.CENTER);
		lblHourlyWage.setForeground(Color.WHITE);
		lblHourlyWage.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblHourlyWage.setBounds(1092, 92, 106, 14);
		contentPane.add(lblHourlyWage);
		
		JLabel lblWeeksyear = new JLabel("HOURS/WEEK");
		lblWeeksyear.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeeksyear.setForeground(Color.WHITE);
		lblWeeksyear.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblWeeksyear.setBounds(1197, 92, 106, 14);
		contentPane.add(lblWeeksyear);
		
		JLabel lblWeeksyear_1 = new JLabel("WEEKS/YEAR");
		lblWeeksyear_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeeksyear_1.setForeground(Color.WHITE);
		lblWeeksyear_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblWeeksyear_1.setBounds(1297, 92, 106, 14);
		contentPane.add(lblWeeksyear_1);
		
		JButton btnLogOut = new JButton("");
		
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new login().setVisible(true);
				getEmployee.this.setVisible(false);
			}
		});
		
		btnLogOut.setBounds(64, 683, 295, 70);
		btnLogOut.setContentAreaFilled(false);
		btnLogOut.setBorder(null);
		contentPane.add(btnLogOut);
		
		JButton btnAdd = new JButton("");
		btnAdd.setFocusable(false);
		
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new addEmployee().setVisible(true);
				getEmployee.this.setVisible(false);
			}
		});
		
		btnAdd.setBounds(0, 366, 430, 89);
		btnAdd.setContentAreaFilled(false);
		btnAdd.setBorder(null);
		contentPane.add(btnAdd);
		
		JButton btnEdit = new JButton("");
		btnEdit.setFocusable(false);
		
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new editEmployee().setVisible(true);
				getEmployee.this.setVisible(false);
			}
		});
		
		btnEdit.setBounds(0, 462, 430, 99);
		btnEdit.setContentAreaFilled(false);
		btnEdit.setBorder(null);
		contentPane.add(btnEdit);
		
		JLabel circleName = new JLabel("");
		circleName.setText(login.c);
		circleName.setForeground(Color.WHITE);
		circleName.setHorizontalAlignment(SwingConstants.CENTER);
		circleName.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 45));
		circleName.setBounds(91, 139, 240, 70);
		contentPane.add(circleName);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Mashrur\\eclipse-workspace\\MyHashTable\\src\\InheritanceGUI\\sidebar.png"));
		lblNewLabel.setBounds(0, 0, 430, 771);
		contentPane.add(lblNewLabel);
		
		JLabel lblRemoveEmployee = new JLabel("REMOVE EMPLOYEE");
		lblRemoveEmployee.setHorizontalAlignment(SwingConstants.LEFT);
		lblRemoveEmployee.setForeground(Color.WHITE);
		lblRemoveEmployee.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblRemoveEmployee.setBounds(797, 11, 251, 37);
		contentPane.add(lblRemoveEmployee);
		
		textField = new JTextField();
		textField.setBounds(797, 43, 223, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setFocusable(false);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String search = textField.getText();
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
					new getEmployee().setVisible(true);
					getEmployee.this.setVisible(false);
					
					textField.setText("");
				} else {
					JOptionPane.showMessageDialog(null, 
	                        "That Employee Wasn't Found!", 
	                        "", 
	                        JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		
		btnNewButton.setBounds(1030, 22, 50, 50);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorder(null);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Mashrur\\eclipse-workspace\\MyHashTable\\src\\InheritanceGUI\\check.png"));
		lblNewLabel_1.setBounds(1030, 21, 50, 50);
		contentPane.add(lblNewLabel_1);
		
		File inputFile = new File("C:\\Users\\Mashrur\\eclipse-workspace\\MyHashTable\\src\\InheritanceGUI\\"+login.c+".txt");

		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Mashrur\\eclipse-workspace\\MyHashTable\\src\\InheritanceGUI\\"+login.c+".txt"))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		       
		       String[] employeeInfo = line.split(" ");
		       
		       String employeeType = employeeInfo[0];
		       
		       
		       if (employeeType.equals("FULL-TIME")) {
		    	   String employeeNumber = employeeInfo[1];
			       String firstName = employeeInfo[2];
			       String lastName = employeeInfo[3];
			       String gender = employeeInfo[4];
			       String workLocation = employeeInfo[5];
			       String deductionRate = employeeInfo[6];
			       String annualSalary = employeeInfo[7];
		    	   ((DefaultTableModel) table_1.getModel()).addRow(new Object[]{employeeType, employeeNumber, firstName, lastName, gender, workLocation, deductionRate+"%", annualSalary, "N/A", "N/A", "N/A"});
		    	   
		       } else {
		    	   String employeeNumber = employeeInfo[1];
			       String firstName = employeeInfo[2];
			       String lastName = employeeInfo[3];
			       String gender = employeeInfo[4];
			       String workLocation = employeeInfo[5];
			       String deductionRate = employeeInfo[6];
			       String hourlyWage = employeeInfo[7];
			       String hoursWeek = employeeInfo[8];
			       String weeksYear = employeeInfo[9];
			       
			       ((DefaultTableModel) table_1.getModel()).addRow(new Object[]{employeeType, employeeNumber, firstName, lastName, gender, workLocation, deductionRate+"%", "N/A", hourlyWage, hoursWeek, weeksYear});
		    	   
		       }
		    } 
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
	}
		
	}
}