class Sofa {

    static int price = 45999;
    static String brand = "Urban Ladder";
    static String color = "Grey";
    static String material = "Fabric";
    static int seatingCapacity = 3;
    static String shape = "L-Shape";

    public static void main(String[] args) {

        int price = 49999;
        String brand = "Pepperfry";
        String color = "Brown";
        String material = "Leather";
        int seatingCapacity = 4;
        String shape = "U-Shape";

        // local
        System.out.println("Price is " + price);
        System.out.println("Brand is " + brand);
        System.out.println("Color is " + color);
        System.out.println("Material is " + material);
        System.out.println("Seating Capacity is " + seatingCapacity);
        System.out.println("Shape is " + shape);

        // static
        System.out.println("Price is " + Sofa.price);
        System.out.println("Brand is " + Sofa.brand);
        System.out.println("Color is " + Sofa.color);
        System.out.println("Material is " + Sofa.material);
        System.out.println("Seating Capacity is " + Sofa.seatingCapacity);
        System.out.println("Shape is " + Sofa.shape);
    }
}
