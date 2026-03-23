class Brilliant{

	public static void login(String userName, String password){
		System.out.println("UserName: " + userName);
		System.out.println("Password: " + password);
	}

	public static void login(String userName, int otp){
		System.out.println("UserName: " + userName);
		System.out.println("OTP: " + otp);
	}

	public static void main(String[] args){
		login("brillUser", "bri123");
		login("brillUser", 5050);
	}

}