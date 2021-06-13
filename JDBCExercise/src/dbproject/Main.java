package dbproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class Main {

	public static void main(String[] args) throws SQLException {

		Connection myConn = null;
		Statement myStmt = null;
		PreparedStatement prdStmt = null;

		try {
			// 1. Get a connection to database
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bankdb1", "root", "Kia202160");
			
			//Create Statement
			myStmt = myConn.createStatement();
			
			//create three objects
			Account ObjectA = new Account(2001, "John", "Doe", 2500.00);
			Account ObjectB = new Account(2002, "Tesfay", "Kiros", 1250.00);
			Account ObjectC = new Account(2004, "Hadgu", "Kindeya", 5000.30);
			
			String mySql = "Insert into account (account_no, first_name, last_name, balance) VALUES (?,?,?,?)";
			
			prdStmt = myConn.prepareStatement(mySql);
			
			System.out.println(ObjectA);
			prdStmt.setInt(1, ObjectA.getAccountNum());
			prdStmt.setString(2, ObjectA.getFirstName());
			prdStmt.setString(3, ObjectA.getLastName());
			prdStmt.setDouble(4, ObjectA.getBalance());
			ObjectA.deposit(1000);
			ObjectA.withdraw(500);
			prdStmt.execute();
			
			System.out.println();
			
			System.out.println(ObjectB);
			prdStmt.setInt(1, ObjectB.getAccountNum());
			prdStmt.setString(2, ObjectB.getFirstName());
			prdStmt.setString(3, ObjectB.getLastName());
			prdStmt.setDouble(4, ObjectB.getBalance());
			ObjectB.deposit(1000);
			prdStmt.execute();
			
			System.out.println();
			
			System.out.println(ObjectC);
			prdStmt.setInt(1, ObjectC.getAccountNum());
			prdStmt.setString(2, ObjectC.getFirstName());
			prdStmt.setString(3, ObjectC.getLastName());
			prdStmt.setDouble(4, ObjectC.getBalance());
			ObjectC.deposit(1000);
			prdStmt.execute();
			
			System.out.println();
			System.out.println("Data successfully inserted into account table ");
			
			System.out.println();
			
			String sqlUpdate = "UPDATE Bankdb1.account SET balance = ? WHERE account_no = ?";
			prdStmt = myConn.prepareStatement(sqlUpdate);
		    
			prdStmt.setDouble(1, ObjectA.getBalance());
			prdStmt.setDouble(2, ObjectA.getAccountNum());
			prdStmt.execute();
		    
			prdStmt.setDouble(1, ObjectB.getBalance());
			prdStmt.setDouble(2, ObjectB.getAccountNum());
			prdStmt.execute();
		    
			prdStmt.setDouble(1, ObjectC.getBalance());
			prdStmt.setDouble(2, ObjectC.getAccountNum());
			prdStmt.execute();
			
			
			
			System.out.println("Data updated ");
			
			//Transaction table
			
			//create transaction object manually 
			Transaction transactionObjectA = new Transaction(101, "deposit", 1000, 2001);
			Transaction transactionObjectB = new Transaction(100, "deposit", 1000, 2002);
			Transaction transactionObjectC = new Transaction(102, "deposit", 1000, 2004);
			// transactionObject = new Transaction(101, "withdraw", 500, 2001);
			
			
			String mySql2 = "Insert into transaction (transaction_id, transaction_type, amount, account_no) VALUES (?,?,?,?)";
			prdStmt = myConn.prepareStatement(mySql2);
			
			System.out.println();
			
			System.out.println(transactionObjectA);
			prdStmt.setInt(1, transactionObjectA.getTransactionId());
			prdStmt.setString(2, transactionObjectA.getTransactiontype());
			prdStmt.setDouble(3, transactionObjectA.getAmount());
			prdStmt.setInt(4, transactionObjectA.getAccountNum());
			ObjectC.deposit(1000);
			prdStmt.execute();
			
			
			System.out.println(transactionObjectB);
			prdStmt.setInt(1, transactionObjectB.getTransactionId());
			prdStmt.setString(2, transactionObjectB.getTransactiontype());
			prdStmt.setDouble(3, transactionObjectB.getAmount());
			prdStmt.setInt(4, transactionObjectB.getAccountNum());
			ObjectC.deposit(1000);
			prdStmt.execute();
			
			System.out.println(transactionObjectC);
			prdStmt.setInt(1, transactionObjectC.getTransactionId());
			prdStmt.setString(2, transactionObjectC.getTransactiontype());
			prdStmt.setDouble(3, transactionObjectC.getAmount());
			prdStmt.setInt(4, transactionObjectC.getAccountNum());
			ObjectC.deposit(1000);
			prdStmt.execute();
			
			/*
			 * System.out.println(transactionObject); prdStmt.setInt(1,
			 * transactionObject.getTransactionId()); prdStmt.setString(2,
			 * transactionObject.getTransactiontype()); prdStmt.setDouble(3,
			 * transactionObject.getAmount()); prdStmt.setInt(4,
			 * transactionObject.getAccountNum()); ObjectC.withdraw(500); prdStmt.execute();
			 * System.out.println();
			 * System.out.println("Data successfully updated into transaction table ");
			 * 
			 */
			
			//Transfer
		
			//create statement

			
			Transfer toTesfay = new Transfer(501,2004, 2002, 750, "Trip to hawaii");
	    	String TransferSql = "Insert into transfer (transfer_id, from_account, to_account,amount,reason) VALUES (?,?,?,?,?)";
			prdStmt = myConn.prepareStatement(TransferSql);
	
			prdStmt.setInt(1, toTesfay.getTransferId());
			prdStmt.setInt(2, toTesfay.getFromAccount());
			prdStmt.setDouble(3, toTesfay.getAmount());
			prdStmt.setDouble(4, toTesfay.getAmount());
			prdStmt.execute();	
			
			
			System.out.println("Transfer amount:"+ TransferSql + "for " + "John");
			
		} catch (Exception exc) {
			exc.printStackTrace();

		}

	
}
}
	


