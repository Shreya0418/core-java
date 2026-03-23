class TwitterSpaces{

	public static void login(String email, String password){
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);
	}

	public static void login(String email, int otp){
		System.out.println("Email: " + email);
		System.out.println("OTP: " + otp);
	}
	public static void main(String[] args){
	    login("shre@gmail.com", "jhbfywe673");
		login("shre@gmail.com", 7410655);
	}

}