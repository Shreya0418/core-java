class Adapter {

    static int price = 299;
    static String brand = "Portronics";
    static String color = "White";
    static String adapterType = "C-Pin Adapter";
    static int inputVoltage = 240;
    static int wattage = 20;
    static String plugType = "2 Pin to 3 Pin";
    static String material = "Polycarbonate";
    static String safetyFeature = "Shock Proof";
    static String manufacturer = "Portronics Digital Pvt. Ltd. ";
 
    public static void main(String[] args) {

        int price = 499;
        String brand = "Portronics FastCharge";
        String color = "Matte White";
        String adapterType = "C-Type Fast Adapter";
        int inputVoltage = 220;
        int wattage = 25;
        String plugType = "Universal 3 Pin";
        String material = "ABS Plastic";
        String safetyFeature = "Overheat Protection";
        String manufacturer = "Portronics India Pvt. Ltd.";

        // local variables
        System.out.println("The price is : " + price);
        System.out.println("The brand is : " + brand);
        System.out.println("The color is  : " + color);
        System.out.println("The adapter type is : " + adapterType);
        System.out.println("The input voltage is : " + inputVoltage);
        System.out.println("The wattage is : " + wattage);
        System.out.println("The plug type is : " + plugType);
        System.out.println("The material is : " + material);
        System.out.println("The safety feature is : " + safetyFeature);
        System.out.println("The manufacturer is : " + manufacturer);

        // static variables
		System.out.println("The price is  : " + Adapter.price);
        System.out.println("The brand is : " + Adapter.brand);
		System.out.println("The color is : " + Adapter.color);
        System.out.println("The adapter type is : " + Adapter.adapterType);
        System.out.println("The input voltage is : " + Adapter.inputVoltage);
        System.out.println("The wattage is : " + Adapter.wattage);
        System.out.println("The plug type is : " + Adapter.plugType);
        System.out.println("The material is : " + Adapter.material);
        System.out.println("The safety feature is : " + Adapter.safetyFeature);
		System.out.println("The manufacturer is : " + Adapter.manufacturer);
    }
}
