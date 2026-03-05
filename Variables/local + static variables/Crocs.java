class Crocs {

    static int price = 5395;
    static String brand = "Crocs";
    static String color = "Off-white";
    static String materialType = "Croslite";
    static String style = "Mid-Top";
    static String closureType = "Slip On";
    static String heelType = "No Heel";
    static String waterResistanceLevel = "Water-Resistant";
    static String strapType = "Adjustable Strap";

    public static void main(String[] args) {

        int price = 4999;
        String brand = "Crocs Classic";
        String color = "Black";
        String materialType = "Rubber";
        String style = "Casual";
        String closureType = "Back Strap";
        String heelType = "Flat";
        String waterResistanceLevel = "Fully Waterproof";
        String strapType = "Fixed Strap";

        // local variables
        System.out.println("The Price is  " + price);
        System.out.println("The Brand is  " + brand);
        System.out.println("The Color is  " + color);
        System.out.println("The Material Type is  " + materialType);
        System.out.println("The Style is  " + style);
        System.out.println("The Closure Type is  " + closureType);
        System.out.println("The Heel Type is  " + heelType);
        System.out.println("The Water Resistant Level is  " + waterResistanceLevel);
        System.out.println("The Strap Type is  " + strapType);

        // static variables
        System.out.println("The Price is  " + Crocs.price);
        System.out.println("The Brand is  " + Crocs.brand);
        System.out.println("The Color is  " + Crocs.color);
        System.out.println("The Material Type is  " + Crocs.materialType);
        System.out.println("The Style is  " + Crocs.style);
        System.out.println("The Closure Type is  " + Crocs.closureType);
        System.out.println("The Heel Type is  " + Crocs.heelType);
        System.out.println("The Water Resistant Level is  " + Crocs.waterResistanceLevel);
        System.out.println("The Strap Type is  " + Crocs.strapType);
    }
}
