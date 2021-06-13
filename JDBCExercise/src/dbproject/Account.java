
package dbproject;

public class Account {

	private int accountNum;
	private String firstName;
	private String lastName;
	private double balance;
	
	public Account(int accountNum, String firstName, String lastName, double balance) {
		super();
		this.accountNum = accountNum;
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
	}

	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double depositAmount) {
		balance = balance + depositAmount;
		System.out.println(
				"You deposited " + "$" + depositAmount + " and your available balnce now is: " + "$" + balance);

	}
	
	public void withdraw(double withdrawAmount) {
		if (balance < withdrawAmount) {
			System.out.println("Insufficient Balnce");
		} else {
			balance = balance - withdrawAmount;
			System.out.println(
					"You have withdrawn " + "$" + withdrawAmount + " and your current balnce is: " + "$" + balance);
		}

	}

	@Override
	public String toString() {
		return "Account [accountNum = " + accountNum + ", firstName = " + firstName + ", lastName = " + lastName
				+ ", balance = " + balance + "]";
	}
	
	
	}

	


