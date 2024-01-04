package practice;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement; // Import the correct Statement class

import com.mysql.cj.jdbc.Driver;
public class SampleJdbExecuteQuery {
	 public static void main(String[] args) throws SQLException {
	        Driver driverRef = new Driver();

	        // Step 1: Register the DB
	        DriverManager.registerDriver(driverRef);

	        // Step 2: Get the connection
	        java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/avk", "root", "adarsh");

	        // Step 3: Issue create statement
	        Statement state = con.createStatement(); // Use the correct Statement interface

	        // Execute a query
	        String query = "insert into qspiders values('20')";
	        int result = state.executeUpdate(query); // Execute query using Statement directly

	        if (result == 1) {
	            System.out.println("Data is added");
	        }
	        con.close();
	    }
	}