class Backpack {

    static int price = 1999;
    static String brand = "Skybags";
    static String color = "Blue";
    static int capacity = 35;
    static String material = "Polyester";
    static String pattern = "Printed";

    public static void main(String[] args) {

        int price = 2499;
        String brand = "Wildcraft";
        String color = "Black";
        int capacity = 40;
        String material = "Nylon";
        String pattern = "Solid";

        // local
        System.out.println("Price is " + price);
        System.out.println("Brand is " + brand);
        System.out.println("Color is " + color);
        System.out.println("Capacity is " + capacity + "L");
        System.out.println("Material is " + material);
        System.out.println("Pattern is " + pattern);

        // static
        System.out.println("Price is " + Backpack.price);
        System.out.println("Brand is " + Backpack.brand);
        System.out.println("Color is " + Backpack.color);
        System.out.println("Capacity is " + Backpack.capacity + "L");
        System.out.println("Material is " + Backpack.material);
        System.out.println("Pattern is " + Backpack.pattern);
    }
}
