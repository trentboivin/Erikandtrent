import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * @author Trent
 *
 */
public class userWindow {
	//instance the frame for our new window
	JFrame userPage = new JFrame();
	
	

	public void profilePage(){
		//instancing objects for the frame of the gui and buttons/text fields
		JButton button = new JButton(new ImageIcon("C:\\Users\\Trent\\login.png"));
		//creating the username and password text fields
		JTextField username = new JTextField();
		JTextField password = new JTextField();
		//creating the labels for the text fields
		JLabel user = new JLabel("SUCCESS:");
		JLabel pass = new JLabel("SUCCESS:");
		
		//set the size of the jframe and button and other frame addons
		userPage.setSize(400,400);
		button.setBounds(130,200,150,50);
		username.setBounds(160,100,75,25);
		password.setBounds(160,140,75,25);
		user.setBounds(90, 100, 75, 25);
		pass.setBounds(90, 140, 75, 25);
		
		//adding everything to the frame
		userPage.add(button);
		userPage.add(username);
		userPage.add(password);
		userPage.add(pass);
		userPage.add(user);
		
		userPage.setLayout(null);
		
		
	}//end of profile page method
	
	public void openProfilePage() {
		userPage.setVisible(true);
		
	}//end of openprofilepage method
	

	
}
