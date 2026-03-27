class Ring {

    String materialType;
    String gemstoneType;
    String ringSize;
    String color;
    String brand;
    String platingType;
    double weight;

    // constructor
    Ring(String materialType, String gemstoneType, String ringSize,
         String color, String brand, String platingType, double weight) {

        this.materialType = materialType;
        this.gemstoneType = gemstoneType;
        this.ringSize = ringSize;
        this.color = color;
        this.brand = brand;
        this.platingType = platingType;
        this.weight = weight;
    }

    // display method
    public void displayDetails() {
        System.out.println(materialType);
        System.out.println(gemstoneType);
        System.out.println(ringSize);
        System.out.println(color);
        System.out.println(brand);
        System.out.println(platingType);
        System.out.println(weight);
        System.out.println("----------------------");
    }
}