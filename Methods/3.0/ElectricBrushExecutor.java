class ElectricBrushExecutor {

    public static void main(String[] args) {

        String brand = ElectricBrush.getBrand();
        System.out.println("Brand: " + brand);

        double price = ElectricBrush.getPrice();
        System.out.println("Price: " + price);

        String color = ElectricBrush.getColor();
        System.out.println("Color: " + color);

        int batteryLife = ElectricBrush.getBatteryLifeInDays();
        System.out.println("Battery Life (Days): " + batteryLife);
    }
}