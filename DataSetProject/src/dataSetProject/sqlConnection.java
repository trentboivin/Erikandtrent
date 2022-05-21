package dataSetProject;

//IMPORTS
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.jdbc.*;

import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/*
 * Date created: 5/18/2022
 * Purpose: to create a connection to the given sql database everytime the main program is run so data can be pulled/inserted in code
 * 
 * COLLABORATERS: ERIK BARTZ - TRENT BOIVIN
 * ERIK YOUR USER AND PASS FOR THE SQL SERVER IS: ErikBartz || baller55
 */

public class sqlConnection {

	public static void main(String[] args) throws Exception {
		
		
	}//end of main
	
	
	//Method inserts data into the login table in the accountlogins database in the fields username and password
	public static void insertIntoDatabase(String Username, String Password) throws Exception {
		
		try {
			Connection conn = getConnection();
			PreparedStatement insert = conn.prepareStatement("INSERT INTO logins (username, password) VALUES ('"+Username+"','"+Password+"')");
			
			insert.executeUpdate();
			System.out.println("Insert completed!");
		}catch(Exception e) {System.out.println(e);}
		finally {
			
		}//end of try catch statement
		
		
	}//end of insertintodatabase method
	
	
	//method that checks if username already exists
	public static boolean checkUserExists(String user) throws Exception {
		
		Connection conn = getConnection();
		PreparedStatement checkExists = conn.prepareStatement("SELECT username FROM logins WHERE EXISTS (SELECT username FROM logins WHERE username= '" + user + "')");
		ResultSet rs = checkExists.executeQuery();
		
		if(rs.next()) {
			System.out.println("there is already username data called: " + rs.getString(1));
			String exists = rs.getString(1);
			return true;
		}else {
			
		}//end of if statement 
		
		return false;
		
	}//end of checkexists method
	
	//method that checks if password already exists
	public static boolean checkPassExists(String pass) throws Exception {
		
		Connection conn = getConnection();
		PreparedStatement checkExists = conn.prepareStatement("SELECT password FROM logins WHERE EXISTS (SELECT password FROM logins WHERE password= '" + pass + "')");
		ResultSet rs = checkExists.executeQuery();
		
		if(rs.next()) {
			System.out.println("there is already password data called: " + rs.getString(1));
			String exists = rs.getString(1);
			return true;
		}else {
			
		}//end of if statement 
		
		return false;
		
	}//end of checkexists method
	
	//use this to return a true value if username and password are in the sql database and have the same ID 
	public static int verifyUser(String user) {
		
		
		try {
			Connection conn = getConnection();
			PreparedStatement verifyUserPass = conn.prepareStatement("SELECT account_ids FROM logins WHERE username= '" + user + "'");
			ResultSet rs = verifyUserPass.executeQuery();
			
			if(rs.next()) {
				System.out.println(rs.getInt(1));
				int usernameID = rs.getInt(1);
				return usernameID;
			}else {
				System.out.println("does not exist in username column");
			}//end of if statement
			
		}catch (Exception e){System.out.println(e);}
		
		return -1;
	
		
	}//end of verifyuser method
	
	public static int verifyPass(String pass) {
		
		
		try {
			Connection conn = getConnection();
			PreparedStatement verifyUserPass = conn.prepareStatement("SELECT account_ids FROM logins WHERE password= '" + pass + "'");
			ResultSet rs = verifyUserPass.executeQuery();
			
			if(rs.next()) {
				System.out.println(rs.getInt(1));
				int usernameID = rs.getInt(1);
				return usernameID;
			}else {
				System.out.println("does not exist in password column");
			}//end of if statement
			
		}catch (Exception e){System.out.println(e);}
		
		return -2;
	
		
	}//end of verifypass method
	
	
	
	
	
	//use this method to gain a connection to the given urll you input in the url variable
	public static Connection getConnection() throws Exception{
		try {
			
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://34.130.240.220:3306/ApplicationDB";
			String username = "ErikBartz";
			String password = "baller55";
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("connected successfuly!");
			
			return conn;
		
		}catch(Exception e) {System.out.println(e);}
		
		
		return null;
		
	}//end of method

}//end of class
;