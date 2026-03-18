class HeadSetExecutor{
	
	public static void main(String[] headset){
		
	System.out.println("Main started");
	
	String brand = HeadSet.getBrand();
	double price = HeadSet.getPrice();
	String color = HeadSet.getColor();
	
	System.out.println("Brand: " + brand);
	System.out.println("Price: " + price);
	System.out.println("Color: " + color);
		
	 // String brand = HeadSet.getBrand();         //getBrandis called by main and main by JVM
	// System.out.println("The brand name is: " + HeadSet.getBrand());  //2 methods are executing
	 // double price = HeadSet.getPrice();
	// System.out.println("The price is: " + HeadSet.getPrice());
	// String color = HeadSet.getColor();
	// System.out.println("The Color is: " + color);
	
	
	
	System.out.println("Main ended"); 
	}
}