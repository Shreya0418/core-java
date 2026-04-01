class Mobile{
	
	String brand;
	String model;
	int price;
	boolean is5G;
	String color;
	
	Sim sim;
	
	public void getMobileDetails() {
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Price: " + price);
		System.out.println("5g: " + is5G);
		System.out.println("Color: " + color);
		System.out.println("---------------------");
		
		sim.getSimDetails();
	}
}