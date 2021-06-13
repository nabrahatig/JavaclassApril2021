		package jdbcexercise;


		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.ResultSet;
		import java.sql.SQLException;
		import java.sql.Statement;
		public class jdbcupdate {
		
		public static void main(String[] args) throws SQLException {
		Connection myConn = null;
		Statement stmt = null;
		int myRs = 0;

		try {
		// get a connection to database
		myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "Kia202160");
		System.out.println("Database connection successful!\n");

		// prepare statement using Update s
		stmt = myConn.createStatement();
		String sql = "Update bank.account set balance = balance * 2 where accout_no in (18,19,20,21,22)";
		int res = stmt.executeUpdate(sql);
		System.out.println("Rows have been updated "+ res);
						
		} catch (Exception exc) {
		exc.printStackTrace();
		} finally {
		}
		if (myConn != null) {
		myConn.close();
		}
		if (stmt != null) {
		stmt.close();
		
		//if (myRs != null) {
		//myRs.close();
				}
		}
		}