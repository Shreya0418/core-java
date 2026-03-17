class BloodBank {

    static String firstName = "Shreya";
    static String lastName = "R H";
    static String userName = "shreyarh12345";
    static String gender = "F";
    static long mobileNumber = 8217216186L;
    static String emailId = "shreya@gmail.com";
    static String password = "85kjshdfishgiur20";
    static int zipCode = 570057;
    static String donor = "Shreya";
    static String dateOfBirth = "18/08/2005";

    public static void main(String[] args) {

        String firstName = "Ananya";
        String lastName = "S K";
        String userName = "ananyask2026";
        String gender = "Female";
        long mobileNumber = 9876543210L;
        String emailId = "ananya@gmail.com";
        String password = "securePass123";
        int zipCode = 560001;
        String donor = "Ananya";
        String dateOfBirth = "12/05/2004";

        // local variables
        System.out.println("The First Name is  " + firstName);
        System.out.println("The Last Name is  " + lastName);
        System.out.println("The User Name is  " + userName);
        System.out.println("The gender is  " + gender);
        System.out.println("The Mobile Number is  " + mobileNumber);
        System.out.println("The Email Id is  " + emailId);
        System.out.println("The Password is  " + password);
        System.out.println("The Zip Code is  " + zipCode);
        System.out.println("The Donor is  " + donor);
        System.out.println("The Date of Birth is  " + dateOfBirth);

        // static variables
        System.out.println("The First Name is  " + BloodBank.firstName);
        System.out.println("The Last Name is  " + BloodBank.lastName);
        System.out.println("The User Name is  " + BloodBank.userName);
        System.out.println("The gender is  " + BloodBank.gender);
        System.out.println("The Mobile Number is  " + BloodBank.mobileNumber);
        System.out.println("The Email Id is  " + BloodBank.emailId);
        System.out.println("The Password is  " + BloodBank.password);
        System.out.println("The Zip Code is  " + BloodBank.zipCode);
        System.out.println("The Donor is  " + BloodBank.donor);
        System.out.println("The Date of Birth is  " + BloodBank.dateOfBirth);
    }
}
