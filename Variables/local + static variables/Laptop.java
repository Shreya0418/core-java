class Laptop {

    static int price = 65999;
    static String brand = "Dell";
    static String processor = "Intel i7";
    static int ram = 16;
    static int storage = 512;
    static String operatingSystem = "Windows 11";
    static String color = "Silver";
    static double screenSize = 15.6;

    public static void main(String[] args) {

        int price = 74999;
        String brand = "HP";
        String processor = "Intel i9";
        int ram = 32;
        int storage = 1024;
        String operatingSystem = "Windows 11 Pro";
        String color = "Black";
        double screenSize = 16.0;

        // local
        System.out.println("Price is " + price);
        System.out.println("Brand is " + brand);
        System.out.println("Processor is " + processor);
        System.out.println("RAM is " + ram + "GB");
        System.out.println("Storage is " + storage + "GB");
        System.out.println("OS is " + operatingSystem);
        System.out.println("Color is " + color);
        System.out.println("Screen Size is " + screenSize);

        // static
        System.out.println("Price is " + Laptop.price);
        System.out.println("Brand is " + Laptop.brand);
        System.out.println("Processor is " + Laptop.processor);
        System.out.println("RAM is " + Laptop.ram + "GB");
        System.out.println("Storage is " + Laptop.storage + "GB");
        System.out.println("OS is " + Laptop.operatingSystem);
        System.out.println("Color is " + Laptop.color);
        System.out.println("Screen Size is " + Laptop.screenSize);
    }
}
