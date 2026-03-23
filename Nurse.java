class Nurse{
	
	public static void basicCheck(String patientName, String symptom, boolean bp, boolean sugar){
		
		System.out.println("Patient Name: " + patientName);
		System.out.println("Symptoms: " + symptom);
		System.out.println("Bp?: " + bp);
		System.out.println("Sugar ? : " + sugar);
		
		System.out.println("Appointmet of this patient is bookes & Confirmed!");
		
		
		Doctor.treat("Shreya", "Fever");
	}
}