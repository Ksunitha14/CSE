package sample;

import java.awt.EventQueue;


import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class REGISTRATION {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					REGISTRATION window = new REGISTRATION();
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
	public REGISTRATION() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 128, 192));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTRATION");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(107, 11, 154, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel tb1 = new JLabel("username");
		tb1.setForeground(new Color(0, 0, 0));
		tb1.setFont(new Font("Verdana", Font.ITALIC, 15));
		tb1.setBounds(71, 53, 79, 14);
		frame.getContentPane().add(tb1);
		
		JLabel p1 = new JLabel("password");
		p1.setForeground(new Color(0, 0, 0));
		p1.setFont(new Font("Verdana", Font.ITALIC, 15));
		p1.setBounds(71, 92, 79, 18);
		frame.getContentPane().add(p1);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(177, 50, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setBounds(177, 90, 86, 20);
		frame.getContentPane().add(passwordField);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"CSE", "ECE", "IT", "EEE", "AIML"}));
		cb1.setBounds(177, 133, 55, 22);
		frame.getContentPane().add(cb1);
		
		JLabel lblNewLabel_3 = new JLabel("Branch");
		lblNewLabel_3.setFont(new Font("Verdana", Font.ITALIC, 15));
		lblNewLabel_3.setBounds(70, 136, 65, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Gender");
		lblNewLabel_4.setFont(new Font("Verdana", Font.ITALIC, 15));
		lblNewLabel_4.setBounds(70, 181, 65, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JRadioButton r1 = new JRadioButton("MALE");
		r1.setForeground(new Color(255, 0, 0));
		r1.setBounds(177, 178, 70, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("FEMALE");
		r2.setForeground(new Color(255, 0, 0));
		r2.setBounds(259, 179, 70, 23);
		frame.getContentPane().add(r2);
		ButtonGroup rgb=new ButtonGroup();
		rgb.add(r1);
		rgb.add(r2);
		
		JLabel lblNewLabel_5 = new JLabel("City");
		lblNewLabel_5.setFont(new Font("Verdana", Font.ITALIC, 15));
		lblNewLabel_5.setBounds(80, 209, 43, 19);
		frame.getContentPane().add(lblNewLabel_5);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"HYD", "VJA", "BEN", "MUM"}));
		cb2.setBounds(177, 209, 55, 22);
		frame.getContentPane().add(cb2);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String user=textField.getText();
			String branch=(String) cb1.getSelectedItem();
			String City=(String) cb2.getSelectedItem();
			
			String gender="";
			if(r1.isSelected())
			{
				gender="Male";
			}
			if(r2.isSelected())
			{
				gender="Female";
			}
			JOptionPane.showMessageDialog(btnNewButton,"name"+user+"\n Branch" +branch+ "\nCity" +City+"\n Gender"+gender);
			}
		});
		btnNewButton.setBounds(120, 238, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
