package info;

import java.awt.Color;
import static info.Adder.PostName1;
import static info.Adder.PostName2;
import static info.Adder.PostAddy;
import static info.Adder.PostEmail;
import static info.Adder.PostAge;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class ShowInfo implements ActionListener  {

	
	
	
	public JFrame Showframe;
	
	
	
	
	public void actionPerformed(ActionEvent e) {
		
		showPane();

	}

	
	
	
	public void showPane(){
		
		
		
		
		
        Showframe = new JFrame("User Info");
		
        Showframe.setBounds(400, 200, 400, 400);
		
        Showframe.setAlwaysOnTop(true);
		
        Showframe.setResizable(false);
		
        Showframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
        Showframe.getContentPane().setLayout(null);
	    
        Showframe.setTitle("User Info");
	    
        Showframe.getContentPane().setBackground(Color.WHITE);
        
        JLabel lblUsersFirstName = new JLabel("Users First Name: " + PostName1);
        lblUsersFirstName.setBounds(20, 56, 173, 21);
        Showframe.getContentPane().add(lblUsersFirstName);
        
        JLabel lblUsersLastName = new JLabel("Users Last Name: " + PostName2);
        lblUsersLastName.setBounds(20, 86, 178, 21);
        Showframe.getContentPane().add(lblUsersLastName);
        
        JLabel lblUsersAddress = new JLabel("Users Address: " + PostAddy);
        lblUsersAddress.setBounds(20, 118, 173, 21);
        Showframe.getContentPane().add(lblUsersAddress);
        
        JLabel lblUsersAge = new JLabel("Users Age: " + PostAge);
        lblUsersAge.setBounds(20, 220, 173, 21);
        Showframe.getContentPane().add(lblUsersAge);
        
        JLabel lblUsersEmail = new JLabel("Users Email: " + PostEmail);
        lblUsersEmail.setBounds(20, 166, 173, 21);
        Showframe.getContentPane().add(lblUsersEmail);
		
		
		
		
		
		
		
		
		Showframe.setVisible(true);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
