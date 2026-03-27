class Bindhi {
    
    String color;
    String shape;
    String size;
    String material;
    String pattern;
    String design;
    String occasion;
    double price;

    // constructor
    Bindhi(String color, String shape, String size, String material,
           String pattern, String design, String occasion, double price) {

        this.color = color;
        this.shape = shape;
        this.size = size;
        this.material = material;
        this.pattern = pattern;
        this.design = design;
        this.occasion = occasion;
        this.price = price;
    }

    // display method
    public void displayDetails() {
        System.out.println(color);
        System.out.println(shape);
        System.out.println(size);
        System.out.println(material);
        System.out.println(pattern);
        System.out.println(design);
        System.out.println(occasion);
        System.out.println(price);
        System.out.println("----------------------");
    }
}