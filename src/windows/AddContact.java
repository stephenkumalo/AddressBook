package windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class AddContact extends JFrame {

	private JPanel contentPane;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JLabel lblLastName;
	private JLabel lblEmail;
	private JTextField txtEmailField;
	private JLabel lblAddress;
	private JTextField txtAddressField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddContact frame = new AddContact();
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
	public AddContact() {
		setTitle("New Contact");
		setBounds(100, 100, 272, 308);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		txtFirstName = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.WEST, txtFirstName, 83, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtFirstName, -205, SpringLayout.SOUTH, contentPane);
		contentPane.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.WEST, txtLastName, 0, SpringLayout.WEST, txtFirstName);
		contentPane.add(txtLastName);
		txtLastName.setColumns(10);
		
		JLabel lblFirstName = new JLabel("First Name");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblFirstName, 6, SpringLayout.NORTH, txtFirstName);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblFirstName, 10, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblFirstName, -5, SpringLayout.WEST, txtFirstName);
		contentPane.add(lblFirstName);
		
		lblLastName = new JLabel("Last Name");
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtLastName, -6, SpringLayout.NORTH, lblLastName);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblLastName, 24, SpringLayout.SOUTH, lblFirstName);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblLastName, 0, SpringLayout.WEST, lblFirstName);
		contentPane.add(lblLastName);
		
		lblEmail = new JLabel("Email");
		sl_contentPane.putConstraint(SpringLayout.EAST, lblEmail, 0, SpringLayout.EAST, lblFirstName);
		contentPane.add(lblEmail);
		
		txtEmailField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtEmailField, 11, SpringLayout.SOUTH, txtLastName);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblEmail, 6, SpringLayout.NORTH, txtEmailField);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtEmailField, 0, SpringLayout.WEST, txtFirstName);
		contentPane.add(txtEmailField);
		txtEmailField.setColumns(10);
		
		lblAddress = new JLabel("Address");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblAddress, 23, SpringLayout.SOUTH, lblEmail);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblAddress, 0, SpringLayout.EAST, lblFirstName);
		contentPane.add(lblAddress);
		
		txtAddressField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtAddressField, -6, SpringLayout.NORTH, lblAddress);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtAddressField, 0, SpringLayout.WEST, txtFirstName);
		contentPane.add(txtAddressField);
		txtAddressField.setColumns(10);
		
		JButton submitBtn = new JButton("Submit");
		submitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			    
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, submitBtn, 17, SpringLayout.SOUTH, txtAddressField);
		sl_contentPane.putConstraint(SpringLayout.WEST, submitBtn, 84, SpringLayout.WEST, contentPane);
		contentPane.add(submitBtn);
		
		JLabel lblNewContact = new JLabel("New Contact");
		lblNewContact.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewContact, 10, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewContact, 0, SpringLayout.WEST, lblFirstName);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewContact, -6, SpringLayout.NORTH, txtFirstName);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewContact, 0, SpringLayout.EAST, contentPane);
		contentPane.add(lblNewContact);
	}
}
