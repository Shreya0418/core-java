class Property{

	int propertyId;
	String propertyType;
	int price;
	String owner;
	boolean isAvailable;

	public void getPropertyDetails(){
		System.out.println("Property Id: " + propertyId);
		System.out.println("Type: " + propertyType);
		System.out.println("Price: " + price);
		System.out.println("Owner: " + owner);
		System.out.println("Available: " + isAvailable);
		System.out.println("---------------------------");
	}
}