import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class Edu extends JFrame {

	private JPanel contentPane;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Edu frame = new Edu();
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
	public Edu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Guitar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				GuitarGUI guitar = new GuitarGUI();
				guitar.setVisible(true);
				guitar.toFront();
			}
		});
		btnNewButton.setBounds(29, 178, 131, 40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Al Quran");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FileIOandArraylist f1= new FileIOandArraylist();
				f1.setVisible(true);
			
			}
		});
		btnNewButton_1.setBounds(269, 178, 131, 40);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("EDUCATION LEARNING SYSTEM");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel.setBounds(92, 35, 264, 31);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("Java");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System f3= new System();
				f3.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(29, 109, 131, 40);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Planting");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Plantingf4 f4 = new Plantingf4(null, rootPaneCheckingEnabled);
				f4.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(269, 109, 131, 40);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Exit");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(JOptionPane.showConfirmDialog(null, "Confirm if you want to exit","Education Learning System",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
				dispose();
			}
		});
		btnNewButton_4.setBounds(172, 227, 89, 23);
		contentPane.add(btnNewButton_4);
	}
}
