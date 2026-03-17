class IPhone {

    static int price = 79999;
    static String brand = "Apple";
    static String model = "iPhone 16";
    static String color = "Midnight";
    static int storage = 128;
    static String processor = "A18 Bionic";
    static String camera = "48MP Dual Camera";
    static double screenSize = 6.1;
    static String operatingSystem = "iOS";
    static String manufacturer = "Apple Inc.";

    public static void main(String[] args) {

        int price = 89999;
        String brand = "Apple";
        String model = "iPhone 16 Pro";
        String color = "Titanium Black";
        int storage = 256;
        String processor = "A18 Pro Bionic";
        String camera = "64MP Triple Camera";
        double screenSize = 6.7;
        String operatingSystem = "iOS 18";
        String manufacturer = "Apple India Pvt Ltd";

        // local variables
        System.out.println("The price is  " + price);
        System.out.println("The brand is  " + brand);
        System.out.println("The model is  " + model);
        System.out.println("The color is  " + color);
        System.out.println("The storage is  " + storage + "GB");
        System.out.println("The processor is  " + processor);
        System.out.println("The camera is  " + camera);
        System.out.println("The screen size is  " + screenSize);
        System.out.println("The operating system is  " + operatingSystem);
        System.out.println("The manufacturer is  " + manufacturer);

        // static variables
        System.out.println("The price is  " + IPhone.price);
        System.out.println("The brand is  " + IPhone.brand);
        System.out.println("The model is  " + IPhone.model);
        System.out.println("The color is  " + IPhone.color);
        System.out.println("The storage is  " + IPhone.storage + "GB");
        System.out.println("The processor is  " + IPhone.processor);
        System.out.println("The camera is  " + IPhone.camera);
        System.out.println("The screen size is  " + IPhone.screenSize);
        System.out.println("The operating system is  " + IPhone.operatingSystem);
        System.out.println("The manufacturer is  " + IPhone.manufacturer);
    }
}
