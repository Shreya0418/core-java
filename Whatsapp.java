class Whatsapp{

	public static void login(long mobileNo, String password){
		System.out.println("Mobile No: " + mobileNo);
		System.out.println("Password: " + password);
	}

	public static void login(String emailId, String password){
		System.out.println("EmailId: " + emailId);
		System.out.println("Password: " + password);
	}
	
	public static void main(String[] args){
		login(8217216147L, "741plm");
		login("shrey@gmail.com", "741plm");
		}
	
}

