package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class METROTICKETBOOKING {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					METROTICKETBOOKING window = new METROTICKETBOOKING();
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
	public METROTICKETBOOKING() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("METRO APP");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(152, 11, 157, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_1.setBounds(176, 70, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tb1 = new JTextField();
		tb1.setBackground(new Color(255, 255, 255));
		tb1.setForeground(new Color(0, 0, 0));
		tb1.setBounds(296, 67, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("source");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_2.setBounds(192, 118, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"MYP", "JNTU", "KPHB", "AMP", "SEC"}));
		cb1.setBounds(295, 114, 87, 22);
		frame.getContentPane().add(cb1);
		
		JLabel lblNewLabel_3 = new JLabel("Destination");
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_3.setBounds(188, 168, 77, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"MGBS", "LBNAGAR", "HTECH", "NAGOL", "DISHKNAGAR"}));
		cb2.setBounds(295, 164, 87, 22);
		frame.getContentPane().add(cb2);
		
		JLabel lblNewLabel_4 = new JLabel("No of tickets");
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_4.setBounds(171, 204, 77, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox cb3 = new JComboBox();
		cb3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		cb3.setBounds(329, 200, 53, 22);
		frame.getContentPane().add(cb3);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String source=(String) cb1.getSelectedItem();
				String destination=(String) cb2.getSelectedItem();
				String tickets=(String)cb3.getSelectedItem();
				int nt=Integer.parseInt(tickets);
				int bill=0;
				if(source.equals(destination))
				{
					JOptionPane.showConfirmDialog(btnNewButton,"please check stations" );
				
				}
				else
				{
					bill=bill=45*nt;
					JOptionPane.showMessageDialog(btnNewButton, "name" +name+ "\nsource" +source+ "\ndestination" +destination+ "\nNo of tickets" +nt+ "\nammount" + bill);
					
				}
				
				
			}
		});
		btnNewButton.setBounds(220, 229, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBackground(new Color(255, 255, 255));
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\ON LINE LAB\\Downloads\\logo2.jfif"));
		lblNewLabel_5.setBounds(0, 11, 434, 250);
		frame.getContentPane().add(lblNewLabel_5);
	}

}
