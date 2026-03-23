class MobileApp{
	
	public static void register(String patientName, String symptom, String emailId, long phoneNo){
		
		System.out.println("Patient Name: " + patientName);
        System.out.println("Symptom: " + symptom);
        System.out.println("Email ID: " + emailId);
        System.out.println("Phone Number: " + phoneNo);
		
		
		System.out.println("The registration is done Sucessfully!");
		
		System.out.println("invocation ended\n");
	
	Reception.book("Shreya", "fever", "shreya@gmail.com", 8217216186L);
	
	}
}