class Tumblr{
	public static void login(long mobileNo, String password){
		System.out.println("Mobile: " + mobileNo);
		System.out.println("Password: " + password);
	}
	public static void login(String userName, String password){
		System.out.println("UserName: " + userName);
		System.out.println("Password: " + password);
	}
	
	public static void main(String[] args){
	    login(9481728297L, "pvn@16");
		login("pvn@0006", "pvn@16");
	}
}