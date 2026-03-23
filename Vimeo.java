class Vimeo{

	public static void login(String userName, String password){
		System.out.println("UserName: " + userName);
		System.out.println("Password: " + password);
	}

	public static void login(String userName, int otp){
		System.out.println("UserName: " + userName);
		System.out.println("OTP: " + otp);
	}
	public static void main(String[] args){
	    login("Ruru_12", "taro7");
		login("Ruru_12", 9463);
	}
}