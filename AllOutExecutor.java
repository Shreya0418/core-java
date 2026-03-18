class AllOutExecutor {

    public static void main(String[] args) {

        String brand = AllOut.getBrand();
        System.out.println("Brand: " + brand);

        double price = AllOut.getPrice();
        System.out.println("Price: " + price);

        String type = AllOut.getType();
        System.out.println("Type: " + type);

        int hours = AllOut.getProtectionHours();
        System.out.println("Protection Hours: " + hours);
    }
}