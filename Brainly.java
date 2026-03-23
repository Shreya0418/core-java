class Brainly{

	public static void login(String userName, String password){
		System.out.println("UserName: " + userName);
		System.out.println("Password: " + password);
	}

	public static void login(String userName, int otp){
		System.out.println("UserName: " + userName);
		System.out.println("OTP: " + otp);
	}

	public static void main(String[] args){
		login("brainUser", "bra123");
		login("brainUser", 8080);
	}

}