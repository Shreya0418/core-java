class ATM {

    public static void performTransaction(String accountHolderName,long accountNumber,String bankName,String transactionType,double amount,String branchLocation,String status) {

        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Bank Name : " + bankName);
        System.out.println("Transaction Type : " + transactionType);
        System.out.println("Amount : " + amount);
        System.out.println("Branch Location : " + branchLocation);
        System.out.println("Transaction Status : " + status);
		System.out.println();
    }
}