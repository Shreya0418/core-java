class Threads{

	public static void login(long mobileNo, int otp){
		System.out.println("Mobile No: " + mobileNo);
		System.out.println("OTP: " + otp);
	}

	public static void login(long mobileNo, String password){
		System.out.println("Mobile No: " + mobileNo);
		System.out.println("Password: " + password);
	}

	public static void main(String[] args){
		login(9876501234L, 1212);
		login(9876501234L, "thr123");
	}

}