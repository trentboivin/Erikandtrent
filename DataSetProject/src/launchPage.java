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
	
	
	//this method is using javax swing to create the gui for the program
	public void windowValues(){
		
		//lets create the basics for the frame that we will be using for the gui using javax swing
		
		//instancing objects for the frame of the gui and buttons/text fields
		JButton login = new JButton("login");
		JButton signUp = new JButton("Sign Up");
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
		login.setBounds(70,200,100,30);
		signUp.setBounds(200, 200, 100, 30);
		username.setBounds(160,100,75,25);
		password.setBounds(160,140,75,25);
		user.setBounds(90, 100, 75, 25);
		pass.setBounds(90, 140, 75, 25);
		
		//adding everything to the frame
		window.add(login);
		window.add(signUp);
		window.add(username);
		window.add(password);
		window.add(pass);
		window.add(user);
		
		//setting the layout to null for now
		window.setLayout(null);
		
		
		//ADDING THE LISTENERS FOR THE BUTTONS TO CHECK FOR USER INPUT OR ACTION
		
		//adding action event listener for the sign up button to append username and password to
		signUp.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
	
				//get the text entered into the textfields "user" and "pass" 
				String temp1 = username.getText();
				String temp2 = password.getText();
				//now lets add the new data to the login database
			
				
				
			}//end of action event code block
			
			
			
		});//end of action listener
		
		
		//adding action event listeners to the button to listen for a user click to login
		login.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				//Store the user input on button press
				String Temp1 = username.getText();
				String Temp2 = password.getText();
				
				//instancing an object from the toolbox class
				ToolBox tool = new ToolBox();
				
				if(e.getSource()==login) { 
					tool.usernameValidation(Temp1, userStorage);
					tool.passwordValidation(Temp2, passStorage);
					//if the button is pressed run this validation code to check the user input agaisnt database
					boolean verify = tool.positionValidation(userStorage, passStorage, Temp1, Temp2, window);
					if(verify == true) {
						//if the position validation is correct login to the userwindow
						userWindow profile = new userWindow();
						profile.profilePage();
						profile.openProfilePage();
					}else {
						
					}//end of if statement
				
				}else {
					
				}//end of if statement
				
				
				
		
			}//end of actionevent
				
		});//end of action listener
		
		
	}//end of windowvalues method
	
	public void windowOpen() {
		
		window.setVisible(true);
		
	}//end of windowOpen method

	
	
	
	
	
	
}
