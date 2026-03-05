class Instrument {

    static int price = 7299;
    static String brand = "Yamaha";
    static String color = "Natural";
    static String topMaterialType = "Spruce wood";
    static String bodyMaterial = "Rosewood";
    static double scaleLength = 40.5;
    static String size = "F280NT";
    static String manufacturer = "Yamaha Music India Private Limited";
    static String material = "Stainless steel";

    public static void main(String[] args) {

        int price = 8499;
        String brand = "Fender";
        String color = "Sunburst";
        String topMaterialType = "Mahogany";
        String bodyMaterial = "Maple";
        double scaleLength = 41.0;
        String size = "FA-125";
        String manufacturer = "Fender Musical Instruments Pvt Ltd";
        String material = "Alloy Steel";

        // local variables
        System.out.println("The price is  " + price);
        System.out.println("The material is  " + material);
        System.out.println("The body material is  " + bodyMaterial);
        System.out.println("The color is  " + color);
        System.out.println("The size is  " + size);
        System.out.println("The brand is  " + brand);
        System.out.println("The top material type is  " + topMaterialType);
        System.out.println("The length of scale is  " + scaleLength);
        System.out.println("The manufacturer is  " + manufacturer);

        // static variables
        System.out.println("The price is  " + Instrument.price);
        System.out.println("The material is  " + Instrument.material);
        System.out.println("The body material is  " + Instrument.bodyMaterial);
        System.out.println("The color is  " + Instrument.color);
        System.out.println("The size is  " + Instrument.size);
        System.out.println("The brand is  " + Instrument.brand);
        System.out.println("The top material type is  " + Instrument.topMaterialType);
        System.out.println("The length of scale is  " + Instrument.scaleLength);
        System.out.println("The manufacturer is  " + Instrument.manufacturer);
    }
}
