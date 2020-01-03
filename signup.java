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
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Cursor;
import javax.swing.JPasswordField;

public class signup extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signup frame = new signup();
					frame.setTitle("Database Sign-Up");
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
	public signup() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(220, 30, 1207, 831);
		contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(50, 50, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn = new JButton("");
		btn.setFocusable(false);
		
		username = new JTextField();
		username.setText("COMPANY NAME");
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
		password.setText("PASSWORD");
		password.setFont(new Font("Arial", Font.BOLD, 28));
		password.setDisabledTextColor(Color.WHITE);
		password.setCaretColor(Color.WHITE);
		password.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		password.setForeground(Color.WHITE);
		password.setOpaque(false);
		password.setBorder(null);
		password.setBounds(705, 438, 437, 49);
		contentPane.add(password);
		
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String wUser = username.getText();
				String wPass = new String(password.getPassword());
				
				try (Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\Mashrur\\eclipse-workspace\\MyHashTable\\src\\InheritanceGUI\\logins.txt", true)))) {
			        out.write(wUser+":"+wPass+"\n"); 
			        out.close();
			        }
			    catch (IOException e){
			            JOptionPane.showMessageDialog(null,e.getMessage());
			            }
			    catch(Exception e){
			            JOptionPane.showMessageDialog(null,e.getMessage());        
			    }
				
				try {
					PrintWriter writer = new PrintWriter("C:\\Users\\Mashrur\\eclipse-workspace\\MyHashTable\\src\\InheritanceGUI\\"+wUser+".txt", "UTF-8");
				} catch (FileNotFoundException | UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				new login().setVisible(true);
				signup.this.setVisible(false);
			}
		});
		
		JButton login = new JButton("");
		login.setFocusable(false);
		login.setContentAreaFilled(false);
		login.setBorder(null);
		login.setBounds(989, 712, 70, 27);
		contentPane.add(login);
		
		login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new login().setVisible(true);
				signup.this.setVisible(false);
			}
		});
		
		btn.setBounds(769, 620, 203, 73);
		btn.setContentAreaFilled(false);
		btn.setBorder(null);
		contentPane.add(btn);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Mashrur\\eclipse-workspace\\MyHashTable\\src\\InheritanceGUI\\signup.png"));
		lblNewLabel.setBounds(0, 0, 1200, 800);
		contentPane.add(lblNewLabel);


        
	}
}
