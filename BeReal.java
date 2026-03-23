class BeReal{

	public static void login(String email, String password){
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);
	}

	public static void login(String email, int otp){
		System.out.println("Email: " + email);
		System.out.println("OTP: " + otp);
	}

	public static void main(String[] args){
		login("real@gmail.com", "real123");
		login("real@gmail.com", 6767);
	}

}