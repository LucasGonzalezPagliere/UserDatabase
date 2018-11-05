package info;

import static info.Window.txtFirst;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Window {

	static public JFrame frmInout;
	static public JTextField txtFirst;
	static public  JTextField txtLatnmae;
	static public  JTextField txtAdress;
	static public  JTextField txtEmail;
	static public  JTextField txtAge;
	static public  JLabel lblNewLabel;
	
	static public String Fname = "";
	static public String Lname = "";
	static public String Addy = "";
	static public String Email = "";
	static public String Age = "";
	static public JMenu mnUsers;
	private JMenu mnTesttt2;
	private JMenuBar menuBar;
	static public JMenu mnUsers_1;
	private JMenuItem mntmTest;
	
	public Window(){
		
		frmInout = new JFrame("Login");
		frmInout.setTitle("ID");
		SpringLayout springLayout = new SpringLayout();
		frmInout.getContentPane().setLayout(springLayout);
		
		txtFirst = new JTextField();
		txtFirst.setText("First Name");
		
		
		//Fname = txtFirst.getText();
		
		
		springLayout.putConstraint(SpringLayout.NORTH, txtFirst, 48, SpringLayout.NORTH, frmInout.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, txtFirst, 10, SpringLayout.WEST, frmInout.getContentPane());
		frmInout.getContentPane().add(txtFirst);
		txtFirst.setColumns(10);
		
		JLabel lblPleaseInputYour = new JLabel("Please Input your Data");
		springLayout.putConstraint(SpringLayout.NORTH, lblPleaseInputYour, 10, SpringLayout.NORTH, frmInout.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblPleaseInputYour, 10, SpringLayout.WEST, frmInout.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblPleaseInputYour, 38, SpringLayout.NORTH, frmInout.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblPleaseInputYour, 280, SpringLayout.WEST, frmInout.getContentPane());
		frmInout.getContentPane().add(lblPleaseInputYour);
		
		txtLatnmae = new JTextField();
		
		
		//Lname = txtLatnmae.getText();
		
		
		springLayout.putConstraint(SpringLayout.NORTH, txtLatnmae, 17, SpringLayout.SOUTH, txtFirst);
		springLayout.putConstraint(SpringLayout.WEST, txtLatnmae, 0, SpringLayout.WEST, txtFirst);
		txtLatnmae.setText("Last Name");
		frmInout.getContentPane().add(txtLatnmae);
		txtLatnmae.setColumns(10);
		
		txtAdress = new JTextField();
		
		
		 //Addy = txtAdress.getText();
		
		
		springLayout.putConstraint(SpringLayout.NORTH, txtAdress, 19, SpringLayout.SOUTH, txtLatnmae);
		springLayout.putConstraint(SpringLayout.EAST, txtAdress, 0, SpringLayout.EAST, txtFirst);
		txtAdress.setText("Address");
		frmInout.getContentPane().add(txtAdress);
		txtAdress.setColumns(10);
		
		txtEmail = new JTextField();
		
		
		 //Email = txtEmail.getText();
		
		
		springLayout.putConstraint(SpringLayout.NORTH, txtEmail, 18, SpringLayout.SOUTH, txtAdress);
		springLayout.putConstraint(SpringLayout.EAST, txtEmail, 0, SpringLayout.EAST, txtFirst);
		txtEmail.setText("Email");
		frmInout.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		txtAge = new JTextField();
		
		
		// Age = txtAge.getText();
		
		
		springLayout.putConstraint(SpringLayout.NORTH, txtAge, 19, SpringLayout.SOUTH, txtEmail);
		springLayout.putConstraint(SpringLayout.EAST, txtAge, 0, SpringLayout.EAST, txtFirst);
		txtAge.setText("Age");
		frmInout.getContentPane().add(txtAge);
		txtAge.setColumns(10);
		
		JButton btnNewButton = new JButton("Add");
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 11, SpringLayout.SOUTH, txtAge);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 61, SpringLayout.WEST, frmInout.getContentPane());
		btnNewButton.addActionListener(new Adder());
			
		frmInout.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1, 0, SpringLayout.NORTH, btnNewButton);
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_1, -72, SpringLayout.EAST, frmInout.getContentPane());
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frmInout.dispose();
			}
		});
		frmInout.getContentPane().add(btnNewButton_1);
		
		lblNewLabel = new JLabel("");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 0, SpringLayout.NORTH, txtFirst);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 39, SpringLayout.EAST, txtFirst);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, -29, SpringLayout.SOUTH, txtAge);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, 16, SpringLayout.EAST, lblPleaseInputYour);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\FamilyPC\\Pictures\\IDSIGN.png"));
		frmInout.getContentPane().add(lblNewLabel);
		
		
		
		frmInout.setBounds(500, 200, 312, 326);
		frmInout.setResizable(false);
		
		menuBar = new JMenuBar();
		frmInout.setJMenuBar(menuBar);
		
		mnUsers_1 = new JMenu("Users");
		menuBar.add(mnUsers_1);
		
		//mntmTest = new JMenuItem("Test");
		//mnUsers_1.add(mntmTest);
		
		
		frmInout.setVisible(true);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
