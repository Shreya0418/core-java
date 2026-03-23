class Facebook{
	
	public static void login(String emailId, String password) {
		System.out.println("EmailId: " + emailId);
		System.out.println("Password: " + password);
	}
	
	public static void login(long phoneNo, String password){
		System.out.println("Phone No: " + phoneNo);
		System.out.println("Password: " + password);
	}
	
	public static void main(String[] args){
		login("shreya@gmail.com", "123asd");
		login(8217541236L, "123asd");
	}
}
