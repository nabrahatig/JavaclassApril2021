package jdbcexercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEx1 {
	public static void main(String[] args) throws SQLException {
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		try {
			// 1. Get a connection to database
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/School", "root", "Kia202160");
			System.out.println("Database connection successful!\n");
			// 2. Create a statement
			myStmt = myConn.createStatement();
			// 3. Execute SQL query
			myRs = myStmt.executeQuery("select * from Student1");
			// 4. Process the result set
			while (myRs.next()) {
				System.out.println(myRs.getString("FirstName") + ", " + myRs.getString("address"));
			}
		} catch (Exception exc) {
			exc.printStackTrace();
		} finally {
			if (myRs != null) {
				myRs.close();
			}
			if (myStmt != null) {
				myStmt.close();
			}
			if (myConn != null) {
				myConn.close();
			}
		}
	}
}