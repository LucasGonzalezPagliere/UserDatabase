package info;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import static info.Adder.PostAddy;
import static info.Adder.PostAge;
import static info.Adder.PostEmail;
import static info.Adder.PostName1;
import static info.Adder.PostName2;
import static info.Adder.s;

import static info.ThatClass.UserList;

public class JListDoer implements ActionListener {

	public JFrame Showframe;
	
	public void actionPerformed(ActionEvent arg0) {


		
		//for(int f =0; f<s.length; f++){
		//if(s[f].isArmed()){
			//	System.out.println("User" + namer + " was clicked");
				
			//	f = s.length;
			//}
			
		//}
		
		
		if(s[0].isArmed()){
			System.out.println("User1 was clicked");
	
				
		        Showframe = new JFrame("User Info");
				
		        Showframe.setBounds(400, 200, 400, 400);
				
		        Showframe.setAlwaysOnTop(true);
				
		        Showframe.setResizable(false);
				
		        Showframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				
		        Showframe.getContentPane().setLayout(null);
			    
		        Showframe.setTitle("User Info");
			    
		        Showframe.getContentPane().setBackground(Color.WHITE);
		        
		        JLabel lblUsersFirstName = new JLabel("Users First Name: " + UserList.get(0).get(0));
		        lblUsersFirstName.setBounds(20, 56, 173, 21);
		        Showframe.getContentPane().add(lblUsersFirstName);
		        
		        JLabel lblUsersLastName = new JLabel("Users Last Name: " + UserList.get(0).get(1));
		        lblUsersLastName.setBounds(20, 86, 178, 21);
		        Showframe.getContentPane().add(lblUsersLastName);
		        
		        JLabel lblUsersAddress = new JLabel("Users Address: " + UserList.get(0).get(2));
		        lblUsersAddress.setBounds(20, 118, 173, 21);
		        Showframe.getContentPane().add(lblUsersAddress);
		        
		        JLabel lblUsersAge = new JLabel("Users Age: " + UserList.get(0).get(4));
		        lblUsersAge.setBounds(20, 220, 173, 21);
		        Showframe.getContentPane().add(lblUsersAge);
		        
		        JLabel lblUsersEmail = new JLabel("Users Email: " + UserList.get(0).get(3));
		        lblUsersEmail.setBounds(20, 166, 173, 21);
		        Showframe.getContentPane().add(lblUsersEmail);
				
				
				
				
				
				
				
				
				Showframe.setVisible(true);
				
				
				
				
				
				
				
				
				
				
				
				
			}
				
				
			
		
	   else if (s[1].isArmed()){
			System.out.println("User2 was clicked");
			
			
			  Showframe = new JFrame("User Info");
				
		        Showframe.setBounds(400, 200, 400, 400);
				
		        Showframe.setAlwaysOnTop(true);
				
		        Showframe.setResizable(false);
				
		        Showframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				
		        Showframe.getContentPane().setLayout(null);
			    
		        Showframe.setTitle("User Info");
			    
		        Showframe.getContentPane().setBackground(Color.WHITE);
		        
		        JLabel lblUsersFirstName = new JLabel("Users First Name: " + UserList.get(1).get(0));
		        lblUsersFirstName.setBounds(20, 56, 173, 21);
		        Showframe.getContentPane().add(lblUsersFirstName);
		        
		        JLabel lblUsersLastName = new JLabel("Users Last Name: " + UserList.get(1).get(1));
		        lblUsersLastName.setBounds(20, 86, 178, 21);
		        Showframe.getContentPane().add(lblUsersLastName);
		        
		        JLabel lblUsersAddress = new JLabel("Users Address: " + UserList.get(1).get(2));
		        lblUsersAddress.setBounds(20, 118, 173, 21);
		        Showframe.getContentPane().add(lblUsersAddress);
		        
		        JLabel lblUsersAge = new JLabel("Users Age: " + UserList.get(1).get(4));
		        lblUsersAge.setBounds(20, 220, 173, 21);
		        Showframe.getContentPane().add(lblUsersAge);
		        
		        JLabel lblUsersEmail = new JLabel("Users Email: " + UserList.get(1).get(3));
		        lblUsersEmail.setBounds(20, 166, 173, 21);
		        Showframe.getContentPane().add(lblUsersEmail);
				
				
				
				
				
				
				
				
				Showframe.setVisible(true);
				
				
				
				
				
				
				
				
				
				
				
				
			}
				
			
		
	   else if (s[2].isArmed()){
			System.out.println("User3 was clicked");
			  Showframe = new JFrame("User Info");
				
		        Showframe.setBounds(400, 200, 400, 400);
				
		        Showframe.setAlwaysOnTop(true);
				
		        Showframe.setResizable(false);
				
		        Showframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				
		        Showframe.getContentPane().setLayout(null);
			    
		        Showframe.setTitle("User Info");
			    
		        Showframe.getContentPane().setBackground(Color.WHITE);
		        
		        JLabel lblUsersFirstName = new JLabel("Users First Name: " + UserList.get(2).get(0));
		        lblUsersFirstName.setBounds(20, 56, 173, 21);
		        Showframe.getContentPane().add(lblUsersFirstName);
		        
		        JLabel lblUsersLastName = new JLabel("Users Last Name: " + UserList.get(2).get(1));
		        lblUsersLastName.setBounds(20, 86, 178, 21);
		        Showframe.getContentPane().add(lblUsersLastName);
		        
		        JLabel lblUsersAddress = new JLabel("Users Address: " + UserList.get(2).get(2));
		        lblUsersAddress.setBounds(20, 118, 173, 21);
		        Showframe.getContentPane().add(lblUsersAddress);
		        
		        JLabel lblUsersAge = new JLabel("Users Age: " + UserList.get(2).get(4));
		        lblUsersAge.setBounds(20, 220, 173, 21);
		        Showframe.getContentPane().add(lblUsersAge);
		        
		        JLabel lblUsersEmail = new JLabel("Users Email: " + UserList.get(2).get(3));
		        lblUsersEmail.setBounds(20, 166, 173, 21);
		        Showframe.getContentPane().add(lblUsersEmail);
				
			
				Showframe.setVisible(true);
				
			}
				
		
	   else if (s[3].isArmed()){
			System.out.println("User4 was clicked");
			Showframe = new JFrame("User Info");
			
	        Showframe.setBounds(400, 200, 400, 400);
			
	        Showframe.setAlwaysOnTop(true);
			
	        Showframe.setResizable(false);
			
	        Showframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
	        Showframe.getContentPane().setLayout(null);
		    
	        Showframe.setTitle("User Info");
		    
	        Showframe.getContentPane().setBackground(Color.WHITE);
	        
	        JLabel lblUsersFirstName = new JLabel("Users First Name: " + UserList.get(3).get(0));
	        lblUsersFirstName.setBounds(20, 56, 173, 21);
	        Showframe.getContentPane().add(lblUsersFirstName);
	        
	        JLabel lblUsersLastName = new JLabel("Users Last Name: " + UserList.get(3).get(1));
	        lblUsersLastName.setBounds(20, 86, 178, 21);
	        Showframe.getContentPane().add(lblUsersLastName);
	        
	        JLabel lblUsersAddress = new JLabel("Users Address: " + UserList.get(3).get(2));
	        lblUsersAddress.setBounds(20, 118, 173, 21);
	        Showframe.getContentPane().add(lblUsersAddress);
	        
	        JLabel lblUsersAge = new JLabel("Users Age: " + UserList.get(3).get(4));
	        lblUsersAge.setBounds(20, 220, 173, 21);
	        Showframe.getContentPane().add(lblUsersAge);
	        
	        JLabel lblUsersEmail = new JLabel("Users Email: " + UserList.get(3).get(3));
	        lblUsersEmail.setBounds(20, 166, 173, 21);
	        Showframe.getContentPane().add(lblUsersEmail);
			
		
			Showframe.setVisible(true);
			
		}
			
		
	   else if (s[4].isArmed()){
			System.out.println("User5 was clicked");
			Showframe = new JFrame("User Info");
			
	        Showframe.setBounds(400, 200, 400, 400);
			
	        Showframe.setAlwaysOnTop(true);
			
	        Showframe.setResizable(false);
			
	        Showframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
	        Showframe.getContentPane().setLayout(null);
		    
	        Showframe.setTitle("User Info");
		    
	        Showframe.getContentPane().setBackground(Color.WHITE);
	        
	        JLabel lblUsersFirstName = new JLabel("Users First Name: " + UserList.get(4).get(0));
	        lblUsersFirstName.setBounds(20, 56, 173, 21);
	        Showframe.getContentPane().add(lblUsersFirstName);
	        
	        JLabel lblUsersLastName = new JLabel("Users Last Name: " + UserList.get(4).get(1));
	        lblUsersLastName.setBounds(20, 86, 178, 21);
	        Showframe.getContentPane().add(lblUsersLastName);
	        
	        JLabel lblUsersAddress = new JLabel("Users Address: " + UserList.get(4).get(2));
	        lblUsersAddress.setBounds(20, 118, 173, 21);
	        Showframe.getContentPane().add(lblUsersAddress);
	        
	        JLabel lblUsersAge = new JLabel("Users Age: " + UserList.get(4).get(4));
	        lblUsersAge.setBounds(20, 220, 173, 21);
	        Showframe.getContentPane().add(lblUsersAge);
	        
	        JLabel lblUsersEmail = new JLabel("Users Email: " + UserList.get(4).get(3));
	        lblUsersEmail.setBounds(20, 166, 173, 21);
	        Showframe.getContentPane().add(lblUsersEmail);
			
		
			Showframe.setVisible(true);
			
		}
			
	   else if (s[5].isArmed()){
			System.out.println("User6 was clicked");
			Showframe = new JFrame("User Info");
			
	        Showframe.setBounds(400, 200, 400, 400);
			
	        Showframe.setAlwaysOnTop(true);
			
	        Showframe.setResizable(false);
			
	        Showframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
	        Showframe.getContentPane().setLayout(null);
		    
	        Showframe.setTitle("User Info");
		    
	        Showframe.getContentPane().setBackground(Color.WHITE);
	        
	        JLabel lblUsersFirstName = new JLabel("Users First Name: " + UserList.get(5).get(0));
	        lblUsersFirstName.setBounds(20, 56, 173, 21);
	        Showframe.getContentPane().add(lblUsersFirstName);
	        
	        JLabel lblUsersLastName = new JLabel("Users Last Name: " + UserList.get(5).get(1));
	        lblUsersLastName.setBounds(20, 86, 178, 21);
	        Showframe.getContentPane().add(lblUsersLastName);
	        
	        JLabel lblUsersAddress = new JLabel("Users Address: " + UserList.get(5).get(2));
	        lblUsersAddress.setBounds(20, 118, 173, 21);
	        Showframe.getContentPane().add(lblUsersAddress);
	        
	        JLabel lblUsersAge = new JLabel("Users Age: " + UserList.get(5).get(4));
	        lblUsersAge.setBounds(20, 220, 173, 21);
	        Showframe.getContentPane().add(lblUsersAge);
	        
	        JLabel lblUsersEmail = new JLabel("Users Email: " + UserList.get(5).get(3));
	        lblUsersEmail.setBounds(20, 166, 173, 21);
	        Showframe.getContentPane().add(lblUsersEmail);
			
		
			Showframe.setVisible(true);
			
		}
			
	   else if (s[6].isArmed()){
			System.out.println("User7 was clicked");
			Showframe = new JFrame("User Info");
			
	        Showframe.setBounds(400, 200, 400, 400);
			
	        Showframe.setAlwaysOnTop(true);
			
	        Showframe.setResizable(false);
			
	        Showframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
	        Showframe.getContentPane().setLayout(null);
		    
	        Showframe.setTitle("User Info");
		    
	        Showframe.getContentPane().setBackground(Color.WHITE);
	        
	        JLabel lblUsersFirstName = new JLabel("Users First Name: " + UserList.get(6).get(0));
	        lblUsersFirstName.setBounds(20, 56, 173, 21);
	        Showframe.getContentPane().add(lblUsersFirstName);
	        
	        JLabel lblUsersLastName = new JLabel("Users Last Name: " + UserList.get(6).get(1));
	        lblUsersLastName.setBounds(20, 86, 178, 21);
	        Showframe.getContentPane().add(lblUsersLastName);
	        
	        JLabel lblUsersAddress = new JLabel("Users Address: " + UserList.get(6).get(2));
	        lblUsersAddress.setBounds(20, 118, 173, 21);
	        Showframe.getContentPane().add(lblUsersAddress);
	        
	        JLabel lblUsersAge = new JLabel("Users Age: " + UserList.get(6).get(4));
	        lblUsersAge.setBounds(20, 220, 173, 21);
	        Showframe.getContentPane().add(lblUsersAge);
	        
	        JLabel lblUsersEmail = new JLabel("Users Email: " + UserList.get(6).get(3));
	        lblUsersEmail.setBounds(20, 166, 173, 21);
	        Showframe.getContentPane().add(lblUsersEmail);
			
		
			Showframe.setVisible(true);
			
		}
			
		
		
	}
}