//IMPORTS
import java.util.ArrayList;
import java.util.Random;
/**
 * Date Created: 5/16/2022
 * Purpose: Toolbox full of our own methods and objects to be used in our main java program
 * 
 * COLLABORATORS: ERIK BARTZ - TRENT BOIVIN
 */
public class ToolBox {
	

	//random instance created from javas built in random class for use in the captchagenerator
	static Random r = new Random();
	
	
	public String captchaGen(){
		
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
	
	
	/*method will take in user input as parameter and the username array list checking for 
	 * 1) username in the array list that matches user input
	 * 2) returning the index position in the array
	*/
	public int userNameValidation(String username, ArrayList<String> arraylist) {
		//creating the index position holder variable
		int indexNum = 0;
		
		//Create the loop to iterate through the array list and check for matches to user input
		for(int i = 0; i < arraylist.size(); i++) {
			//checking through each iteration if the username parameter equals the current value of the current index number in the arraylist
			if(username == arraylist.get(i)) {
			}else {
				continue;
			}
		}//end of for loop
		
		
		return indexNum; 
	}//end of username validation method
	
	public void passValidation() {
		
	}//end of password validation method
	
	
	//checks that the position in the userarray matches the position in the passarray
	public void userAndPassValidation() {
		
	}//end of user and pass validation method
	
	public static void main(String[] args) {
	
	}//end of main method





}//end of class
