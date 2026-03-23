class Medium{
	public static void login(String email, String password){
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);
	}
	public static void login(long mobileNo, String password){
		System.out.println("mobileNo: " + mobileNo);
		System.out.println("Password: " + password);
	}
	
	public static void main(String[] args){
	    login("vansh1@gmail.com", "Vn78");
		login(8217219648L, "Vn78");
	}
}