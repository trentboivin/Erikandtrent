//IMPORTS
import java.util.Random;
import javax.swing.*;
/**
 * Date Created: 5/16/2022
 * Purpose: Toolbox full of our own methods and objects to be used in our main java program
 * 
 * COLLABORATORS: ERIK BARTZ - TRENT BOIVIN
 */
public class ToolBox {
	
	//random instance created from javas built in random class for use in the captchagenerator
	static Random r = new Random();
	
	
	public static String captchaGen(){
		
		//storage variables
		String Generation = "";
		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int GetLength = alphabet.length;
		
		//creating a quick token for the while loop to count off of
		int i = 0;
		
		//using a loop to simulate the "generation" process
		do {
			/*initilizing the random method with the max length of alphabet so we dont get any errors
			 * and try to grab a non existent index of the char array.
			 */
			int rand = r.nextInt(GetLength);
		
			//adding a new character from the alphabet array to the generation variable every iteration of the loop
			Generation = Generation.concat(String.copyValueOf(alphabet, rand, 1));
			
			//incrementing the loop counter
			i++;
		} while (i < 8);
		
		return Generation;
		
	}//end of captchaGen method
	
	
	//this method is using javax swing to create the gui for the program
	public static void window(){
		//lets create the basics for the frame that we will be using for the gui using javax swing
		
		//instancing objects for the frame of the gui and buttons/text fields
		JFrame window = new JFrame("STORE NAME");
		JButton button = new JButton(new ImageIcon("C:\\Users\\Trent\\login.png"));
		//creating the username and password text fields
		JTextField username = new JTextField("Username");
		JTextField password = new JTextField("Password");
	
		//set the size of the jframe and button and other frame addons
		window.setSize(400,400);
		button.setBounds(130,200,150,50);
		username.setBounds(160,100,75,25);
		password.setBounds(160,140,75,25);
		
		//adding everything to the frame
		window.add(button);
		window.add(username);
		window.add(password);
		
		//setting the layout to null for now
		window.setLayout(null);
		window.setVisible(true);
		
		
		
	}//end of window method
	
	
	
	
	
	
	public static void main(String[] args) {
	
	}//end of main method

}//end of class
