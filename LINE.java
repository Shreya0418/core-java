class LINE{
	public static void login(long mobileNo, String password){
		System.out.println("Mobile No: " + mobileNo);
		System.out.println("Password: " + password);
	}
	public static void login(String userName, String password){
		System.out.println("UserName: " + userName);
		System.out.println("Password: " + password);
	}
	
	public static void main(String[] args){
	    login(4963210175L, "shtey@123");
		login("asdnhu4_70", "shtey@123");
	}
}