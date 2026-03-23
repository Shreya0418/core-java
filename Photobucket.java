class Photobucket{

	public static void login(long mobileNo, int otp){
		System.out.println("Mobile No: " + mobileNo);
		System.out.println("OTP: " + otp);
	}

	public static void login(long mobileNo, String password){
		System.out.println("Mobile No: " + mobileNo);
		System.out.println("Password: " + password);
	}
	
	public static void main(String[] args){
	    login(8217216486L, 7850);
		login(8217214862L, "payal23");
	}

}