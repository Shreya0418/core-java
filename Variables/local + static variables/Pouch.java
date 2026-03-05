class Pouch {

    static int price = 699;
    static String brand = "Daily Objects";
    static String color = "Khaki Beige";
    static String productDimensions = "24.49 x 11.99 x 18.29 cm";
    static String material = "Canvas";
    static String closureType = "Zipper";
    static String occassionType = "Casual";
    static String style = "Cosmetic Bag";
    static String itemWeight = "100 g";

    public static void main(String[] args) {

        int price = 899;
        String brand = "Wildcraft";
        String color = "Navy Blue";
        String productDimensions = "25 x 12 x 20 cm";
        String material = "Polyester";
        String closureType = "Button";
        String occassionType = "Travel";
        String style = "Utility Pouch";
        String itemWeight = "150 g";

        // local variables
        System.out.println("The Price is  " + price);
        System.out.println("The Brand is  " + brand);
        System.out.println("The Color is  " + color);
        System.out.println("The Product Dimensions is  " + productDimensions);
        System.out.println("The Material is  " + material);
        System.out.println("The Closure Type is  " + closureType);
        System.out.println("The Occasion Type is  " + occassionType);
        System.out.println("The Style is  " + style);
        System.out.println("The Item Weight is  " + itemWeight);

        // static variables
        System.out.println("The Price is  " + Pouch.price);
        System.out.println("The Brand is  " + Pouch.brand);
        System.out.println("The Color is  " + Pouch.color);
        System.out.println("The Product Dimensions is  " + Pouch.productDimensions);
        System.out.println("The Material is  " + Pouch.material);
        System.out.println("The Closure Type is  " + Pouch.closureType);
        System.out.println("The Occasion Type is  " + Pouch.occassionType);
        System.out.println("The Style is  " + Pouch.style);
        System.out.println("The Item Weight is  " + Pouch.itemWeight);
    }
}
