package InheritanceGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Cursor;
import javax.swing.JPasswordField;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JPasswordField password;
	static String c = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(220, 30, 1207, 831);
		contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(50, 50, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn = new JButton("");
		btn.setFocusable(false);
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String wUser = username.getText();
				String wPass = new String(password.getPassword());
				
				boolean found = false;
				
				try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Mashrur\\eclipse-workspace\\MyHashTable\\src\\InheritanceGUI\\logins.txt"))) {
				    String line;
				    try {
						while ((line = br.readLine()) != null) {
						   String[] loginid = line.split(":");
						   
						   //System.out.println(wUser+loginid[0]);
						   //System.out.println(wPass+loginid[1]);

						   if (wUser.equals(loginid[0]) && wPass.equals(loginid[1])) {
							   	System.out.println("LOGIN");
							   	c = wUser;
							   	found = true;
							   	new getEmployee().setVisible(true);
								login.this.setVisible(false);
						   }
						   
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				
			if (found==false) {
				   JOptionPane.showMessageDialog(null, 
	                        "Incorrect Username or Password!", 
	                        "Invalid Credentials", 
	                        JOptionPane.WARNING_MESSAGE);   
			}
			}
		});
		
		username = new JTextField();
		username.setDisabledTextColor(Color.WHITE);
		username.setCaretColor(Color.WHITE);
		username.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		username.setForeground(Color.WHITE);
		username.setFont(new Font("Arial", Font.BOLD, 28));
		username.setBounds(705, 268, 437, 40);
		username.setOpaque(false);
		username.setBorder(null);
		contentPane.add(username);
		
		password = new JPasswordField();
		password.setFont(new Font("Arial", Font.BOLD, 28));
		password.setDisabledTextColor(Color.WHITE);
		password.setCaretColor(Color.WHITE);
		password.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		password.setForeground(Color.WHITE);
		password.setOpaque(false);
		password.setBorder(null);
		password.setBounds(705, 438, 437, 49);
		contentPane.add(password);
		
		JButton signup = new JButton("");
		signup.setFocusable(false);
		signup.setContentAreaFilled(false);
		signup.setBorder(null);
		signup.setBounds(905, 713, 86, 27);
		contentPane.add(signup);
		
		
		btn.setBounds(769, 620, 203, 73);
		btn.setContentAreaFilled(false);
		btn.setBorder(null);
		contentPane.add(btn);
		
		JLabel lblNewLabel = new JLabel("New label");
		signup.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new signup().setVisible(true);
				login.this.setVisible(false);
			}
		});
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Mashrur\\eclipse-workspace\\MyHashTable\\src\\InheritanceGUI\\login.png"));
		lblNewLabel.setBounds(0, 0, 1200, 800);
		contentPane.add(lblNewLabel);


        
	}
}
