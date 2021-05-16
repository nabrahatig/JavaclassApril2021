package Day6;

public class bankingaccount {

	public static void main(String[] args) {

		// create Hagos Account

		Account hagosAccount = new Account("Hagos", "Gebru", 5000);
		Account JamesAccount = new Account("James", "Bond ", 3000);
		//system.out.println(hogosGebru.getBlance());

		System.out.println(hagosAccount);
		hagosAccount.debit(3000);
		hagosAccount.credit(1000);

		System.out.println();
		
	
		System.out.println(JamesAccount);
		JamesAccount.debit(4000);

	}

}
