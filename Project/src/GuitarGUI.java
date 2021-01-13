import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class GuitarGUI extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField FirstName;
	private JTextField LastName;
	private JTextField SessionTime;
	private JTable table;
	private JTextField Race;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuitarGUI frame = new GuitarGUI();
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
	public GuitarGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1200, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(139, 69, 19)));
		panel.setBounds(10, 11, 1174, 650);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(43, 126, 117, 25);
		panel.add(lblNewLabel_1);
		
		JLabel lblCustomerId = new JLabel("Last Name");
		lblCustomerId.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblCustomerId.setBounds(43, 162, 117, 25);
		panel.add(lblCustomerId);
		
		JLabel lblPostcode = new JLabel("SessionTime");
		lblPostcode.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPostcode.setBounds(43, 234, 117, 25);
		panel.add(lblPostcode);
		
		JLabel lblAddress = new JLabel("Race");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblAddress.setBounds(43, 198, 91, 25);
		panel.add(lblAddress);
		
		FirstName = new JTextField();
		FirstName.setBounds(170, 126, 149, 25);
		panel.add(FirstName);
		FirstName.setColumns(10);
		
		LastName = new JTextField();
		LastName.setColumns(10);
		LastName.setBounds(170, 167, 149, 25);
		panel.add(LastName);
		
		SessionTime = new JTextField();
		SessionTime.setColumns(10);
		SessionTime.setBounds(170, 239, 149, 25);
		panel.add(SessionTime);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(458, 154, 529, 335);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"First Name", "Last Name", "Race", "Session Time", "Song"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setFont(new Font("Sitka Subheading", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						FirstName.getText(),
						LastName.getText(),
						Race.getText(),
						SessionTime.getText(),
						
					
		
				
				});
				
				if (table.getSelectedRow() == -1) {
					if(table.getRowCount()== 0) {
						JOptionPane.showMessageDialog(null, "Information Update!","Customer Information System",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
			
		
		btnNewButton.setBounds(47, 438, 127, 38);
		panel.add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Sitka Subheading", Font.PLAIN, 16));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FirstName.setText("");
				LastName.setText("");
				Race.setText("");
				SessionTime.setText("");
			
				
			
			
				
	
				
			}
		});
		btnReset.setBounds(47, 536, 127, 38);
		panel.add(btnReset);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Sitka Subheading", Font.PLAIN, 16));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null, "No data available","Customer Information System",
								JOptionPane.OK_OPTION);}
					else {
						JOptionPane.showMessageDialog(null, "Select a row to delete","Customer Information System",
								JOptionPane.OK_OPTION);}
				}
				
					else {
						model.removeRow(table.getSelectedRow());
						
					
				}
			}
		});
		btnDelete.setBounds(47, 487, 127, 38);
		panel.add(btnDelete);
		
		JLabel lblNewLabel_2 = new JLabel("GUITAR CLASS LESSON");
		lblNewLabel_2.setFont(new Font("Rockwell", Font.BOLD, 30));
		lblNewLabel_2.setBounds(367, 22, 637, 25);
		panel.add(lblNewLabel_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(119, 136, 153));
		panel_4.setBounds(367, 46, 428, 1);
		panel.add(panel_4);
		
		Race = new JTextField();
		Race.setColumns(10);
		Race.setBounds(170, 203, 149, 25);
		panel.add(Race);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(50, 70, 177, 45);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Your Information");
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(71, 601, 89, 23);
		panel.add(btnNewButton_1);
		
		JComboBox Song = new JComboBox();
		Song.setModel(new DefaultComboBoxModel(new String[] {"Select", "Hey Jude", "Canon"}));
		Song.setBounds(170, 275, 149, 20);
		panel.add(Song);
		
		JLabel lblSong = new JLabel("Song");
		lblSong.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblSong.setBounds(43, 270, 117, 25);
		panel.add(lblSong);
	}
}
