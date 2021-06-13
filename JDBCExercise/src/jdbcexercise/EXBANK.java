	package jdbcexercise;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	
		public class EXBANK{
	private static int myresults;

	public static void main(String[] args) throws SQLException {
			Connection myConn = null;
			PreparedStatement myStmt = null;
			int myRs = 0;

			try {
				// get a connection to database
				myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "Kia202160");
				System.out.println("Database connection successful!\n");

				// prepare statement
				String sql = "insert into account(accout_no,firstName,LastName,Balance) values(?,?,?,?), (?,?,?,?), (?,?,?,?),(?,?,?,?),(?,?,?,?)";
				myStmt = myConn.prepareStatement(sql);
				// insert data
				//row1
				myStmt.setInt(1, 18);
				myStmt.setString(2, "LULA");
				myStmt.setString(3, "HAILAY");
				myStmt.setDouble(4, 2000);
				//row2
				myStmt.setInt(5, 19);
				myStmt.setString(6, "WAWA");
				myStmt.setString(7, "ABRAHA");
				myStmt.setDouble(8, 3000);
				//row3
				myStmt.setInt(9, 20);
				myStmt.setString(10, "ZEE");
				myStmt.setString(11, "NAHOM");
				myStmt.setDouble(12, 500);
				//row4
				myStmt.setInt(13, 21);
				myStmt.setString(14, "ASENA");
				myStmt.setString(15, "KIDU");
				myStmt.setDouble(16, 6000);
				//row 5
				myStmt.setInt(17, 22);
				myStmt.setString(18, "ABEL");
				myStmt.setString(19, "NAOD");
				myStmt.setDouble(20, 4000);
				
				myresults = myStmt.executeUpdate();
				System.out.println("Rows inserted "+ 
						myresults );
				
			} catch (Exception exc) {
				exc.printStackTrace();
			} finally {
			}
			if (myConn != null) {
				myConn.close();
			}
			if (myStmt != null) {
				myStmt.close();
			}
			// if (myRs != 0) {
			// myRs.close();
		}
	}
		
		