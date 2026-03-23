class Shapr{

	public static void login(long mobileNo, int otp){
		System.out.println("Mobile No: " + mobileNo);
		System.out.println("OTP: " + otp);
	}

	public static void login(long mobileNo, String password){
		System.out.println("Mobile No: " + mobileNo);
		System.out.println("Password: " + password);
	}
	
	public static void main(String[] args){
	    login(8217216014L, 7015);
		login(8217216014L, "jsnff8w");
	}

}