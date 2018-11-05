package info;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.AbstractButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import static info.Window.Fname;
import static info.Window.Lname;
import static info.Window.Addy;
import static info.Window.Email;
import static info.Window.Age;
import static info.Window.mnUsers;
import static info.Window.txtFirst;
import static info.Window.txtLatnmae;
import static info.Window.txtAdress;
import static info.Window.txtEmail;
import static info.Window.txtAge;
import static info.ThatClass.UserList;
import static info.Window.mnUsers_1;

import static info.Window.frmInout;

public class Adder implements ActionListener{

	
	static public String PostName1 = "";
	static public String PostName2 = "";
	static public String PostAddy = "";
	static public String PostEmail = "";
	static public String PostAge = "";
	
	public static JMenuItem[] s  = new JMenuItem[7];
	public int n = 1;
	public int test =0;

	public static int w = 0;
	
	public int counter = 0;
	public void actionPerformed(ActionEvent arg0) {
		int x = UserList.size();
		
		
	
		
		
		UserList.add(new ArrayList<String>());
		
		if(counter<UserList.size()){
			
			
			
				
				
				
			s[counter] = new JMenuItem ("User: " + txtFirst.getText());
		
		
		mnUsers_1.add(s[counter]);
		
		s[counter].addActionListener(new JListDoer());
		
		
		}
		
		PostName1 = txtFirst.getText();;
		PostName2 = txtLatnmae.getText();;
		PostAddy = txtAdress.getText();
		PostEmail = txtEmail.getText();
		PostAge = txtAge.getText();
		
		
		
		
		UserList.get(x).add(PostName1);
	     	UserList.get(x).add(PostName2);
				UserList.get(x).add(PostAddy);
						UserList.get(x).add(PostEmail);
								UserList.get(x).add(PostAge);
		txtFirst.setText("First Name");
		txtLatnmae.setText("Last Name");
		txtAdress.setText("Address");
		txtEmail.setText("Email");
		txtAge.setText("Age");
		System.out.println(UserList);
	
		
		frmInout.repaint();
		++counter;
		n++;
		
	}}




	

