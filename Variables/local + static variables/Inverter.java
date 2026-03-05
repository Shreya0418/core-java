class Inverter {

    static int price = 32990;
    static String brand = "Carrier";
    static String capacity = "1.5 Tons";
    static String coolingPower = "4800 Kilowatts";
    static String specialFeature = "Auto Clean, Dehumidifier, Fast Cooling, High Density, Inverter Compressor";
    static String productDimensions = "20.5D x 94W x 27.5H Centimeters";
    static int startYear = 2026;
    static String modelName = "AC";
    static String modelNumber = "CAI18EE3R36F0";
    static String noiseLevel = "37 Decibels";

    public static void main(String[] args) {

        int price = 35990;
        String brand = "LG";
        String capacity = "1 Ton";
        String coolingPower = "3500 Kilowatts";
        String specialFeature = "Dual Inverter, Energy Saving, Fast Cooling";
        String productDimensions = "22D x 90W x 28H Centimeters";
        int startYear = 2025;
        String modelName = "Smart AC";
        String modelNumber = "LGI12XTR";
        String noiseLevel = "32 Decibels";

        // local variables
        System.out.println("The Price is  " + price);
        System.out.println("The Brand is  " + brand);
        System.out.println("The Capacity is  " + capacity);
        System.out.println("The Cooling Power is  " + coolingPower);
        System.out.println("The Special Feature is  " + specialFeature);
        System.out.println("The Product Dimensions is  " + productDimensions);
        System.out.println("The Start Year is  " + startYear);
        System.out.println("The Model Name is  " + modelName);
        System.out.println("The Model Number is  " + modelNumber);
        System.out.println("The Noise Level is  " + noiseLevel);

        // static variables
        System.out.println("The Price is  " + Inverter.price);
        System.out.println("The Brand is  " + Inverter.brand);
        System.out.println("The Capacity is  " + Inverter.capacity);
        System.out.println("The Cooling Power is  " + Inverter.coolingPower);
        System.out.println("The Special Feature is  " + Inverter.specialFeature);
        System.out.println("The Product Dimensions is  " + Inverter.productDimensions);
        System.out.println("The Start Year is  " + Inverter.startYear);
        System.out.println("The Model Name is  " + Inverter.modelName);
        System.out.println("The Model Number is  " + Inverter.modelNumber);
        System.out.println("The Noise Level is  " + Inverter.noiseLevel);
    }
}
