class Telegram{

	public static void login(long mobileNo, String password){
		System.out.println("Mobile No: " + mobileNo);
		System.out.println("Password: " + password);
	}

	public static void login(String userName, String password){
		System.out.println("UserName: " + userName);
		System.out.println("Password: " + password);
	}
	
	public static void main(String[] args){
	    login(7412589647L, "abcd1");
		login("shrey234", "abcd1");
	}

}