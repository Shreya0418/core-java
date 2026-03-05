class Watch {

    static int price = 3299;
    static String brand = "boAt";
    static String color = "Black";
    static String operatingSystem = "Android";
    static String connectivityTechnology = "Bluetooth";
    static String batteryCellComposition = "Lithium Polymer";
    static String materialType = "Metal";
    static String shape = "Round";
    static String manufacturer = "Imagine Marketing Ltd";

    public static void main(String[] args) {

        int price = 4999;
        String brand = "Noise";
        String color = "Silver";
        String operatingSystem = "Android & iOS";
        String connectivityTechnology = "Bluetooth 5.3";
        String batteryCellComposition = "Lithium Ion";
        String materialType = "Stainless Steel";
        String shape = "Square";
        String manufacturer = "NoiseFit Pvt Ltd";

        // local variables
        System.out.println("The Price is  " + price);
        System.out.println("The Brand is  " + brand);
        System.out.println("The Color is  " + color);
        System.out.println("The Operating System is  " + operatingSystem);
        System.out.println("The Material Type is  " + materialType);
        System.out.println("The Connectivity Technology is  " + connectivityTechnology);
        System.out.println("The Battery Composition is  " + batteryCellComposition);
        System.out.println("The Shape is  " + shape);
        System.out.println("The Manufacturer is  " + manufacturer);

        // static variables
        System.out.println("The Price is  " + Watch.price);
        System.out.println("The Brand is  " + Watch.brand);
        System.out.println("The Color is  " + Watch.color);
        System.out.println("The Operating System is  " + Watch.operatingSystem);
        System.out.println("The Material Type is  " + Watch.materialType);
        System.out.println("The Connectivity Technology is  " + Watch.connectivityTechnology);
        System.out.println("The Battery Composition is  " + Watch.batteryCellComposition);
        System.out.println("The Shape is  " + Watch.shape);
        System.out.println("The Manufacturer is  " + Watch.manufacturer);
    }
}
