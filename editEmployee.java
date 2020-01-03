package InheritanceGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
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
import java.text.NumberFormat;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.NumberFormatter;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class editEmployee extends JFrame {

	private JPanel contentPane;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					editEmployee frame = new editEmployee();
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
	public editEmployee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(220, 30, 1207, 800);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmployeeNumber = new JLabel("Employee Number");
		lblEmployeeNumber.setFocusable(false);
		lblEmployeeNumber.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEmployeeNumber.setForeground(Color.WHITE);
		lblEmployeeNumber.setBounds(450, 143, 167, 30);
		contentPane.add(lblEmployeeNumber);
		lblEmployeeNumber.setVisible(false);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFocusable(false);
		lblFirstName.setForeground(Color.WHITE);
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFirstName.setBounds(450, 225, 167, 30);
		contentPane.add(lblFirstName);
		lblFirstName.setVisible(false);
		
		JTextField textField = new JTextField();
		textField.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField.setMargin(new Insets(2, 5, 2, 2));
		textField.setFont(new Font("Arial", Font.PLAIN, 17));
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setColumns(10);
		textField.setBounds(450, 251, 720, 30);
		contentPane.add(textField);
		textField.setVisible(false);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFocusable(false);
		lblLastName.setForeground(Color.WHITE);
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblLastName.setBounds(450, 298, 167, 30);
		contentPane.add(lblLastName);
		lblLastName.setVisible(false);
		
		JTextField textField_1 = new JTextField();
		textField_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_1.setMargin(new Insets(2, 5, 2, 2));
		textField_1.setFont(new Font("Arial", Font.PLAIN, 17));
		textField_1.setHorizontalAlignment(SwingConstants.LEFT);
		textField_1.setColumns(10);
		textField_1.setBounds(450, 326, 720, 30);
		contentPane.add(textField_1);
		textField_1.setVisible(false);
		
		NumberFormat format = NumberFormat.getInstance();
	    NumberFormatter formatter = new NumberFormatter(format);
	    formatter.setMinimum(0);
	    format.setGroupingUsed(false);
	    formatter.setMaximum(999999);
	    formatter.setAllowsInvalid(false);
	    
	    JLabel lblWorkLocation = new JLabel("Work Location");
		lblWorkLocation.setFocusable(false);
		lblWorkLocation.setForeground(Color.WHITE);
		lblWorkLocation.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblWorkLocation.setBounds(450, 371, 167, 30);
		contentPane.add(lblWorkLocation);
		lblWorkLocation.setVisible(false);
		
		JTextField textField_2 = new JTextField();
		textField_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_2.setMargin(new Insets(2, 5, 2, 2));
		textField_2.setFont(new Font("Arial", Font.PLAIN, 17));
		textField_2.setHorizontalAlignment(SwingConstants.LEFT);
		textField_2.setColumns(10);
		textField_2.setBounds(450, 400, 720, 30);
		contentPane.add(textField_2);
		textField_2.setVisible(false);
		
		JSlider slider = new JSlider();
		slider.setMinorTickSpacing(1/10);
		slider.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		slider.setFocusable(false);
		slider.setSnapToTicks(true);
		slider.setForeground(Color.WHITE);
		slider.setBounds(450, 539, 720, 26);
		contentPane.add(slider);
		slider.setVisible(false);
		
		JLabel lblDeduction = new JLabel("Deduction %");
		lblDeduction.setFocusable(false);
		lblDeduction.setHorizontalAlignment(SwingConstants.LEFT);
		lblDeduction.setForeground(Color.WHITE);
		lblDeduction.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDeduction.setBounds(450, 509, 167, 30);
		contentPane.add(lblDeduction);
		lblDeduction.setVisible(false);
		
		JLabel lblAnnualSalary = new JLabel("Annual Salary");
		lblAnnualSalary.setFocusable(false);
		lblAnnualSalary.setForeground(Color.WHITE);
		lblAnnualSalary.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAnnualSalary.setBounds(450, 590, 167, 30);
		contentPane.add(lblAnnualSalary);
		lblAnnualSalary.setVisible(false);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.GRAY);
		comboBox.setForeground(Color.WHITE);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"GENDER", "Male", "Female", "Other"}));
		comboBox.setName("");
		comboBox.setBounds(450, 459, 358, 26);
		contentPane.add(comboBox);
		comboBox.setVisible(false);
		
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setFocusable(false);
		label.setBounds(1003, 509, 167, 30);
		contentPane.add(label);

		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				label.setText(String.format("%.2f", slider.getValue()/1f) + "%");
			}
		});
	    
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"FULL-TIME", "PART-TIME"}));
		comboBox_1.setName("");
		comboBox_1.setForeground(Color.WHITE);
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		comboBox_1.setBackground(Color.GRAY);
		comboBox_1.setBounds(1003, 109, 167, 36);
		contentPane.add(comboBox_1);
		comboBox_1.setVisible(false);
		
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
		
		NumberFormatter formatter4 = new NumberFormatter(format);
	    formatter4.setMaximum(52);
	    formatter4.setMinimum(0);
	    formatter4.setAllowsInvalid(false);
	    
		JFormattedTextField formattedTextField_4 = new JFormattedTextField(formatter4);
		formattedTextField_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		formattedTextField_4.setFont(new Font("Arial", Font.PLAIN, 17));
		formattedTextField_4.setBounds(972, 618, 198, 30);
		contentPane.add(formattedTextField_4);
		formattedTextField_4.setVisible(false);
		
		JFormattedTextField formattedTextField_2 = new JFormattedTextField(formatter3);
		formattedTextField_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		formattedTextField_2.setFont(new Font("Arial", Font.PLAIN, 17));
		formattedTextField_2.setBounds(695, 618, 223, 30);
		contentPane.add(formattedTextField_2);
		formattedTextField_2.setVisible(false);
		
		JButton btnNewButton = new JButton("Submit");
		
		btnNewButton.setFocusable(false);
		btnNewButton.setForeground(new Color(47, 79, 79));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 25));
		btnNewButton.setBackground(new Color(135, 206, 235));
		btnNewButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setBounds(732, 675, 161, 53);
		contentPane.add(btnNewButton);
		btnNewButton.setVisible(false);

		String[] employees = {"CHOOSE AN EMPLOYEE BELOW"};
		
		JComboBox comboBox_11 = new JComboBox();
		comboBox_11.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		comboBox_11.setModel(new DefaultComboBoxModel(employees));
		comboBox_11.setName("");
		comboBox_11.setForeground(Color.WHITE);
		comboBox_11.setFont(new Font("Tahoma", Font.BOLD, 23));
		comboBox_11.setBackground(Color.GRAY);
		comboBox_11.setBounds(480, 53, 660, 36);
		contentPane.add(comboBox_11);
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String[] eNum = ((String) comboBox_11.getSelectedItem()).split(" -");
				String search = eNum[0];
				
				File inputFile = new File("C:\\Users\\Mashrur\\eclipse-workspace\\MyHashTable\\src\\InheritanceGUI\\"+login.c+".txt");
				File tempFile = new File("C:\\Users\\Mashrur\\eclipse-workspace\\MyHashTable\\src\\InheritanceGUI\\tempFile.txt");

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
				    	   if (((String) comboBox_1.getSelectedItem()).contains("FULL")) {
				    		   String eN = textField_3.getText();
				    		   String fN = textField.getText();
				    		   String lN = textField_1.getText();
				    		   String wL = textField_2.getText();
				    		   String g = (String) comboBox.getSelectedItem();	
				    		   int dR = slider.getValue();
				    		   String aS = textField_4.getText();
				    		   
				    		   writeInfo = "FULL-TIME "+eN+" "+fN+" "+lN+" "+g+" "+wL+" "+Integer.toString(dR)+".0"+" "+aS+"\n";
				    		   
				    		   try (Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(tempFile, true)))) {
							        out.write(writeInfo); 
							        }
							    catch (IOException e){
							            JOptionPane.showMessageDialog(null,e.getMessage());
							            }
							    catch(Exception e){
							            JOptionPane.showMessageDialog(null,e.getMessage());        
							    }
				    		   
				    	   } else {
				    		   String eN = textField_3.getText();
				    		   String fN = textField.getText();
				    		   String lN = textField_1.getText();
				    		   String wL = textField_2.getText();
				    		   String g = (String) comboBox.getSelectedItem();	
				    		   int dR = slider.getValue();
				    		   String hW = textField_4.getText();
				    		   String wH = formattedTextField_2.getText();
				    		   String yW = formattedTextField_4.getText();
				    		   
				    		   writeInfo = "PART-TIME "+eN+" "+fN+" "+lN+" "+g+" "+wL+" "+Integer.toString(dR)+".0"+" "+hW+" "+wH+" "+yW+"\n";
				    		   
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
				
				new getEmployee().setVisible(true);
				editEmployee.this.setVisible(false);
			}
			
		});
		
		comboBox_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if (comboBox_1.getSelectedIndex()==0) {
					lblAnnualSalary.setText("Annual Salary");
					textField_4.setBounds(450, 618, 720, 30);
					formattedTextField_2.setVisible(false);
					formattedTextField_4.setVisible(false);
					lblHpW.setVisible(false);
					lblWpY.setVisible(false);
				} else if (comboBox_1.getSelectedIndex()==1) {
					lblAnnualSalary.setText("Hourly Wage");
					textField_4.setBounds(450, 618, 180, 30);
					formattedTextField_2.setVisible(true);
					formattedTextField_4.setVisible(true);
					lblHpW.setVisible(true);
					lblWpY.setVisible(true);
				}
			}
		});
		
		comboBox_11.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if (((String) comboBox_11.getSelectedItem()).contains("PART")) {
					
					String[] itemSelect = ((String) comboBox_11.getSelectedItem()).split(" -");
					System.out.println("part-time");
					String search = itemSelect[0];
					
					comboBox_1.setVisible(true);
					comboBox_1.setSelectedIndex(1);
					textField_3.setVisible(true);
					textField.setVisible(true);
					textField_1.setVisible(true);
					textField_2.setVisible(true);
					comboBox.setVisible(true);
					slider.setVisible(true);
					textField_4.setVisible(true);
					textField_4.setBounds(450, 618, 180, 30);
					formattedTextField_2.setVisible(true);
					formattedTextField_4.setVisible(true);
					lblEmployeeNumber.setVisible(true);
					lblFirstName.setVisible(true);
					lblLastName.setVisible(true);
					lblWorkLocation.setVisible(true);
					lblDeduction.setVisible(true);
					lblAnnualSalary.setVisible(true);
					lblAnnualSalary.setText("Hourly Wage");
					lblHpW.setVisible(true);
					lblWpY.setVisible(true);
					btnNewButton.setVisible(true);
					
					try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Mashrur\\eclipse-workspace\\MyHashTable\\src\\InheritanceGUI\\"+login.c+".txt"))) {
					    String line;
					    while ((line = br.readLine()) != null) {
					       
					       if (line.contains(search)) {
					    	   String[] employeeInfo = line.split(" ");
					    	   String employeeNumber = employeeInfo[1];
						       String firstName = employeeInfo[2];
						       String lastName = employeeInfo[3];
						       String gender = employeeInfo[4];
						       String workLocation = employeeInfo[5];
						       String deductionRate = employeeInfo[6];
						       String hourlyWage = employeeInfo[7];
						       String hoursWeek = employeeInfo[8];
						       String weeksYear = employeeInfo[9];
						       
						       Double deductionRate1 = Double.parseDouble(deductionRate);
						       
						       textField_3.setText(employeeNumber);
						       textField.setText(firstName);
						       textField_1.setText(lastName);
						       textField_2.setText(workLocation);
						       slider.setValue(deductionRate1.intValue());
						       label.setText(deductionRate1+"0%");
						       textField_4.setText(hourlyWage);
						       formattedTextField_2.setText(hoursWeek);
						       formattedTextField_4.setText(weeksYear);
						       
						       if (gender.equals("Male")) {
						    	   comboBox.setSelectedIndex(1);
						       } else {
						    	   comboBox.setSelectedIndex(2);
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
					
				} else if (((String) comboBox_11.getSelectedItem()).contains("FULL")) {
					
					String[] itemSelect = ((String) comboBox_11.getSelectedItem()).split(" -");
					System.out.println("full-time");
					String search = itemSelect[0];
					
					comboBox_1.setVisible(true);
					comboBox_1.setSelectedIndex(0);
					textField_3.setVisible(true);
					textField.setVisible(true);
					textField_1.setVisible(true);
					textField_2.setVisible(true);
					comboBox.setVisible(true);
					slider.setVisible(true);
					textField_4.setVisible(true);
					textField_4.setBounds(450, 618, 720, 30);
					formattedTextField_2.setVisible(false);
					formattedTextField_4.setVisible(false);
					lblEmployeeNumber.setVisible(true);
					lblFirstName.setVisible(true);
					lblLastName.setVisible(true);
					lblWorkLocation.setVisible(true);
					lblDeduction.setVisible(true);
					lblAnnualSalary.setVisible(true);
					lblAnnualSalary.setText("Annual Salary");
					lblHpW.setVisible(false);
					lblWpY.setVisible(false);
					btnNewButton.setVisible(true);
					
					try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Mashrur\\eclipse-workspace\\MyHashTable\\src\\InheritanceGUI\\"+login.c+".txt"))) {
					    String line;
					    while ((line = br.readLine()) != null) {
					       
					       if (line.contains(search)) {
					    	   String[] employeeInfo = line.split(" ");
					    	   String employeeNumber = employeeInfo[1];
						       String firstName = employeeInfo[2];
						       String lastName = employeeInfo[3];
						       String gender = employeeInfo[4];
						       String workLocation = employeeInfo[5];
						       String deductionRate = employeeInfo[6];
						       String annualSalary = employeeInfo[7];
						       
						       Double deductionRate1 = Double.parseDouble(deductionRate);
						       
						       textField_3.setText(employeeNumber);
						       textField.setText(firstName);
						       textField_1.setText(lastName);
						       textField_2.setText(workLocation);
						       slider.setValue(deductionRate1.intValue());
						       label.setText(deductionRate1+"0%");
						       textField_4.setText(annualSalary);
						       
						       if (gender.equals("Male")) {
						    	   comboBox.setSelectedIndex(1);
						       } else {
						    	   comboBox.setSelectedIndex(2);
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
					
					
				} else {
					System.out.println("invalid");
					lblEmployeeNumber.setVisible(false);
					textField_3.setVisible(false);
					textField.setVisible(false);
					textField_1.setVisible(false);
					textField_2.setVisible(false);
					comboBox.setVisible(false);
					slider.setVisible(false);
					textField_4.setVisible(false);
					formattedTextField_2.setVisible(false);
					formattedTextField_4.setVisible(false);
					lblFirstName.setVisible(false);
					lblLastName.setVisible(false);
					lblWorkLocation.setVisible(false);
					lblDeduction.setVisible(false);
					lblAnnualSalary.setVisible(false);
					lblHpW.setVisible(false);
					lblWpY.setVisible(false);
					btnNewButton.setVisible(false);
				}
			}
		});
		
		File inputFile = new File("C:\\Users\\Mashrur\\eclipse-workspace\\MyHashTable\\src\\InheritanceGUI\\"+login.c+".txt");
		File tempFile = new File("C:\\Users\\Mashrur\\eclipse-workspace\\MyHashTable\\src\\InheritanceGUI\\tempFile.txt");

		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Mashrur\\eclipse-workspace\\MyHashTable\\src\\InheritanceGUI\\"+login.c+".txt"))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		    	
		       String[] employeeInfo = line.split(" ");
		       
		       String type = employeeInfo[0];
		       String employeeNumber = employeeInfo[1];
		       String firstName = employeeInfo[2];
		       String lastName = employeeInfo[3];
		       
		       String addCombo = employeeNumber+" - "+firstName+" "+lastName+", "+type;
		       comboBox_11.addItem(addCombo);

		    }
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
	}
		
		JButton btnLogOut = new JButton("");
		
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new login().setVisible(true);
				editEmployee.this.setVisible(false);
			}
		});
		
		btnLogOut.setBounds(64, 683, 295, 70);
		btnLogOut.setContentAreaFilled(false);
		btnLogOut.setBorder(null);
		contentPane.add(btnLogOut);
		
		JButton btnView = new JButton("");
		
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new getEmployee().setVisible(true);
				editEmployee.this.setVisible(false);
			}
		});
		
		btnView.setBounds(0, 563, 430, 85);
		btnView.setContentAreaFilled(false);
		btnView.setBorder(null);
		contentPane.add(btnView);
		
		JButton btnAdd = new JButton("");
		
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new editEmployee().setVisible(true);
				editEmployee.this.setVisible(false);
			}
		});
		
		btnAdd.setBounds(0, 359, 430, 97);
		btnAdd.setContentAreaFilled(false);
		btnAdd.setBorder(null);
		contentPane.add(btnAdd);
		
		JLabel circleName = new JLabel("");
		circleName.setText(login.c);
		circleName.setForeground(Color.WHITE);
		circleName.setHorizontalAlignment(SwingConstants.CENTER);
		circleName.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 45));
		circleName.setBounds(91, 139, 240, 70);
		contentPane.add(circleName);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Mashrur\\eclipse-workspace\\MyHashTable\\src\\InheritanceGUI\\sidebar.png"));
		lblNewLabel.setBounds(0, 0, 430, 761);
		contentPane.add(lblNewLabel);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Arial", Font.PLAIN, 17));
		textField_3.setBounds(450, 168, 720, 30);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		textField_3.setVisible(false);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Arial", Font.PLAIN, 17));
		textField_4.setColumns(10);
		textField_4.setBounds(450, 618, 720, 30);
		contentPane.add(textField_4);
		textField_4.setVisible(false);
	}
}
