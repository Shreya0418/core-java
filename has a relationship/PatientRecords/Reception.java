class Reception {

    public static void book(String patientName, String symptom, String emailId, long phoneNo) {

        System.out.println("Patient Name: " + patientName);
        System.out.println("Symptom: " + symptom);
        System.out.println("Email ID: " + emailId);
        System.out.println("Phone Number: " + phoneNo);
		
		System.out.println("The booking is done!");

        Hospital.bookAppointment("Shreya", "Fever");
    }
}