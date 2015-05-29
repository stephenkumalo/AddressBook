package windows;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTable;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class MainWindow extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabs = new JTabbedPane();
	private int addContactPane = 0;
	private JTextField textField;
	private JTextField textField_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
 /*   private void displayAddContactTab(Container pane){

    	JPanel AddContact = new JPanel();
		 AddContact.add(new JButton("Submit"));
		 AddContact.add(new JButton( "Cancel"));
		 AddContact.setv
		 tabs.add(AddContact,"Add Contact");
		 pane.add(tabs.setBou);
		 addContactPane++;
    }
    	*/
	/**
	 * Create the frame.
	 */
	public MainWindow() {
		setTitle("AddressBook");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		 

		JButton btnNewContact = new JButton("Add Contact");
		btnNewContact.setBounds(17, 21, 200, 135);
		btnNewContact.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			   EventQueue.invokeLater(new Runnable( ){
				   public void start ( ){
					    
				   }

				@Override
				public void run() {
					// TODO Auto-generated method stub
					try{
				    	AddContact addcontact = new AddContact();
				    	addcontact.setVisible(true);
				    }catch(Exception e){
				    	e.printStackTrace();
				    }
				}
			   });
			
		}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewContact);
		
		JButton btnDisplayContacts = new JButton("All Contacts");
		btnDisplayContacts.setBounds(229, 21, 200, 135);
		Runnable  run =null;
		btnDisplayContacts.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
			
			}
					
				}
			
		);
		contentPane.add(btnDisplayContacts);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(27, 155, 402, 12);
		contentPane.add(separator);
		
		textField = new JTextField();
		textField.setBounds(92, 204, 200, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setBounds(17, 210, 140, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Search Contact");
		lblNewLabel_1.setFont(new Font("Monaco", Font.PLAIN, 23));
		lblNewLabel_1.setBounds(27, 168, 290, 35);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(92, 238, 200, 28);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(17, 244, 79, 16);
		contentPane.add(lblLastName);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(304, 204, 125, 56);
		contentPane.add(btnSearch);
	}
}
