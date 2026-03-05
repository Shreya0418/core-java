class DMart{
	
	static String sectionNames[] = {"Groceries", "Fruits and Vegetables", "Dairy Products", "Snacks & Beverages", "Personal Care", "Home Cleaning", "Kitchen Essentials", "Stationary", "Clothing", "Electronics"};
	
	public static void getSectionNames() {
		System.out.println("Main method invoked");
		
		for(String sectionName : sectionNames) {
			System.out.println(sectionName);
		}
		
		System.out.println("Invoke ended");
	}

}