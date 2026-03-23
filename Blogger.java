class Blogger{

	public static void login(String userName, int otp){
		System.out.println("UserName: " + userName);
		System.out.println("OTP: " + otp);
	}

	public static void login(long mobileNo, String password){
		System.out.println("Mobile No: " + mobileNo);
		System.out.println("Password: " + password);
	}
	
	public static void main(String[] args){
	    login("kavya_3", 856);
		login(9245457145L, "kavu47");
	}

}