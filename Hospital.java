class Hospital{
	
	public static void bookAppointment(String patientName, String symptom){
		
		System.out.println("Patient Name: " + patientName);
		System.out.println("Symptoms: " + symptom);
		
		System.out.println("Appointmet of this patient is bookes & Confirmed!");
		
		Nurse.basicCheck("Shreya", "Fever", false, false);
	}
}