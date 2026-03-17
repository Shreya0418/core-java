class Badmiton {

    static int price = 189;
    static String material = "Plastic";
    static String baseMaterial = "Eva Cork";
    static String color = "Multicolor";
    static int quantity = 5;
    static String countryOfOrigin = "India";
    static String sport = "Badminton";
    static String manufacturer = "Padmawati Sports";
    static String season = "Year-round";

    public static void main(String[] args) {

        int price = 249;
        String material = "Nylon";
        String baseMaterial = "Premium Cork";
        String color = "White";
        int quantity = 10;
        String countryOfOrigin = "China";
        String sport = "Indoor Badminton";
        String manufacturer = "Yonex Sports Pvt Ltd";
        String season = "All Seasons";

        // local variables
        System.out.println("The price is  " + price);
        System.out.println("The material is  " + material);
        System.out.println("The base material is  " + baseMaterial);
        System.out.println("The color is  " + color);
        System.out.println("The quantity is  " + quantity);
        System.out.println("The product is made in  " + countryOfOrigin);
        System.out.println("The sport is  " + sport);
        System.out.println("The manufacturer company is  " + manufacturer);
        System.out.println("It is available in  " + season);

        // static variables
        System.out.println("The price is  " + Badmiton.price);
        System.out.println("The material is  " + Badmiton.material);
        System.out.println("The base material is  " + Badmiton.baseMaterial);
        System.out.println("The color is  " + Badmiton.color);
        System.out.println("The quantity is  " + Badmiton.quantity);
        System.out.println("The product is made in  " + Badmiton.countryOfOrigin);
        System.out.println("The sport is  " + Badmiton.sport);
        System.out.println("The manufacturer company is  " + Badmiton.manufacturer);
        System.out.println("It is available in  " + Badmiton.season);
    }
}
