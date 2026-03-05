class Scooter {

    static int price = 92588;
	static String manufacturer  = "Bajaj" ;
    static String brand = "Jaguar";
    static String color= "black";
    static String model = "00GL458V";
    static String size = "45cm";
    static String countryOfOrigin  = "US" ;
    static String weight = "178 kg" ;
    static String features = "Solid Metal Body";

  public static void main(String[] args) {

    int price = 129848;
	String manufacturer = "Bajaj Auto Limited";
	String brand = "Chetak";
    String color = "Brooklyn black";
    String model = "00GL549V";
    String size = "standard";
    String countryOfOrigin = "India";
    String weight = "129 kg";
    String features = "Solid Metal Body ,IP 67 Rated Water Resistance. \n";
    
	
	//local variable
    System.out.println("The price is  " + price);  
    System.out.println("The manufacturer is  " + manufacturer);
    System.out.println("The brand it belongs to is  " + brand);
    System.out.println("The color is  " + color);
    System.out.println("The model is  " + model);
    System.out.println("The size is  " + size);
	System.out.println("The product is made in is  " + countryOfOrigin);
    System.out.println("The weight is  " + weight);
    System.out.println("The features includes are  " + features);
	
	//static variable
	System.out.println("The brand it belongs to is  " + Scooter.brand);
	System.out.println("The manufacturer is  " + Scooter.manufacturer);
	System.out.println("The price is  " + Scooter.price);
	System.out.println("The color is  " + Scooter.color);
    System.out.println("The model is  " + Scooter.model);
    System.out.println("The size is  " + Scooter.size);
	System.out.println("The product is made in is  " + Scooter.countryOfOrigin);
    System.out.println("The weight is  " + Scooter.weight);
    System.out.println("The features includes are  " + Scooter.features);
	                       //implicit reference  + //explicit refernce
	
    }
}