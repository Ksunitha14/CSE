package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class login {

	private JFrame frame;
	private JTextField tb1;
	private JPasswordField p1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 255, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(0, 255, 255));
		lblNewLabel.setBounds(130, 21, 73, 36);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel textfield = new JLabel("Username");
		textfield.setForeground(new Color(255, 0, 128));
		textfield.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		textfield.setBounds(65, 86, 89, 14);
		frame.getContentPane().add(textfield);
		
		JLabel password1 = new JLabel("Password");
		password1.setForeground(new Color(255, 0, 128));
		password1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		password1.setBounds(65, 147, 81, 14);
		frame.getContentPane().add(password1);
		
		tb1 = new JTextField();
		tb1.setHorizontalAlignment(SwingConstants.LEFT);
		tb1.setBounds(178, 85, 134, 23);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		p1 = new JPasswordField();
		p1.setHorizontalAlignment(SwingConstants.CENTER);
		p1.setBounds(178, 145, 134, 23);
		frame.getContentPane().add(p1);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			  String user=tb1.getText();
			  String password=p1.getText();
			  //JOptionPane.showMessageDialog(btnNewButton, "hello"+user +"\n password is "+password);
			  if(user.equals("raju") && password.equals("1234"))
			  {
				  JOptionPane.showMessageDialog(btnNewButton, "valid user");
			  }
			  else
			  {
				  JOptionPane.showMessageDialog(btnNewButton, "invalid user");
			  }
				  
			}
			
		});
		btnNewButton.setBounds(130, 207, 112, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
