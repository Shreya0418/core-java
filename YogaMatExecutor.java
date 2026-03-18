class YogaMatExecutor {

    public static void main(String[] args) {

        String brand = YogaMat.getBrand();
        System.out.println("Brand: " + brand);

        double price = YogaMat.getPrice();
        System.out.println("Price: " + price);

        String material = YogaMat.getMaterial();
        System.out.println("Material: " + material);

        double thickness = YogaMat.getThicknessInMM();
        System.out.println("Thickness: " + thickness + " mm");
    }
}