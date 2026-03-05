class Hoodie {

    static int price = 1999;
    static String brand = "H&M";
    static String color = "Grey";
    static String fabric = "Cotton Blend";
    static String fitType = "Regular Fit";
    static String size = "M";
    static String gender = "Unisex";
    static String pattern = "Solid";
    static String manufacturer = "H&M Hennes & Mauritz India Pvt. Ltd.";

    public static void main(String[] args) {

        int price = 2499;
        String brand = "Zara";
        String color = "Black";
        String fabric = "Fleece Cotton";
        String fitType = "Slim Fit";
        String size = "L";
        String gender = "Men";
        String pattern = "Printed";
        String manufacturer = "Zara Clothing Pvt. Ltd.";

        // local variables
        System.out.println("The price is  " + price);
        System.out.println("The brand is  " + brand);
        System.out.println("The color is  " + color);
        System.out.println("The fabric is  " + fabric);
        System.out.println("The fit type is  " + fitType);
        System.out.println("The size is  " + size);
        System.out.println("The gender is  " + gender);
        System.out.println("The pattern is  " + pattern);
        System.out.println("The manufacturer is  " + manufacturer);

        // static variables
        System.out.println("The price is  " + Hoodie.price);
        System.out.println("The brand is  " + Hoodie.brand);
        System.out.println("The color is  " + Hoodie.color);
        System.out.println("The fabric is  " + Hoodie.fabric);
        System.out.println("The fit type is  " + Hoodie.fitType);
        System.out.println("The size is  " + Hoodie.size);
        System.out.println("The gender is  " + Hoodie.gender);
        System.out.println("The pattern is  " + Hoodie.pattern);
        System.out.println("The manufacturer is  " + Hoodie.manufacturer);
    }
}
