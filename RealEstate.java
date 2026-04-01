class RealEstate{

	String companyName;
	String location;
	int totalProjects;
	boolean isApproved;
	String type;

	Property property;

	public void getRealEstateDetails(){
		System.out.println("Company Name: " + companyName);
		System.out.println("Location: " + location);
		System.out.println("Projects: " + totalProjects);
		System.out.println("Approved: " + isApproved);
		System.out.println("Type: " + type);
		System.out.println("----------------------");

		property.getPropertyDetails();
	}
}