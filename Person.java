class Person{

	String name;
	int age;
	String gender;
	String address;
	boolean isCitizen;

	GovernmentIdentification card;

	public void getPersonDetails(){
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Gender: " + gender);
		System.out.println("Address: " + address);
		System.out.println("Citizen: " + isCitizen);
		System.out.println("----------------------");

		card.getCardDetails();
	}
}