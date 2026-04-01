class PhonePe {

    String userName;
    String mobileNumber;
    int pin;
    boolean isVerified;
    String bankLinked;

    History history;

    public void getPhonePeDetails() {
        System.out.println("User Name: " + userName);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("PIN: " + pin);
        System.out.println("Verified: " + isVerified);
        System.out.println("Bank Linked: " + bankLinked);
        System.out.println("----------------------");

        history.getHistoryDetails();
    }
}