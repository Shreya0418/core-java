class Bangle {
    
    String color;
    String material;
    String size;
    String design;
    String pattern;
    String type;
    double price;
    int quantity;

    // constructor
    Bangle(String color, String material, String size, String design,
           String pattern, String type, double price, int quantity) {

        this.color = color;
        this.material = material;
        this.size = size;
        this.design = design;
        this.pattern = pattern;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
    }

    // display method
    public void displayDetails() {
        System.out.println(color);
        System.out.println(material);
        System.out.println(size);
        System.out.println(design);
        System.out.println(pattern);
        System.out.println(type);
        System.out.println(price);
        System.out.println(quantity);
        System.out.println("----------------------");
    }
}