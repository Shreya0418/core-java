class CeilingLamp{

    static int price = 1994;
    static String brand = "Murphy";
    static String color = "3-Ring Golden";
    static String material = "Aluminium";
    static String style = "Modern";
    static String lightFixtureForm = "Chandelier";
    static String productDimensions = "60L x 60W x 100H Centimeters";
    static String specificUsage = "Provide Light";
    static String powerSource = "Electric";

    public static void main(String[] args) {

        int price = 2599;
        String brand = "Philips";
        String color = "Matte Black";
        String material = "Metal";
        String style = "Contemporary";
        String lightFixtureForm = "Pendant Light";
        String productDimensions = "50L x 50W x 90H Centimeters";
        String specificUsage = "Living Room Lighting";
        String powerSource = "LED Electric";

        // local variables
        System.out.println("The Price is  " + price);
        System.out.println("The Brand is  " + brand);
        System.out.println("The Color is  " + color);
        System.out.println("The Material is  " + material);
        System.out.println("The Style is  " + style);
        System.out.println("The Light Fixture Form is  " + lightFixtureForm);
        System.out.println("The Product Dimensions is  " + productDimensions);
        System.out.println("The Specific Usage is  " + specificUsage);
        System.out.println("The Power Source is  " + powerSource);

        // static variables
        System.out.println("The Price is  " + CeilingLamp.price);
        System.out.println("The Brand is  " + CeilingLamp.brand);
        System.out.println("The Color is  " + CeilingLamp.color);
        System.out.println("The Material is  " + CeilingLamp.material);
        System.out.println("The Style is  " + CeilingLamp.style);
        System.out.println("The Light Fixture Form is  " + CeilingLamp.lightFixtureForm);
        System.out.println("The Product Dimensions is  " + CeilingLamp.productDimensions);
        System.out.println("The Specific Usage is  " + CeilingLamp.specificUsage);
        System.out.println("The Power Source is  " + CeilingLamp.powerSource);
    }
}
