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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.ImageIcon;

public class addEmployee extends JFrame {
	
	public static MyHashTable theHT = new MyHashTable(10);
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addEmployee frame = new addEmployee();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param theHT 
	 */
	public addEmployee() {
				
		//ContentPane Attributes
		setBackground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(220, 30, 1207, 801);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMenuTitle = new JLabel("ADD FULL-TIME EMPLOYEE");
		lblMenuTitle.setBackground(new Color(165, 42, 42));
		lblMenuTitle.setFont(new Font("Arial", Font.BOLD, 52));
		lblMenuTitle.setForeground(Color.WHITE);
		lblMenuTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuTitle.setBounds(440, 31, 741, 53);
		contentPane.add(lblMenuTitle);
		
		JLabel lblEmployeeNumber = new JLabel("Employee Number");
		lblEmployeeNumber.setFocusable(false);
		lblEmployeeNumber.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEmployeeNumber.setForeground(Color.WHITE);
		lblEmployeeNumber.setBounds(450, 143, 167, 30);
		contentPane.add(lblEmployeeNumber);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFocusable(false);
		lblFirstName.setForeground(Color.WHITE);
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFirstName.setBounds(450, 225, 167, 30);
		contentPane.add(lblFirstName);
		
		textField = new JTextField();
		textField.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField.setMargin(new Insets(2, 5, 2, 2));
		textField.setFont(new Font("Arial", Font.PLAIN, 17));
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setColumns(10);
		textField.setBounds(450, 251, 720, 30);
		contentPane.add(textField);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFocusable(false);
		lblLastName.setForeground(Color.WHITE);
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblLastName.setBounds(450, 298, 167, 30);
		contentPane.add(lblLastName);
		
		textField_1 = new JTextField();
		textField_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_1.setMargin(new Insets(2, 5, 2, 2));
		textField_1.setFont(new Font("Arial", Font.PLAIN, 17));
		textField_1.setHorizontalAlignment(SwingConstants.LEFT);
		textField_1.setColumns(10);
		textField_1.setBounds(450, 326, 720, 30);
		contentPane.add(textField_1);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setFocusable(false);
		label.setBounds(1003, 509, 167, 30);
		contentPane.add(label);
		
		JLabel circleName = new JLabel("");
		circleName.setText(login.c);
		circleName.setForeground(Color.WHITE);
		circleName.setHorizontalAlignment(SwingConstants.CENTER);
		circleName.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 45));
		circleName.setBounds(91, 139, 240, 70);
		contentPane.add(circleName);
		
		JLabel lblWorkLocation = new JLabel("Work Location");
		lblWorkLocation.setFocusable(false);
		lblWorkLocation.setForeground(Color.WHITE);
		lblWorkLocation.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblWorkLocation.setBounds(450, 371, 167, 30);
		contentPane.add(lblWorkLocation);
		
		textField_2 = new JTextField();
		textField_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_2.setMargin(new Insets(2, 5, 2, 2));
		textField_2.setFont(new Font("Arial", Font.PLAIN, 17));
		textField_2.setHorizontalAlignment(SwingConstants.LEFT);
		textField_2.setColumns(10);
		textField_2.setBounds(450, 400, 720, 30);
		contentPane.add(textField_2);
		
		JSlider slider = new JSlider();
		slider.setMinorTickSpacing(1/10);
		slider.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		slider.setFocusable(false);
		slider.setSnapToTicks(true);
		slider.setForeground(Color.WHITE);
		slider.setBounds(450, 539, 720, 26);
		contentPane.add(slider);
		
		JLabel lblDeduction = new JLabel("Deduction %");
		lblDeduction.setFocusable(false);
		lblDeduction.setHorizontalAlignment(SwingConstants.LEFT);
		lblDeduction.setForeground(Color.WHITE);
		lblDeduction.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDeduction.setBounds(450, 509, 167, 30);
		contentPane.add(lblDeduction);
		
		JLabel lblAnnualSalary = new JLabel("Annual Salary");
		lblAnnualSalary.setFocusable(false);
		lblAnnualSalary.setForeground(Color.WHITE);
		lblAnnualSalary.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAnnualSalary.setBounds(450, 590, 167, 30);
		contentPane.add(lblAnnualSalary);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.GRAY);
		comboBox.setForeground(Color.WHITE);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"GENDER", "Male", "Female", "Other"}));
		comboBox.setName("");
		comboBox.setBounds(450, 459, 358, 26);
		contentPane.add(comboBox);
		
		NumberFormat format = NumberFormat.getInstance();
	    NumberFormatter formatter = new NumberFormatter(format);
	    formatter.setMinimum(0);
	    format.setGroupingUsed(false);
	    formatter.setMaximum(999999);
	    formatter.setAllowsInvalid(false);
	    
		JFormattedTextField formattedTextField = new JFormattedTextField(formatter);
		formattedTextField.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		formattedTextField.setFont(new Font("Arial", Font.PLAIN, 17));
		formattedTextField.setBounds(450, 173, 720, 30);
		contentPane.add(formattedTextField);
		
		NumberFormatter formatter2 = new NumberFormatter(format);
	    formatter2.setAllowsInvalid(false);
	    formatter2.setMinimum(0);
	    format.setGroupingUsed(false);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				label.setText(String.format("%.2f", slider.getValue()/1f) + "%");
			}
		});
		
		JButton btnNewButton = new JButton("Submit");
		
		btnNewButton.setFocusable(false);
		btnNewButton.setForeground(new Color(47, 79, 79));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 25));
		btnNewButton.setBackground(new Color(135, 206, 235));
		btnNewButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setBounds(732, 675, 161, 53);
		contentPane.add(btnNewButton);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"FULL-TIME", "PART-TIME"}));
		comboBox_1.setName("");
		comboBox_1.setForeground(Color.WHITE);
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		comboBox_1.setBackground(Color.GRAY);
		comboBox_1.setBounds(1003, 109, 167, 36);
		contentPane.add(comboBox_1);
		
		JLabel lblHpW = new JLabel("Hours Per Week");
		lblHpW.setFocusable(false);
		lblHpW.setForeground(Color.WHITE);
		lblHpW.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblHpW.setBounds(695, 590, 167, 30);
		contentPane.add(lblHpW);
		lblHpW.setVisible(false);
		
		JLabel lblWpY = new JLabel("Weeks Per Year");
		lblWpY.setFocusable(false);
		lblWpY.setForeground(Color.WHITE);
		lblWpY.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblWpY.setBounds(972, 590, 167, 30);
		contentPane.add(lblWpY);
	
		lblWpY.setVisible(false);
		
		NumberFormatter formatter3 = new NumberFormatter(format);
	    formatter3.setMaximum(168);
	    formatter3.setMinimum(0);
	    formatter3.setAllowsInvalid(false);
		JFormattedTextField formattedTextField_2 = new JFormattedTextField(formatter3);
		formattedTextField_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		formattedTextField_2.setFont(new Font("Arial", Font.PLAIN, 17));
		formattedTextField_2.setBounds(695, 618, 223, 30);
		contentPane.add(formattedTextField_2);
		formattedTextField_2.setVisible(false);
		
		NumberFormatter formatter4 = new NumberFormatter(format);
	    formatter4.setMaximum(52);
	    formatter4.setMinimum(0);
	    formatter4.setAllowsInvalid(false);
	    
		JFormattedTextField formattedTextField_4 = new JFormattedTextField(formatter4);
		formattedTextField_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		formattedTextField_4.setFont(new Font("Arial", Font.PLAIN, 17));
		formattedTextField_4.setBounds(972, 618, 198, 30);
		contentPane.add(formattedTextField_4);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField(formatter2);
		formattedTextField_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		formattedTextField_1.setFont(new Font("Arial", Font.PLAIN, 17));
		formattedTextField_1.setBounds(450, 618, 720, 30);
		contentPane.add(formattedTextField_1);
		
		JButton btnLogOut = new JButton("");
		
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new login().setVisible(true);
				addEmployee.this.setVisible(false);
			}
		});
		
		btnLogOut.setBounds(64, 683, 295, 70);
		btnLogOut.setContentAreaFilled(false);
		btnLogOut.setBorder(null);
		contentPane.add(btnLogOut);
		
		JButton btnAdd = new JButton("");
		
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new getEmployee().setVisible(true);
				addEmployee.this.setVisible(false);
			}
		});
		
		btnAdd.setBounds(0, 563, 430, 85);
		btnAdd.setContentAreaFilled(false);
		btnAdd.setBorder(null);
		contentPane.add(btnAdd);
		
		JButton btnEdit = new JButton("");
		
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new editEmployee().setVisible(true);
				addEmployee.this.setVisible(false);
			}
		});
		
		btnEdit.setBounds(0, 455, 430, 97);
		btnEdit.setContentAreaFilled(false);
		btnEdit.setBorder(null);
		contentPane.add(btnEdit);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Mashrur\\eclipse-workspace\\MyHashTable\\src\\InheritanceGUI\\sidebar.png"));
		lblNewLabel.setBounds(0, 0, 430, 761);
		contentPane.add(lblNewLabel);
		formattedTextField_4.setVisible(false);
		
		comboBox_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if (((String) comboBox_1.getSelectedItem()).equals("PART-TIME")) {
					lblAnnualSalary.setText("Hourly Wage");
					formattedTextField_1.setBounds(450, 618, 180, 30);
					lblHpW.setVisible(true);
					lblWpY.setVisible(true);
					formattedTextField_2.setVisible(true);
					formattedTextField_4.setVisible(true);
					
					lblMenuTitle.setText("ADD PART-TIME EMPLOYEE");
					
				} else {
					lblHpW.setVisible(false);
					lblWpY.setVisible(false);
					formattedTextField_2.setVisible(false);
					formattedTextField_4.setVisible(false);
					lblAnnualSalary.setText("Annual Salary");
					lblMenuTitle.setText("ADD FULL-TIME EMPLOYEE");
					formattedTextField_1.setBounds(450, 618, 720, 30);
				}
				
			}
		});

		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				FTE someFTE;
				PTE somePTE;
				if (formattedTextField.getText()!="" && textField.getText()!="" && textField_1.getText()!="" && textField_2.getText()!="" && (String) comboBox.getSelectedItem()!="GENDER" && formattedTextField_1.getText()!="") {
					String employeeType = (String) comboBox_1.getSelectedItem();
					String employeeNumber = formattedTextField.getText();
					String firstName = textField.getText();
					String lastName = textField_1.getText();
					String workLocation = textField_2.getText();
					String gender = ((String) comboBox.getSelectedItem());
					double deductionRate = slider.getValue();
					
					if (employeeType=="FULL-TIME") {
						String annualSalary = formattedTextField_1.getText();
						System.out.println(employeeType+" "+employeeNumber+" "+firstName+" "+lastName+" "+gender+" "+workLocation+" "+deductionRate+" "+annualSalary);
						
						someFTE = new FTE(Integer.parseInt(employeeNumber), firstName, lastName, gender, workLocation, deductionRate, Double.parseDouble(annualSalary));
						theHT.addToTable(someFTE);
						
						try (Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\Mashrur\\eclipse-workspace\\MyHashTable\\src\\InheritanceGUI\\\\"+login.c+".txt", true)))) {
					        out.write(employeeType+" "+employeeNumber+" "+firstName+" "+lastName+" "+gender+" "+workLocation+" "+deductionRate+" "+annualSalary+"\n"); 
					        out.close();
					        }
					    catch (IOException e){
					            JOptionPane.showMessageDialog(null,e.getMessage());
					            }
					    catch(Exception e){
					            JOptionPane.showMessageDialog(null,e.getMessage());        
					    }
						
						JOptionPane.showMessageDialog(null, 
	                            "Employee Added!", 
	                            "", 
	                            JOptionPane.WARNING_MESSAGE);
						
					} else {
						Double hW = Double.parseDouble(formattedTextField_1.getText());
						Double wH = Double.parseDouble(formattedTextField_2.getText());
						Double yW = Double.parseDouble(formattedTextField_4.getText());
						System.out.println(employeeType+" "+employeeNumber+" "+firstName+" "+lastName+" "+gender+" "+workLocation+" "+deductionRate+" "+hW+" "+wH+" "+yW);
						
						try (Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\Mashrur\\eclipse-workspace\\MyHashTable\\src\\InheritanceGUI\\"+login.c+".txt", true)))) {
					        out.write(employeeType+" "+employeeNumber+" "+firstName+" "+lastName+" "+gender+" "+workLocation+" "+deductionRate+" "+hW+" "+wH+" "+yW+"\n"); 
					        out.close();
					        }
					    catch (IOException e){
					            JOptionPane.showMessageDialog(null,e.getMessage());
					            }
					    catch(Exception e){
					            JOptionPane.showMessageDialog(null,e.getMessage());        
					    }

						somePTE = new PTE(Integer.parseInt(employeeNumber), firstName, lastName, gender, workLocation, deductionRate, hW, wH, yW);
						theHT.addToTable(somePTE);
						
						JOptionPane.showMessageDialog(null, 
	                            "Employee Added!", 
	                            "", 
	                            JOptionPane.WARNING_MESSAGE);
						
					}
					
				} else {
					JOptionPane.showMessageDialog(null, 
                            "Please Complete All Fields!", 
                            "Missing Information", 
                            JOptionPane.WARNING_MESSAGE);
				}
				
				new getEmployee().setVisible(true);
				addEmployee.this.setVisible(false);

			}
			
		});
	}
}