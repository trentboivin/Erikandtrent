package application;

import java.io.IOException;

import dataSetProject.sqlConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SampleController {
	
	private Stage stage;
	private Scene scene;
	private Parent root;

    @FXML
    private Button CreateAccount;
	
    @FXML
    private Button login;
    
    @FXML
    private Button logout;

    @FXML
    private PasswordField password;

    @FXML
    private TextField username;
    
    @FXML
    private Label PromptText;
    
    @FXML
    private Label passrequired;

    @FXML
    private Label userrequired;
    
    @FXML
    void accountCreation(ActionEvent event) throws Exception {
    	//create variables to get and store the userinput
    	String user = username.getText();
    	String pass = password.getText();
    	//these variables are created to hold the username textfield and password passfield
    	TextField userInput = username;
		PasswordField passInput = password;
		//run the checkexists method first to make sure the user input doesnt already exist in the database
		boolean userExists = sqlConnection.checkUserExists(user);
		boolean passExists = sqlConnection.checkPassExists(pass);
	  
	  if(userExists == false && passExists == false) {	
    	//this if statement checks our conditions when creating an account and if conditions are met runs the account creation code
    	if(user.length() > 0 && pass.length() > 0) {
    		//setting the username and password textfields back to empty string
    		userInput.setText("");
    		passInput.setText("");
    		//runs the sql method to insert the userinput into the database
    		sqlConnection.insertIntoDatabase(user, pass);
    		//setting the prompt settings at the bottom of the login page to display
    		PromptText.setTextFill(Color.GREEN);
    		PromptText.setText("Account Created! Please Login.");
    		PromptText.setVisible(true);
    		
    	}else if (user.length() == 0 && pass.length() == 0){
    		//setting prompt settings for if the input Fields are empty
    		PromptText.setTextFill(Color.RED);
    	    PromptText.setText("Both input Fields Are empty");
    	    PromptText.setVisible(true);
    	    userrequired.setVisible(true);
    	    passrequired.setVisible(true);
    	}else if (user.length() == 0) {
    		//set label settings
    		userrequired.setVisible(true);
    		passrequired.setVisible(false);
    		PromptText.setVisible(false);
    		
    	}else if(pass.length() == 0) {
    		//set label setting
    		passrequired.setVisible(true);
    		userrequired.setVisible(false);
    		PromptText.setVisible(false);
    	
    	}else{
    		System.out.println("account creation error");
    	}//end of nested if statement
	 }else if(user.length() == 0 || pass.length() == 0){
		 if(user.length() == 0) {
			//set label settings
			    passInput.setText("");
	    		userrequired.setVisible(true);
	    		passrequired.setVisible(false);
	    		PromptText.setText("Username Required/password taken.");
	    		PromptText.setTextFill(Color.RED);
	    		PromptText.setVisible(true);
	    		
	    		
		 }else if(pass.length() == 0) {
			//set label setting
			    userInput.setText("");
	    		passrequired.setVisible(true);
	    		userrequired.setVisible(false);
	    		PromptText.setText("Password Required/username taken.");
	    		PromptText.setTextFill(Color.RED);
	    		PromptText.setVisible(true);
	    	
		 }//end of nested if statement
	  }else {
		 //prompting the user that their entered input already exists try again
		 PromptText.setVisible(false);
		 PromptText.setText("Username/Password taken");
		 PromptText.setTextFill(Color.RED);
		 PromptText.setVisible(true);
		 //cleaing the user input
		 //setting the username and password textfields back to empty
 		 userInput.setText("");
 		 passInput.setText("");
	 }//end of if statement
    	
    }//end of account Creation method
    
    @FXML
    void loginPressed(ActionEvent event) throws IOException {
    		//creating the containers to hold the user inputted text	
    		String user = username.getText();
    		String pass = password.getText();
    		
    		
    	
    	
    		if(event.getSource() == login) {
    			if(sqlConnection.verifyUser(user) == sqlConnection.verifyPass(pass)) {
    				login(event);
    				
    			}else {
    				PromptText.setTextFill(Color.RED);
    				PromptText.setText("Incorrect Username and Password");
    				PromptText.setVisible(true);
    			}//end of if statement
    			
    			
    		}else {
    			
    		}//end of if statement
    	
    }//end of loginpressed actionevent method
    
    @FXML
    void logoutPressed(ActionEvent event) throws IOException {
    	
    	logout(event);
    	
    }//end of the logoutpressed actionevent method
    
    //runs the code block to switch scenes to the page after the login button is pressed
    void login(ActionEvent event) throws IOException {
    	
    	root = FXMLLoader.load(getClass().getResource("userPage.fxml"));
    	stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	scene = new Scene(root, 400, 400);
    	stage.setTitle("User Page");
    	stage.setScene(scene);
    	stage.show();
   
    }//end of login method
    
    //runs the code block to switch scenes to the page after the logout button is pressed
    void logout(ActionEvent event) throws IOException{
    	
    	root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
    	stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	scene = new Scene(root, 400, 400);
    	stage.setTitle("User Page");
    	stage.setScene(scene);
    	stage.show();
    
    }//end of logout method

}//end of samplecontroller
