class Carpet {

    static int price = 2490;
    static String brand = "W R CARPETS & RUGS";
    static String color = "MUSTARD YELLOW";
    static String size = "3' x 5'";
    static String material = "Microfiber";
    static String weaveType = "Tufted";
    static String pileHeight = "High Pile";
    static String style = "Minimalist";
    static String shape = "Rectangular";

    public static void main(String[] args) {

        int price = 2999;
        String brand = "HomeStyle Carpets";
        String color = "Beige";
        String size = "4' x 6'";
        String material = "Polyester";
        String weaveType = "Handwoven";
        String pileHeight = "Medium Pile";
        String style = "Modern";
        String shape = "Oval";

        // local variables
        System.out.println("The Price is  " + price);
        System.out.println("The Brand is  " + brand);
        System.out.println("The Color is  " + color);
        System.out.println("The Size is  " + size);
        System.out.println("The Material is  " + material);
        System.out.println("The Weave Type is  " + weaveType);
        System.out.println("The Pile Height is  " + pileHeight);
        System.out.println("The Style is  " + style);
        System.out.println("The Shape is  " + shape);

        // static variables
        System.out.println("The Price is  " + Carpet.price);
        System.out.println("The Brand is  " + Carpet.brand);
        System.out.println("The Color is  " + Carpet.color);
        System.out.println("The Size is  " + Carpet.size);
        System.out.println("The Material is  " + Carpet.material);
        System.out.println("The Weave Type is  " + Carpet.weaveType);
        System.out.println("The Pile Height is  " + Carpet.pileHeight);
        System.out.println("The Style is  " + Carpet.style);
        System.out.println("The Shape is  " + Carpet.shape);
    }
}
