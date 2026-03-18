class NailPolishExecutor {

    public static void main(String[] args) {

        String brand = NailPolish.getBrand();
        System.out.println("Brand: " + brand);

        String shade = NailPolish.getShade();
        System.out.println("Shade: " + shade);

        String finish = NailPolish.getFinishType();
        System.out.println("Finish Type: " + finish);

        double quantity = NailPolish.getQuantityML();
        System.out.println("Quantity: " + quantity + " ml");

        double price = NailPolish.getPrice();
        System.out.println("Price: " + price);
    }
}