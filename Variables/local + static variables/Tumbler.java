class Tumbler {

    static int price = 1399;
    static String brand = "Milton";
    static String color = "Cream";
    static String includedComponents = "1 PC - MALMO 1200 Tumbler";
    static String material = "Stainless Steel";
    static String capacity = "1100 Milliliters";
    static String specialFeature = "Double Wall Vacuum Insulated";
    static String style = "Minimalist";
    static String shape = "Round";

    public static void main(String[] args) {

        int price = 999;
        String brand = "Cello";
        String color = "Blue";
        String includedComponents = "1 PC - Insulated Bottle";
        String material = "Steel";
        String capacity = "1000 Milliliters";
        String specialFeature = "Leak Proof";
        String style = "Modern";
        String shape = "Cylindrical";

        // local variables
        System.out.println("The Price is  " + price);
        System.out.println("The Brand is  " + brand);
        System.out.println("The Color is  " + color);
        System.out.println("The Included Components is  " + includedComponents);
        System.out.println("The Material is  " + material);
        System.out.println("The Capacity is  " + capacity);
        System.out.println("The Special Feature is  " + specialFeature);
        System.out.println("The Style is  " + style);
        System.out.println("The Shape is  " + shape);

        // static variables
        System.out.println("The Price is  " + Tumbler.price);
        System.out.println("The Brand is  " + Tumbler.brand);
        System.out.println("The Color is  " + Tumbler.color);
        System.out.println("The Included Components is  " + Tumbler.includedComponents);
        System.out.println("The Material is  " + Tumbler.material);
        System.out.println("The Capacity is  " + Tumbler.capacity);
        System.out.println("The Special Feature is  " + Tumbler.specialFeature);
        System.out.println("The Style is  " + Tumbler.style);
        System.out.println("The Shape is  " + Tumbler.shape);
    }
}
