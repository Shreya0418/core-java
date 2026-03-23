class FireWork{

	public static void login(long mobileNo, int otp){
		System.out.println("Mobile No: " + mobileNo);
		System.out.println("OTP: " + otp);
	}

	public static void login(long mobileNo, String password){
		System.out.println("Mobile No: " + mobileNo);
		System.out.println("Password: " + password);
	}
	
	public static void main(String[] args){
		login(7514623985L, 5);
		login(7514623985L, "45sfhr");
	}

}