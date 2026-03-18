class Salon {
	
	static String serviceNames[] = {"Hair Cut", "Hair Styling", "Hair Colouring", "Hair Spa", "Facial","Clean Up", "Manicure", "Pedicure", "Beard Grooming", "Head Massage"};
	
	public static void getServiceNames() {
		System.out.println("getServiceNames invoked");
		
		for(String serviceName : serviceNames) {
			System.out.println(serviceName);
		}
		
		System.out.println("Invoke ended");
	}
	

}