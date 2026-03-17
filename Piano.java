class Piano {

    static int price = 54999;
    static String brand = "Casio";
    static String color = "Black";
    static String instrumentType = "Digital Piano";
    static int numberOfKeys = 88;
    static String model = "CDP-S110";
    static String manufacturer = "Casio India Co. Pvt. Ltd.";
    static String material = "Plastic and Metal";
    static double weight = 10.5;

    public static void main(String[] args) {

        int price = 62999;
        String brand = "Yamaha";
        String color = "White";
        String instrumentType = "Grand Digital Piano";
        int numberOfKeys = 88;
        String model = "P-145";
        String manufacturer = "Yamaha Music India Pvt. Ltd.";
        String material = "Wood and Metal";
        double weight = 11.2;

        // local variables
        System.out.println("The price is  " + price);
        System.out.println("The brand is  " + brand);
        System.out.println("The color is  " + color);
        System.out.println("The instrument type is  " + instrumentType);
        System.out.println("Number of keys  " + numberOfKeys);
        System.out.println("The model is  " + model);
        System.out.println("The material is  " + material);
        System.out.println("The weight is  " + weight);
        System.out.println("The manufacturer is  " + manufacturer);

        // static variables
        System.out.println("The price is  " + Piano.price);
        System.out.println("The brand is  " + Piano.brand);
        System.out.println("The color is  " + Piano.color);
        System.out.println("The instrument type is  " + Piano.instrumentType);
        System.out.println("Number of keys  " + Piano.numberOfKeys);
        System.out.println("The model is  " + Piano.model);
        System.out.println("The material is  " + Piano.material);
        System.out.println("The weight is  " + Piano.weight);
        System.out.println("The manufacturer is  " + Piano.manufacturer);
    }
}
