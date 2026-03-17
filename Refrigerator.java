class Refrigerator {

    static int price = 28999;
    static String brand = "Samsung";
    static int capacity = 253;
    static String energyRating = "3 Star";
    static String color = "Silver";
    static String type = "Double Door";
    static String compressorType = "Digital Inverter";

    public static void main(String[] args) {

        int price = 31999;
        String brand = "LG";
        int capacity = 260;
        String energyRating = "4 Star";
        String color = "Grey";
        String type = "Frost Free";
        String compressorType = "Smart Inverter";

        // local
        System.out.println("Price is " + price);
        System.out.println("Brand is " + brand);
        System.out.println("Capacity is " + capacity + "L");
        System.out.println("Energy Rating is " + energyRating);
        System.out.println("Color is " + color);
        System.out.println("Type is " + type);
        System.out.println("Compressor Type is " + compressorType);

        // static
        System.out.println("Price is " + Refrigerator.price);
        System.out.println("Brand is " + Refrigerator.brand);
        System.out.println("Capacity is " + Refrigerator.capacity + "L");
        System.out.println("Energy Rating is " + Refrigerator.energyRating);
        System.out.println("Color is " + Refrigerator.color);
        System.out.println("Type is " + Refrigerator.type);
        System.out.println("Compressor Type is " + Refrigerator.compressorType);
    }
}
