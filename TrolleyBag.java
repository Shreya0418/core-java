class TrolleyBag {

    String brand;
    String size;
    String color;
    int numberOfWheels;
    boolean isExpandable;
    boolean hasLock;
    double price;

    TrolleyBag(String brand, String size, String color, int numberOfWheels,
               boolean isExpandable, boolean hasLock, double price) {

        this.brand = brand;
        this.size = size;
        this.color = color;
        this.numberOfWheels = numberOfWheels;
        this.isExpandable = isExpandable;
        this.hasLock = hasLock;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println(brand);
        System.out.println(size);
        System.out.println(color);
        System.out.println(numberOfWheels);
        System.out.println(isExpandable);
        System.out.println(hasLock);
        System.out.println(price);
        System.out.println("----------------------");
    }
}