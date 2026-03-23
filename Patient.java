class Patient{
	
	public static void sick(){
		
		System.out.println("sick invoked");
		
		//invoke
		MobileApp.register("Shreya","fever","shreya@gmail.com", 8217216186L);
		// in next class in the void() need to include-string patientname, string sysmptom......
		//then pass as argumemts - reciption.book(patientname, symptom,.............);
		System.out.println("invocation ended");
	}
}