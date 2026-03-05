class Bicycle {

    static int price = 129848;
    static String manufacturer = "Bajaj Auto Limited";
    static String brand = "Chetak";
    static String color = "Brooklyn black";
    static String model = "00GL549V";
    static String size = "standard";
    static String countryOfOrigin = "India";
    static String weight = "129 kg";
    static String features = "Solid Metal Body, IP 67 Rated Water Resistance, ARAI Certified Range - 153 km, Charges 80% in 3 hrs, TFT Touch Display, Chetak App, Map Navigation, 35 L Bootspace";

    public static void main(String[] args) {

        int price = 15999;
        String manufacturer = "Hero Cycles Ltd";
        String brand = "Hero Sprint";
        String color = "Red";
        String model = "SPR-21";
        String size = "Medium";
        String countryOfOrigin = "India";
        String weight = "15 kg";
        String features = "Steel Frame, Dual Disc Brakes, 21 Speed Gears, Adjustable Seat";

        // local variables
        System.out.println("The price is  " + price);
        System.out.println("The manufacturer is  " + manufacturer);
        System.out.println("The brand it belongs to is  " + brand);
        System.out.println("The color is  " + color);
        System.out.println("The model is  " + model);
        System.out.println("The size is  " + size);
        System.out.println("The product is made in  " + countryOfOrigin);
        System.out.println("The weight is  " + weight);
        System.out.println("The features include  " + features);

        // static variables
        System.out.println("The price is  " + Bicycle.price);
        System.out.println("The manufacturer is  " + Bicycle.manufacturer);
        System.out.println("The brand it belongs to is  " + Bicycle.brand);
        System.out.println("The color is  " + Bicycle.color);
        System.out.println("The model is  " + Bicycle.model);
        System.out.println("The size is  " + Bicycle.size);
        System.out.println("The product is made in  " + Bicycle.countryOfOrigin);
        System.out.println("The weight is  " + Bicycle.weight);
        System.out.println("The features include  " + Bicycle.features);
    }
}
