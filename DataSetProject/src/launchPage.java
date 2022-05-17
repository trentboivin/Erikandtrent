//IMPORTS
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Date Created: 5/17/2022
 * Purpose: this is the swing code for the launch page (sign in/sign up)
 *
 * COLLABORATORS: ERIK BARTZ - TRENT BOIVIN
 */
public class launchPage {
	
	//creating the frame object in the class for all scopes to see
	JFrame window = new JFrame("STORE NAME");
	
	//create the data storage for usernames and passwords using arraylist because normal arrays you cannot append into.
	ArrayList<String> userStorage = new ArrayList<String>();
	ArrayList<String> passStorage = new ArrayList<String>();
	
	
	
	//this method is using javax swing to create the gui for the program
	public void windowValues(){
		//TESTING
		userStorage.add("trent");
		
		//lets create the basics for the frame that we will be using for the gui using javax swing
		
		//instancing objects for the frame of the gui and buttons/text fields
		JButton button = new JButton(new ImageIcon("C:\\Users\\Trent\\login.png"));
		//creating the username and password text fields
		JTextField username = new JTextField();
		JTextField password = new JTextField();
		//creating the labels for the text fields
		JLabel user = new JLabel("Username:");
		JLabel pass = new JLabel("Password:");
		
		//set the frame to shut down on close to avoid resource leak
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		//set the size of the jframe and button and other frame addons
		window.setSize(400,400);
		button.setBounds(130,200,150,50);
		username.setBounds(160,100,75,25);
		password.setBounds(160,140,75,25);
		user.setBounds(90, 100, 75, 25);
		pass.setBounds(90, 140, 75, 25);
		
		//adding everything to the frame
		window.add(button);
		window.add(username);
		window.add(password);
		window.add(pass);
		window.add(user);
		
		//setting the layout to null for now
		window.setLayout(null);
		
		
		//adding action event listeners to the button to listen for a user click
		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				//Store the user input on button press
				String Temp1 = username.getText();
				String Temp2 = password.getText();
				//take user input from temp storage over to the arraylist
				userStorage.add(Temp1);
				passStorage.add(Temp2);
				
				if(e.getSource()==button) { //ADD A "AND" OPERATOR TO THE IF STATEMENT LATER ON TO ALSO MAYBE USE THIS AS A VALIDATION CHECK FOR THE VALIDITY OF USER AND PASS
					ToolBox tool = new ToolBox();
					tool.userNameValidation(Temp1, userStorage);
					if (tool.userNameValidation(Temp1, userStorage) == 1) {
						System.out.println("success");
					}else {
						
					}
				}
				
				
				
		
			}//end of actionevent
				
		});//end of action listener
		
		
	}//end of windowvalues method
	
	public void windowOpen() {
		
		window.setVisible(true);
		
	}//end of windowOpen method

	
	
	
	
	
	
}
