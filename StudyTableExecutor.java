class StudyTableExecutor {

    public static void main(String[] args) {

        String brand = StudyTable.getBrand();
        System.out.println("Brand: " + brand);

        double price = StudyTable.getPrice();
        System.out.println("Price: " + price);

        String material = StudyTable.getMaterial();
        System.out.println("Material: " + material);

        String color = StudyTable.getColor();
        System.out.println("Color: " + color);
    }
}