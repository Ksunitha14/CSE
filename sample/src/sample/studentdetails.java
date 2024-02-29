package sample;

import java.awt.EventQueue;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class studentdetails {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;
	private JTextField tb3;
	private JTextField tb4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentdetails window = new studentdetails();
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
	public studentdetails() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT DETAILS");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(92, 11, 180, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setBounds(65, 58, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ID");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblNewLabel_2.setBounds(65, 98, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("ADDRESS");
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		lblNewLabel_3.setBounds(65, 146, 63, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("MARKS");
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		lblNewLabel_4.setBounds(65, 188, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		tb1 = new JTextField();
		tb1.setForeground(new Color(192, 192, 192));
		tb1.setBounds(175, 55, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setForeground(new Color(192, 192, 192));
		tb2.setBounds(175, 98, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		tb3 = new JTextField();
		tb3.setForeground(new Color(192, 192, 192));
		tb3.setBounds(175, 143, 86, 20);
		frame.getContentPane().add(tb3);
		tb3.setColumns(10);
		
		tb4 = new JTextField();
		tb4.setForeground(new Color(192, 192, 192));
		tb4.setBounds(175, 185, 86, 20);
		frame.getContentPane().add(tb4);
		tb4.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String id=tb2.getText();
				String address=tb3.getText();
				String marks=tb4.getText();
				int m=Integer.parseInt(marks);
				try 
				{
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","mrec");
					String q="insert into students values('"+name+"','"+id+"','"+address+"','"+m+"')";
					Statement sta=con.createStatement();
					sta.executeUpdate(q);
					con.close();
					JOptionPane.showMessageDialog(btnNewButton,"Successful");
				 }
				catch(SQLException e1)
				{
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(291, 215, 99, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\ON LINE LAB\\Downloads\\STUDENT.png"));
		lblNewLabel_5.setBounds(10, 0, 424, 261);
		frame.getContentPane().add(lblNewLabel_5);
	}
}
