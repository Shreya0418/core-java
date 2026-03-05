class Heels {

    static int price = 999;
    static String brand = "Diva Looks";
    static String color = "Burgundy";
    static String closureType = "Pull-On";
    static String heelType = "Stiletto Heel";
    static String waterResistanceLevel = "Not Water Resistant";
    static String materialType = "Faux Leather";
    static String style = "Heels";
    static String manufacturer = "Bansal Enterprises";

    public static void main(String[] args) {

        int price = 1299;
        String brand = "Zara";
        String color = "Black";
        String closureType = "Buckle";
        String heelType = "Block Heel";
        String waterResistanceLevel = "Water Resistant";
        String materialType = "Synthetic Leather";
        String style = "Party Wear";
        String manufacturer = "Zara Footwear Pvt Ltd";

        // local variables
        System.out.println("The Price is  " + price);
        System.out.println("The Brand is  " + brand);
        System.out.println("The Color is  " + color);
        System.out.println("The Closure Type is  " + closureType);
        System.out.println("The Material Type is  " + materialType);
        System.out.println("The Heel Type is  " + heelType);
        System.out.println("The Water Resistance is  " + waterResistanceLevel);
        System.out.println("The Style is  " + style);
        System.out.println("The Manufacturer is  " + manufacturer);

        // static variables
        System.out.println("The Price is  " + Heels.price);
        System.out.println("The Brand is  " + Heels.brand);
        System.out.println("The Color is  " + Heels.color);
        System.out.println("The Closure Type is  " + Heels.closureType);
        System.out.println("The Material Type is  " + Heels.materialType);
        System.out.println("The Heel Type is  " + Heels.heelType);
        System.out.println("The Water Resistance is  " + Heels.waterResistanceLevel);
        System.out.println("The Style is  " + Heels.style);
        System.out.println("The Manufacturer is  " + Heels.manufacturer);
    }
}
