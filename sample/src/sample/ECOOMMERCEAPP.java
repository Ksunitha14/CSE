package sample;

import java.awt.EventQueue;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ECOOMMERCEAPP {

	private JFrame frame;
	int items=0;
	int bill=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ECOOMMERCEAPP window = new ECOOMMERCEAPP();
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
	public ECOOMMERCEAPP() {
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
		
		JLabel lblNewLabel = new JLabel("E COOMMERCE APP");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 24));
		lblNewLabel.setBounds(62, 0, 266, 45);
		frame.getContentPane().add(lblNewLabel);
		
		JButton l1 = new JButton("ECART:0");
		l1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		l1.setBackground(new Color(0, 128, 192));
		l1.setBounds(289, 36, 135, 23);
		frame.getContentPane().add(l1);
		
		JButton b1 = new JButton("");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				bill=bill+600;
				l1.setText("ECART:0"+items);
				
			}
		});
		b1.setIcon(new ImageIcon("C:\\Users\\ON LINE LAB\\Downloads\\download.jfif"));
		b1.setBounds(25, 69, 135, 161);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				bill=bill+500;
				l1.setText("ECART:0"+items);
			
			}
		});
		b2.setIcon(new ImageIcon("C:\\Users\\ON LINE LAB\\Downloads\\acvb.png"));
		b2.setBounds(189, 70, 151, 160);
		frame.getContentPane().add(b2);
		
		JLabel lblNewLabel_2 = new JLabel("RS.600/-");
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblNewLabel_2.setBounds(62, 241, 57, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("RS.500/-");
		lblNewLabel_3.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblNewLabel_3.setBounds(215, 241, 69, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton b3 = new JButton("BUY");
		b3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
		b3.setBackground(new Color(0, 255, 255));
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(b3,"number of items"+items+"\n total bill is" + bill);
				
			}
		});
		b3.setBounds(348, 227, 76, 23);
		frame.getContentPane().add(b3);
		
	}

}
