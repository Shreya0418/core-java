class History {

    int transactionId;
    double amount;
    String type;
    String date;
    boolean status;

    public void getHistoryDetails() {
        System.out.println("Transaction Id: " + transactionId);
        System.out.println("Amount: " + amount);
        System.out.println("Type: " + type);
        System.out.println("Date: " + date);
        System.out.println("Status: " + status);
        System.out.println("---------------------------");
    }
}