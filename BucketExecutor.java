class BucketExecutor {

    public static void main(String[] args) {

        String brand = Bucket.getBrand();
        System.out.println("Brand: " + brand);

        double price = Bucket.getPrice();
        System.out.println("Price: " + price);

        String material = Bucket.getMaterial();
        System.out.println("Material: " + material);

        int capacity = Bucket.getCapacityLiters();
        System.out.println("Capacity: " + capacity + " Liters");

        String color = Bucket.getColor();
        System.out.println("Color: " + color);
    }
}