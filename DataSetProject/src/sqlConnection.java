//IMPORTS
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.cj.jdbc.*;

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
		}catch(Exception e) {System.out.println(e);}
		finally {
			System.out.println("Insert completed!");
		}//end of try catch statement
		
		
	}//end of insertintodatabase method
	
	//use this method to gain a connection to the given url you input in the url variable
	public static Connection getConnection() throws Exception{
		try {
			
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/accountlogins";
			String username = "TrentBoivin";
			String password = "$23Nicholson$";
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("connected successfuly!");
			
			return conn;
		
		}catch(Exception e) {System.out.println(e);}
		
		
		return null;
		
	}//end of method

}//end of class
;