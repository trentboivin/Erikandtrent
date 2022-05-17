/**
 * @author Trent
 * Date Created: 5/16/2022
 * Project Purpose: To help us learn how to sort and store data as well as accessing it and verifying the data.
 * 
 * COLLABARATORS: ERIK BARTZ - TRENT BOIVIN
 */

//IMPORTS
import javax.swing.*;

public class DataProject {

	public static void main(String[] args) {
		ToolBox obj = new ToolBox();
		System.out.println(obj.captchaGen());
		
		//creating an object from the toolbox class to use javax swing method for GUI
		ToolBox javx =  new ToolBox();
		ToolBox.window();
		
	}

}
