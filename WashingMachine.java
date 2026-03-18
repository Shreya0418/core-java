class WashingMachine {

    public static String getBrand() {
        System.out.println("getBrand() invoked");
        return "LG";
    }

    public static int getCapacityKG() {
        System.out.println("getCapacityKG() invoked");
        return 7;
    }

    public static String getType() {
        System.out.println("getType() invoked");
        return "Front Load Fully Automatic";
    }

    public static int getSpinSpeedRPM() {
        System.out.println("getSpinSpeedRPM() invoked");
        return 1200;
    }

    public static double getPrice() {
        System.out.println("getPrice() invoked");
        return 29999.00;
    }
}