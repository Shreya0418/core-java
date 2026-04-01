class Freelancer{

	String name;
	String skill;
	int experience;
	boolean isAvailable;
	String platform;

	Client client;

	public void getFreelancerDetails(){
		System.out.println("Name: " + name);
		System.out.println("Skill: " + skill);
		System.out.println("Experience: " + experience);
		System.out.println("Available: " + isAvailable);
		System.out.println("Platform: " + platform);
		System.out.println("----------------------");

		client.getClientDetails();
	}
}