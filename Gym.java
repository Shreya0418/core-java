class Gym{

	String gymName;
	String location;
	int totalMembers;
	boolean isOpen;
	String type;

	Trainer trainer;

	public void getGymDetails(){
		System.out.println("Gym Name: " + gymName);
		System.out.println("Location: " + location);
		System.out.println("Members: " + totalMembers);
		System.out.println("Open: " + isOpen);
		System.out.println("Type: " + type);
		System.out.println("----------------------");

		trainer.getTrainerDetails();
	}
}