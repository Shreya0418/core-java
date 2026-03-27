class SwitchBox {

    String brand;
    int numberOfSwitches;
    String material;
    String color;
    boolean hasIndicator;
    boolean isModular;
    double price;

    // constructor
    SwitchBox(String brand, int numberOfSwitches, String material,
              String color, boolean hasIndicator, boolean isModular, double price) {

        this.brand = brand;
        this.numberOfSwitches = numberOfSwitches;
        this.material = material;
        this.color = color;
        this.hasIndicator = hasIndicator;
        this.isModular = isModular;
        this.price = price;
    }

    // display method
    public void displayDetails() {
        System.out.println(brand);
        System.out.println(numberOfSwitches);
        System.out.println(material);
        System.out.println(color);
        System.out.println(hasIndicator);
        System.out.println(isModular);
        System.out.println(price);
        System.out.println("----------------------");
    }
}