package Day6;

public class Account {
	// question 1
	// what are Attributes
	//Create a class called Account  that includes four pieces of information as instance variables
	//First Name (String)
	//Last Name (String)
	//Account Number (long) 
	//Balance  (double)


	private String firstName;
	private String lastName;
	private long accountNumber;
	private double balance;
	// constructors

	public static long accountIncrement = 10000;

	public Account(String firstName, String lastName, double balance) {
		this.firstName = firstName;
		this.lastName = lastName;
		accountIncrement = accountIncrement + 1;
		this.accountNumber = accountIncrement;
		this.balance = balance;

		// getter and setters
		// means return

	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public long getaccountNumber() {
		return this.accountNumber;
	}

	public double getbalance() {
		return this.balance;
	}

	public void setFirstName(String FirstName, String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String Lastname, String lastName) {
		this.lastName = lastName;
	}

	public void setaccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;

	}

	public void setblance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [firstName=" + firstName + ", lastName=" + lastName + ", accountNumber=" + accountNumber
				+ ", balance=" + balance + "]";

	}

	// Debt method (withdraw money)
	public void debit(double withdrawAmount) {
		if (balance < withdrawAmount) {
			System.out.println("Insufficient Balnce");
		} else {
			balance = balance - withdrawAmount;
			System.out.println(
					"You have withdrawn " + "$" + withdrawAmount + " and your current balnce is: " + "$" + balance);
		}

	}

	public void credit(double depositAmount) {
		balance = balance + depositAmount;
		System.out.println(
				"You deposited " + "$" + depositAmount + " and your available balnce now is: " + "$" + balance);

	}

}
