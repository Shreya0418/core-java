class Tablet {

    static int price = 24999;
    static String brand = "Apple";
    static String model = "iPad 10th Gen";
    static int storage = 64;
    static String color = "Blue";
    static double screenSize = 10.9;

    public static void main(String[] args) {

        int price = 29999;
        String brand = "Samsung";
        String model = "Galaxy Tab S9";
        int storage = 128;
        String color = "Graphite";
        double screenSize = 11.0;

        // local
        System.out.println("Price is " + price);
        System.out.println("Brand is " + brand);
        System.out.println("Model is " + model);
        System.out.println("Storage is " + storage + "GB");
        System.out.println("Color is " + color);
        System.out.println("Screen Size is " + screenSize);

        // static
        System.out.println("Price is " + Tablet.price);
        System.out.println("Brand is " + Tablet.brand);
        System.out.println("Model is " + Tablet.model);
        System.out.println("Storage is " + Tablet.storage + "GB");
        System.out.println("Color is " + Tablet.color);
        System.out.println("Screen Size is " + Tablet.screenSize);
    }
}
