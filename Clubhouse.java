class Clubhouse{

	public static void login(long mobileNo, int otp){
		System.out.println("Mobile No: " + mobileNo);
		System.out.println("OTP: " + otp);
	}

	public static void login(long mobileNo, String password){
		System.out.println("Mobile No: " + mobileNo);
		System.out.println("Password: " + password);
	}
	public static void main(String[] args){
	    login(7410258963L, 741);
		login(7410258963L, "jhwru3");
	}

}