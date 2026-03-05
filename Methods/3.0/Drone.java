class Drone {

    public static String getBrand() {
        System.out.println("getBrand() invoked");
        return "DJI";
    }

    public static double getPrice() {
        System.out.println("getPrice() invoked");
        return 89999.00;
    }

    public static String getCameraQuality() {
        System.out.println("getCameraQuality() invoked");
        return "4K Ultra HD";
    }

    public static int getFlightTimeMinutes() {
        System.out.println("getFlightTimeMinutes() invoked");
        return 34;
    }

    public static String getControlRange() {
        System.out.println("getControlRange() invoked");
        return "10 km";
    }
}