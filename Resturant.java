class Restaurant{

	String restaurantName;
	String location;
	int rating;
	boolean isOpen;
	String cuisine;

	Chef chef;

	public void getRestaurantDetails(){
		System.out.println("Restaurant Name: " + restaurantName);
		System.out.println("Location: " + location);
		System.out.println("Rating: " + rating);
		System.out.println("Open: " + isOpen);
		System.out.println("Cuisine: " + cuisine);
		System.out.println("----------------------");

		chef.getChefDetails();
	}
}