class UserProfile {

    static String firstName = "Baba";
    static String lastName = "Jackson";
    static String gender = "Female";
    static String emailId = "baba1123@gmail.com";
    static long mobileNumber = 8217216186L;
    static String password = "123";
    static String dateOfBirth = "18/15/2004";

    public static void main(String[] args) {

        String firstName = "Ananya";
        String lastName = "Sharma";
        String gender = "Female";
        String emailId = "ananya2026@gmail.com";
        long mobileNumber = 9876543210L;
        String password = "securePass456";
        String dateOfBirth = "12/08/2004";

        // local variables
        System.out.println("The Account First Name is  " + firstName);
        System.out.println("The Account Last Name is  " + lastName);
        System.out.println("The Account Gender is  " + gender);
        System.out.println("The Account Mobile Number is  " + mobileNumber);
        System.out.println("The Account Email Id is  " + emailId);
        System.out.println("The Account Password is  " + password);
        System.out.println("The Account Date of Birth is  " + dateOfBirth);

        // static variables
        System.out.println("The Account First Name is  " + UserProfile.firstName);
        System.out.println("The Account Last Name is  " + UserProfile.lastName);
        System.out.println("The Account Gender is  " + UserProfile.gender);
        System.out.println("The Account Mobile Number is  " + UserProfile.mobileNumber);
        System.out.println("The Account Email Id is  " + UserProfile.emailId);
        System.out.println("The Account Password is  " + UserProfile.password);
        System.out.println("The Account Date of Birth is  " + UserProfile.dateOfBirth);
    }
}
