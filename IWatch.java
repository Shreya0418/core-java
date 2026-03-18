class IWatch {

    public static String getBrand() {
        System.out.println("getBrand() invoked");
        return "Apple";
    }

    public static double getPrice() {
        System.out.println("getPrice() invoked");
        return 44999.00;
    }

    public static String getModel() {
        System.out.println("getModel() invoked");
        return "Apple Watch Series 9";
    }

    public static String getDisplayType() {
        System.out.println("getDisplayType() invoked");
        return "Retina OLED";
    }

    public static int getBatteryLifeHours() {
        System.out.println("getBatteryLifeHours() invoked");
        return 18;
    }
}