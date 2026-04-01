class Trainer{

	int trainerId;
	String name;
	int experience;
	String specialization;
	boolean isCertified;

	public void getTrainerDetails(){
		System.out.println("Trainer Id: " + trainerId);
		System.out.println("Name: " + name);
		System.out.println("Experience: " + experience);
		System.out.println("Specialization: " + specialization);
		System.out.println("Certified: " + isCertified);
		System.out.println("---------------------------");
	}
}