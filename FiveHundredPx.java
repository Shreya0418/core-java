class FiveHundredPx{

	public static void login(String userName, String password){
		System.out.println("UserName: " + userName);
		System.out.println("Password: " + password);
	}

	public static void login(String userName, int otp){
		System.out.println("UserName: " + userName);
		System.out.println("OTP: " + otp);
	}
	
	public static void main(String[] args){
	    login("Aliabhatt12", "bhatt564");
		login("Aliabhatt12", 8520);
	}

}