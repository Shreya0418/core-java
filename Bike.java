class Bike {

    static int price = 239924;
    static String brand = "Hero MotoCorp";
    static String color = "Enigma Pearl Black";
    static String productDimensions = "210 x 86.8 x 111.2 cm; 191 kg";
    static String model = "HM44ACDSCFIPEB";
    static String itemPartNumber = "HM44ACDSCFIPEB";
    static String size = "Mavric 440 Top";
    static String manufacturer = "Hero Motocorp Ltd";
    static String itemWeight = "191 kg";

    public static void main(String[] args) {

        int price = 259999;
        String brand = "Royal Enfield";
        String color = "Stealth Black";
        String productDimensions = "214 x 84 x 110 cm; 195 kg";
        String model = "REH45XTR";
        String itemPartNumber = "REH45XTR";
        String size = "Classic 350";
        String manufacturer = "Royal Enfield Ltd";
        String itemWeight = "195 kg";

        // local variables
        System.out.println("The Price is  " + price);
        System.out.println("The Brand is  " + brand);
        System.out.println("The Color is  " + color);
        System.out.println("The Product Dimensions is  " + productDimensions);
        System.out.println("The Model is  " + model);
        System.out.println("The Item Part Number is  " + itemPartNumber);
        System.out.println("The Size is  " + size);
        System.out.println("The Manufacturer is  " + manufacturer);
        System.out.println("The Item Weight is  " + itemWeight);

        // static variables
        System.out.println("The Price is  " + Bike.price);
        System.out.println("The Brand is  " + Bike.brand);
        System.out.println("The Color is  " + Bike.color);
        System.out.println("The Product Dimensions is  " + Bike.productDimensions);
        System.out.println("The Model is  " + Bike.model);
        System.out.println("The Item Part Number is  " + Bike.itemPartNumber);
        System.out.println("The Size is  " + Bike.size);
        System.out.println("The Manufacturer is  " + Bike.manufacturer);
        System.out.println("The Item Weight is  " + Bike.itemWeight);
    }
}
