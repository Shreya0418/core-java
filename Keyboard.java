class Keyboard {

    static int price = 599;
    static String brand = "HP";
    static String model = "K120";
    static String color = "Black";
    static String formFactor = "Keyboard";
    static String powerSource = "Corded Electric";
    static String itemWeight = "400 g";
    static String dimensions = "43.6 x 14 x 2.5 cm";
    static String manufacturer = "HP India Sales Pvt. Ltd.";
    static String countryOfOrigin = "China";
    static String warranty = "3 Years RTB Warranty";
    static String components = "USB Keyboard";

    public static void main(String[] args) {

        int price = 799;
        String brand = "Logitech";
        String model = "K380";
        String color = "Dark Grey";
        String formFactor = "Wireless Keyboard";
        String powerSource = "Battery Powered";
        String itemWeight = "423 g";
        String dimensions = "27.9 x 12.4 x 1.6 cm";
        String manufacturer = "Logitech India Pvt. Ltd.";
        String countryOfOrigin = "India";
        String warranty = "1 Year Limited Warranty";
        String components = "Wireless Keyboard, AAA Batteries";

        // local variables
        System.out.println("The price is  " + price);
        System.out.println("The brand is  " + brand);
        System.out.println("The model is  " + model);
        System.out.println("The color is  " + color);
        System.out.println("The form factor is  " + formFactor);
        System.out.println("The power source is  " + powerSource);
        System.out.println("The item weight is  " + itemWeight);
        System.out.println("The dimensions are  " + dimensions);
        System.out.println("The manufacturer is  " + manufacturer);
        System.out.println("The country of origin is  " + countryOfOrigin);
        System.out.println("The warranty is  " + warranty);
        System.out.println("The components included are  " + components);

        // static variables
        System.out.println("The price is  " + Keyboard.price);
        System.out.println("The brand is  " + Keyboard.brand);
        System.out.println("The model is  " + Keyboard.model);
        System.out.println("The color is  " + Keyboard.color);
        System.out.println("The form factor is  " + Keyboard.formFactor);
        System.out.println("The power source is  " + Keyboard.powerSource);
        System.out.println("The item weight is  " + Keyboard.itemWeight);
        System.out.println("The dimensions are  " + Keyboard.dimensions);
        System.out.println("The manufacturer is  " + Keyboard.manufacturer);
        System.out.println("The country of origin is  " + Keyboard.countryOfOrigin);
        System.out.println("The warranty is  " + Keyboard.warranty);
        System.out.println("The components included are  " + Keyboard.components);
    }
}
