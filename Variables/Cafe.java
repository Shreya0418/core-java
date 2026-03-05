class Cafe{
	
	static String teaNames[] = {"Lemon Tea", "Ginger Tea", "Green Tea", "Black Tea", "Chamomile Tea", "Herbal Tea", "Matcha Tea", "White Tea", "Masala Tea", "Darjeeling Tea", "Irani Chai", "Oolong Tea", "Lemongrass", "Tandoori Chai", "Peach Tea"};  //object type of reference
	static String coffeeNames[] = {"Espresso", "Americano", "Latte", "Cappuccino", "Mocha", "Flat White", "Macchiato", "Cortado", "Iced Coffee", "Cuban Coffee", "Dalgona", "Turkish Coffee", "Antoccino Coffee", "Cold Coffee", "Black Coffee" };
	static String snacksNames[] = {"Pastries", "Croissants", "Muffins", "Biscuits", "Cheesecake", "Cookies", "Cheese Maggie", "Samosa", "VadaPav", "Churros", "Donuts", "Brownies", "Momos", "Sandwiches", "Strawberry Chocolate", "Popcorn" };
		
	
	//tea, coffe, snacks
	
	public static void main(String[] cafe) {
		
		// Datatype refName = ref;
		
		String cafeName = "Shremonya Coffee";
		System.out.println("Main String");
		
		getTeaNames();
		getCoffeeNames();
		getSnacksNames();
		
		// String teaName = "Lemon Tea";
		// String teaName2 = "Ginger Tea";
		// String teaName3 = "Green Tea";
		// String teaName4 = "Black Tea";
		
		
		// System.out.println("The Cafe Name is : " + cafeName);
		// System.out.println("The List of Teas are : ");
		// System.out.println(teaNames[0]+"\n"+ teaNames[1]+"\n" + teaNames[2]+ "\n" + teaNames[3]+ "\n" + teaNames[4]+ "\n" + teaNames[5]+ "\n" + teaNames[6]+ "\n" + teaNames[7]+ "\n" +teaNames[8]+ "\n" +teaNames[9]+ "\n" +teaNames[10]+ "\n" +teaNames[11]+ "\n" + teaNames[12]+ "\n" +teaNames[13]+ "\n" +teaNames[14] );
		// System.out.println("\n");
		// System.out.println("The List of Coffees are : ");
		// System.out.println(coffeeNames[0] + "\n" + coffeeNames[1] + "\n" + coffeeNames[2] + "\n" +coffeeNames[3] + "\n" +coffeeNames[4] + "\n" +coffeeNames[5] + "\n" +coffeeNames[6] + "\n"+coffeeNames[7] + "\n"+coffeeNames[8] + "\n"+coffeeNames[9] + "\n" +coffeeNames[10] + "\n"+coffeeNames[11] + "\n"+coffeeNames[12] + "\n"+coffeeNames[13] + "\n" + coffeeNames[14] );
		// System.out.println("\n");
		// System.out.println("The List of Snacks are : ");
		// System.out.println(snacksNames[0] + "\n" + snacksNames[1] + "\n" + snacksNames[2] + "\n" + snacksNames[3] + "\n" + snacksNames[4] + "\n" + snacksNames[5] + "\n" + snacksNames[6] + "\n" + snacksNames[7] + "\n" + snacksNames[8] + "\n" + snacksNames[9] + "\n" + snacksNames[10] + "\n" + snacksNames[11] + "\n" + snacksNames[12] + "\n" + snacksNames[13] + "\n" + snacksNames[14]   );
		
		
	
	}
	
	//purpose 
	   static void getTeaNames() {   //static cause its invoked inside the static main method
		   System.out.println("\nThe available tea names are: ");
		   for(String teaName : teaNames) {     //teaName is inside the main so the teaName must be non static so invoke method in the main
			   System.out.println(teaName);
		   }
	   }
	   
	   static void getCoffeeNames() {
		   System.out.println("\nThe Available Coffee Names : ");
		   for(String coffeeName : coffeeNames) {
			   System.out.println(coffeeName);
		   }
	   }
	   
	   static void getSnacksNames() {
		   System.out.println("\nThe Available Snacks Names : ");
		   for(String snackName : snacksNames) {
			   System.out.println(snackName);
		   }
	   }



}