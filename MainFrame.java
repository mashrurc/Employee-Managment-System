package InheritanceGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JInternalFrame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Font;
import javax.swing.JMenu;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Cursor;
import javax.swing.border.MatteBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.ImageIcon;
import java.awt.Point;
import java.awt.Window;
import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	protected Window frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public MainFrame() throws FileNotFoundException, IOException {
		
		//ContentPane Attributes
		setBackground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(220, 30, 1207, 800);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Main Menu Title
		JLabel lblMenuTitle = new JLabel("");
		System.out.println(login.c);
		lblMenuTitle.setText(login.c);
		lblMenuTitle.setBackground(new Color(255, 255, 255));
		lblMenuTitle.setBorder(null);
		lblMenuTitle.setFont(new Font("Arial", Font.BOLD, 21));
		lblMenuTitle.setForeground(Color.WHITE);
		lblMenuTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuTitle.setBounds(10, 11, 636, 50);
		contentPane.add(lblMenuTitle);
		
		JButton btnAddEmployee = new JButton("");
		btnAddEmployee.setMargin(new Insets(2, 2, 2, 3));
		btnAddEmployee.setIcon(new ImageIcon(MainFrame.class.getResource("/InheritanceGUI/plus.png")));
		//btnAddEmployee.setIcon(new ImageIcon(MainFrame.class.getResource("/plus.png")));
		btnAddEmployee.setFocusable(false);
		btnAddEmployee.setForeground(Color.DARK_GRAY);
		btnAddEmployee.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAddEmployee.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnAddEmployee.setBackground(Color.WHITE);
		btnAddEmployee.setBounds(0, 361, 430, 92);
		btnAddEmployee.setOpaque(false);
		btnAddEmployee.setBorder(null);
		contentPane.add(btnAddEmployee);
		
		JButton btnGetEmployee = new JButton("");
		btnGetEmployee.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new getEmployee().setVisible(true);
				MainFrame.this.setVisible(false);
			}
		});
		btnGetEmployee.setFocusable(false);
		btnGetEmployee.setForeground(Color.DARK_GRAY);
		btnGetEmployee.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnGetEmployee.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnGetEmployee.setBackground(Color.WHITE);
		btnGetEmployee.setBounds(587, 522, 200, 50);
		contentPane.add(btnGetEmployee);
		
		JButton btnEditEmployee = new JButton("");
		btnEditEmployee.setFocusable(false);
		btnEditEmployee.setForeground(Color.DARK_GRAY);
		btnEditEmployee.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnEditEmployee.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnEditEmployee.setBackground(Color.WHITE);
		btnEditEmployee.setBounds(0, 456, 430, 100);
		btnEditEmployee.setOpaque(false);
		btnEditEmployee.setBorder(null);
		contentPane.add(btnEditEmployee);
		
		JButton btnExit = new JButton("");
		btnExit.setFocusable(false);
		btnExit.setForeground(new Color(178, 34, 34));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnExit.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnExit.setBackground(Color.WHITE);
		btnExit.setBounds(616, 327, 125, 50);
		contentPane.add(btnExit);
		
		JButton button = new JButton("REMOVE EMPLOYEE");
		button.setMargin(new Insets(2, 2, 2, 3));
		button.setForeground(Color.DARK_GRAY);
		button.setFont(new Font("Tahoma", Font.BOLD, 16));
		button.setFocusable(false);
		button.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		button.setBackground(Color.WHITE);
		button.setBounds(748, 155, 200, 50);
		contentPane.add(button);
		
		JButton btnLogOut = new JButton("log out");
		btnLogOut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new login().setVisible(true);
				MainFrame.this.setVisible(false);
			}
		});
		btnLogOut.setForeground(new Color(178, 34, 34));
		btnLogOut.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnLogOut.setFocusable(false);
		btnLogOut.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnLogOut.setBackground(Color.WHITE);
		btnLogOut.setBounds(861, 327, 125, 50);
		contentPane.add(btnLogOut);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Mashrur\\eclipse-workspace\\MyHashTable\\src\\InheritanceGUI\\sidebar.png"));
		lblNewLabel.setBounds(0, 0, 430, 761);
		contentPane.add(lblNewLabel);
				
		btnAddEmployee.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new addEmployee().setVisible(true);
				MainFrame.this.setVisible(false);
			}
		});
		
		
		button.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				new removeEmployee().setVisible(true);
				MainFrame.this.setVisible(false);
				
			}
		});


	}
}