class Jeans {

    String brand;
    String fitType;
    String color;
    int waistSize;
    boolean isStretchable;
    boolean isFaded;
    double price;

    // constructor
    Jeans(String brand, String fitType, String color, int waistSize,
          boolean isStretchable, boolean isFaded, double price) {

        this.brand = brand;
        this.fitType = fitType;
        this.color = color;
        this.waistSize = waistSize;
        this.isStretchable = isStretchable;
        this.isFaded = isFaded;
        this.price = price;
    }

    // display method
    public void displayDetails() {
        System.out.println(brand);
        System.out.println(fitType);
        System.out.println(color);
        System.out.println(waistSize);
        System.out.println(isStretchable);
        System.out.println(isFaded);
        System.out.println(price);
        System.out.println("----------------------");
    }
}