class StudyTable {

    String materialType;
    String color;
    String brand;
    String shape;
    String finishType;
    boolean foldable;
    double price;

    StudyTable(String materialType, String color, String brand,
               String shape, String finishType, boolean foldable, double price) {

        this.materialType = materialType;
        this.color = color;
        this.brand = brand;
        this.shape = shape;
        this.finishType = finishType;
        this.foldable = foldable;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println(materialType);
        System.out.println(color);
        System.out.println(brand);
        System.out.println(shape);
        System.out.println(finishType);
        System.out.println(foldable);
        System.out.println(price);
        System.out.println("----------------------");
    }
}