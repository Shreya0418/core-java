class Light {

    String type;
    String color;
    String brand;
    String material;
    String switchType;
    boolean rechargeable;
    double wattage;

    Light(String type, String color, String brand, String material,
          String switchType, boolean rechargeable, double wattage) {

        this.type = type;
        this.color = color;
        this.brand = brand;
        this.material = material;
        this.switchType = switchType;
        this.rechargeable = rechargeable;
        this.wattage = wattage;
    }

    public void displayDetails() {
        System.out.println(type);
        System.out.println(color);
        System.out.println(brand);
        System.out.println(material);
        System.out.println(switchType);
        System.out.println(rechargeable);
        System.out.println(wattage);
        System.out.println("----------------------");
    }
}