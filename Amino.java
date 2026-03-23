class Amino{

	public static void login(String userName, String password){
		System.out.println("UserName: " + userName);
		System.out.println("Password: " + password);
	}

	public static void login(String userName, int otp){
		System.out.println("UserName: " + userName);
		System.out.println("OTP: " + otp);
	}

	public static void main(String[] args){
		login("aminoUser", "ami123");
		login("aminoUser", 3434);
	}

}