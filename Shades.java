class Shades {

    static int price = 28999;
    static String brand = "Gucci";
    static String color = "Black";
    static String frameMaterial = "Acetate";
    static String lensType = "UV Protected";
    static String model = "GG0061S";
    static String gender = "Unisex";
    static String manufacturer = "Guccio Gucci S.p.A.";
    static double lensWidth = 55.0;

    public static void main(String[] args) {

        int price = 1999;
        String brand = "Ray-Ban";
        String color = "Brown";
        String frameMaterial = "Metal";
        String lensType = "Polarized";
        String model = "RB3025";
        String gender = "Men";
        String manufacturer = "Ray-Ban India Pvt Ltd";
        double lensWidth = 58.0;

        // local variables
        System.out.println("The price is  " + price);
        System.out.println("The brand is  " + brand);
        System.out.println("The color is  " + color);
        System.out.println("The frame material is  " + frameMaterial);
        System.out.println("The lens type is  " + lensType);
        System.out.println("The model is  " + model);
        System.out.println("The gender is  " + gender);
        System.out.println("The lens width is  " + lensWidth);
        System.out.println("The manufacturer is  " + manufacturer);

        // static variables
        System.out.println("The price is  " + Shades.price);
        System.out.println("The brand is  " + Shades.brand);
        System.out.println("The color is  " + Shades.color);
        System.out.println("The frame material is  " + Shades.frameMaterial);
        System.out.println("The lens type is  " + Shades.lensType);
        System.out.println("The model is  " + Shades.model);
        System.out.println("The gender is  " + Shades.gender);
        System.out.println("The lens width is  " + Shades.lensWidth);
        System.out.println("The manufacturer is  " + Shades.manufacturer);
    }
}
