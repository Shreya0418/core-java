class Goggle {

    String brand;
    String frameColor;
    String lensColor;
    String Material;
    String lensType;
    String shape;
    double price;
    int quantity;

    Goggle(String brand, String frameColor, String lensColor, String Material, String lensType, String shape, double price, int quantity) {

        this.brand = brand;
        this.frameColor = frameColor;
        this.lensColor = lensColor;
        this.Material = Material;
        this.lensType = lensType;
        this.shape = shape;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayDetails() {
        System.out.println(brand);
        System.out.println(frameColor);
        System.out.println(lensColor);
        System.out.println(Material);
        System.out.println(lensType);
        System.out.println(shape);
        System.out.println(price);
        System.out.println(quantity);
        System.out.println("----------------------");
    }
}