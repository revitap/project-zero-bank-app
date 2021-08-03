package register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class RegisterUser {

public static void main(String[] args) throws SQLException {

	String url = "jdbc:postgresql://localhost:5434/postgres";
	String user = "postgres";
	String password = "password";
	
	Connection myConn = null;
	PreparedStatement myStmt = null;
	
	Scanner scanner = null;
	
	try {
	// 0. read user input from command lines
	scanner = new Scanner(System.in);
	
	System.out.println("Welcome. Please register. ");
	
	System.out.print("Enter first name: ");
	String firstName = scanner.nextLine();
	
	System.out.print("Enter last name: ");
	String lastName = scanner.nextLine();
	
	System.out.print("Enter user type (customer or employee): ");
	String usertype = scanner.nextLine();
	
	// 1. Get a connection to database
	myConn = DriverManager.getConnection(url, user, password);
	
	// 2. Create a statement
	String sql = "insert into users "
	+ " (firstname, lastname, usertype)" + " values (?, ?, ?)";
	
	myStmt = myConn.prepareStatement(sql);
	
	// set param values
	myStmt.setString(1, firstName);
	myStmt.setString(2, lastName);
	myStmt.setString(3, usertype);
	
	// 3. Execute SQL query
	myStmt.executeUpdate();
	
	System.out.println("Registration complete. Thank you.");
	} catch (Exception exc) {
	exc.printStackTrace();
	} finally {
	if (myStmt != null) {
	myStmt.close();
	}
	
	if (myConn != null) {
	myConn.close();
	}
	
	if (scanner != null) {
	scanner.close();
	}
	}
	}


}
