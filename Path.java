class Path{

	public static void login(String email, String password){
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);
	}

	public static void login(String email, int otp){
		System.out.println("Email: " + email);
		System.out.println("OTP: " + otp);
	}

	public static void main(String[] args){
		login("path@gmail.com", "pat123");
		login("path@gmail.com", 5656);
	}

}