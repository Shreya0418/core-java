class SmartDoorLock {

    public static String getBrand() {
        System.out.println("getBrand() invoked");
        return "Godrej";
    }

    public static String getUnlockType() {
        System.out.println("getUnlockType() invoked");
        return "Fingerprint & PIN Access";
    }

    public static String getConnectivity() {
        System.out.println("getConnectivity() invoked");
        return "Bluetooth";
    }

    public static String getMaterial() {
        System.out.println("getMaterial() invoked");
        return "Stainless Steel";
    }

    public static double getPrice() {
        System.out.println("getPrice() invoked");
        return 15999.00;
    }
}