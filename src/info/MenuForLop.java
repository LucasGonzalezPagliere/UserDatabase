package info;
import static info.Window.txtFirst;
import static info.Window.txtLatnmae;
import static info.Window.txtAdress;
import static info.Window.txtEmail;
import static info.Window.txtAge;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static info.Window.mnUsers;
import javax.swing.JMenu;

import static info.ThatClass.UserList;
public class MenuForLop implements ActionListener{

	
	
	
	
	
	public void actionPerformed(ActionEvent e) {
		for(int counter = 0; counter<UserList.size(); counter ++){
			
			
			mnUsers.add(new JMenu("user" + txtFirst.getText()));
			
			
			
		}
		
	}

}
