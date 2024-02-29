package sample;

import java.awt.EventQueue;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class movieapps {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					movieapps window = new movieapps();
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
	public movieapps() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ON LINE LAB\\Downloads\\movieticket.png"));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("movieapp");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 29));
		lblNewLabel.setBounds(101, 11, 143, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("name");
		lblNewLabel_1.setForeground(new Color(128, 128, 255));
		lblNewLabel_1.setBackground(new Color(0, 0, 255));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblNewLabel_1.setBounds(36, 79, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tb1 = new JTextField();
		tb1.setBounds(204, 78, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Movie");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblNewLabel_2.setForeground(new Color(128, 128, 255));
		lblNewLabel_2.setBounds(36, 123, 61, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SALAR", "RRR", "MAD", "HANUMAN", "HII NANNNA"}));
		cb1.setBounds(204, 121, 86, 22);
		frame.getContentPane().add(cb1);
		
		JLabel lblNewLabel_3 = new JLabel("No of tickets");
		lblNewLabel_3.setForeground(new Color(128, 128, 255));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblNewLabel_3.setBounds(36, 168, 111, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7"}));
		cb2.setBounds(204, 166, 61, 22);
		frame.getContentPane().add(cb2);
		
		JButton btnNewButton = new JButton("BOOK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				String user=tb1.getText();
				String movie=(String) cb1.getSelectedItem();
				String tickets=(String) cb2 .getSelectedItem();
				int nt=Integer.parseInt(tickets);
				int bill=0;
				if(movie.equals("SALAR"))
				{
					bill=nt*300;
				}
				if(movie.equals("RRR"))
				{
					bill=nt*350;
				}
				if(movie.equals("MAD"))
				{
					bill=nt*150;
				}
				if(movie.equals("HANUMAN"))
				{
					bill=nt*200;
				}
				if(movie.equals("HII NANNA"))
				{
					bill=nt*250;
				}
				int res=0;
				res=JOptionPane.showConfirmDialog(btnNewButton, "name"+user+"\nmovie"+movie+"\nNo of tickets"+tickets+"\nBill is"+bill);
				if(res==JOptionPane.YES_OPTION)
				{
					JOptionPane.showMessageDialog(btnNewButton, "Booking Confirmed");
					tb1.setText("");
					cb1.setSelectedItem("");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "Booking Cancelled");
					
				}
				
				
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnNewButton.setBounds(124, 199, 120, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\ON LINE LAB\\Downloads\\movieticket.png"));
		lblNewLabel_4.setBounds(10, 3, 404, 250);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(300, 56, 116, 197);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(10, 3, 404, 250);
		frame.getContentPane().add(lblNewLabel_6);
	}
}
