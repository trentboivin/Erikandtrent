package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class SampleController {
	
	private Stage stage;
	private Scene scene;
	private Parent root;

    @FXML
    private Button login;
    
    @FXML
    private Button logout;

    @FXML
    private PasswordField password;

    @FXML
    private TextField username;

    @FXML
    void loginPressed(ActionEvent event) throws IOException {
    		
    	login(event);
    	
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
