class AccountHolder{

	int accountNumber;
	String name;
	double balance;
	String accountType;
	boolean isActive;

	public void getAccountHolderDetails(){
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Name: " + name);
		System.out.println("Balance: " + balance);
		System.out.println("Account Type: " + accountType);
		System.out.println("Active: " + isActive);
		System.out.println("---------------------------");
	}
}