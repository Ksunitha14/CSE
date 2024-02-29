package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class newlogin1 {

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
					newlogin1 window = new newlogin1();
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
	public newlogin1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 128, 0));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN PAGE WITH DB CONNECTION");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(54, 23, 337, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("login");
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1.setBounds(54, 92, 43, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("password");
		lblNewLabel_2.setForeground(new Color(0, 0, 255));
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_2.setBounds(52, 155, 80, 19);
		frame.getContentPane().add(lblNewLabel_2);
		
		tb1 = new JTextField();
		tb1.setBounds(190, 94, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		p1 = new JPasswordField();
		p1.setBounds(190, 156, 86, 20);
		frame.getContentPane().add(p1);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String password=p1.getText();
				try
				{
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","mrec");
					PreparedStatement stn=con.prepareStatement("select name,password from users where name=? and password=?");
					stn.setString(1, name);
					stn.setString(2, password);
					ResultSet rs=stn.executeQuery();
					if(rs.next()) 
					{
						JOptionPane.showMessageDialog(btnNewButton, "validuser");
						
					}
					else
					{
						JOptionPane.showMessageDialog(btnNewButton, "Invaliduser");
					}
					
				}
				catch(SQLException e1)
				{
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 16));
		btnNewButton.setBounds(103, 210, 110, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
