class Chef{

	int chefId;
	String name;
	int experience;
	String specialty;
	boolean isHeadChef;

	public void getChefDetails(){
		System.out.println("Chef Id: " + chefId);
		System.out.println("Name: " + name);
		System.out.println("Experience: " + experience);
		System.out.println("Specialty: " + specialty);
		System.out.println("Head Chef: " + isHeadChef);
		System.out.println("---------------------------");
	}
}