class Television {

    static String brand = "LG";
    static int modelYear = 2025;
    static String productDimensions = "23 x 123.6 x 78 cm 11.5 kg";
    static String itemModelNumber = "55UA82006LA";
    static String operatingSystem = "WebOS";
    static String tunerTechnology = "DVB-T2/T (Terrestrial), DVB-C (Cable), DVB-S2/S (Satellite)";
    static String responseTime = "6.5 Milliseconds";
    static String displayTechnology = "4K UHD";
    static String displayType = "IPS";

    public static void main(String args[]) {

        String brand = "Samsung";
        int modelYear = 2024;
        String productDimensions = "25 x 122 x 76 cm 12 kg";
        String itemModelNumber = "UA55CU7700";
        String operatingSystem = "Tizen OS";
        String tunerTechnology = "DVB-T2, DVB-C";
        String responseTime = "5 Milliseconds";
        String displayTechnology = "Crystal 4K UHD";
        String displayType = "LED";

        // local variables
        System.out.println("The Brand is  " + brand);
        System.out.println("The Model Year is  " + modelYear);
        System.out.println("The Product Dimensions is  " + productDimensions);
        System.out.println("The Item Model Number is  " + itemModelNumber);
        System.out.println("The Operating System of Product is  " + operatingSystem);
        System.out.println("The Tuner Technology is  " + tunerTechnology);
        System.out.println("The Response Time is  " + responseTime);
        System.out.println("The Display Technology is  " + displayTechnology);
        System.out.println("The Display Type is  " + displayType);

        // static variables
        System.out.println("The Brand is  " + Television.brand);
        System.out.println("The Model Year is  " + Television.modelYear);
        System.out.println("The Product Dimensions is  " + Television.productDimensions);
        System.out.println("The Item Model Number is  " + Television.itemModelNumber);
        System.out.println("The Operating System of Product is  " + Television.operatingSystem);
        System.out.println("The Tuner Technology is  " + Television.tunerTechnology);
        System.out.println("The Response Time is  " + Television.responseTime);
        System.out.println("The Display Technology is  " + Television.displayTechnology);
        System.out.println("The Display Type is  " + Television.displayType);
    }
}
