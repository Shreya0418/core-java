class Flickr{

	public static void login(String userName, String password){
		System.out.println("UserName: " + userName);
		System.out.println("Password: " + password);
	}

	public static void login(String userName, int otp){
		System.out.println("UserName: " + userName);
		System.out.println("OTP: " + otp);
	}
	
	public static void main(String[] args){
	    login("aradhya90", "siui1");
		login("aradhya90", 7526685);
	}

}