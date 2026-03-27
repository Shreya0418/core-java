class Vase {

    String materialType;
    String color;
    String brand;
    String shape;
    String finishType;
    boolean handmade;
    double height;

    Vase(String materialType, String color, String brand,
         String shape, String finishType, boolean handmade, double height) {

        this.materialType = materialType;
        this.color = color;
        this.brand = brand;
        this.shape = shape;
        this.finishType = finishType;
        this.handmade = handmade;
        this.height = height;
    }

    public void displayDetails() {
        System.out.println(materialType);
        System.out.println(color);
        System.out.println(brand);
        System.out.println(shape);
        System.out.println(finishType);
        System.out.println(handmade);
        System.out.println(height);
        System.out.println("----------------------");
    }
}