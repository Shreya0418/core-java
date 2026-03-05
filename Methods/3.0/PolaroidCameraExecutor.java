class PolaroidCameraExecutor {

    public static void main(String[] args) {

        String brand = PolaroidCamera.getBrand();
        System.out.println("Brand: " + brand);

        double price = PolaroidCamera.getPrice();
        System.out.println("Price: " + price);

        String film = PolaroidCamera.getFilmType();
        System.out.println("Film Type: " + film);

        String color = PolaroidCamera.getColor();
        System.out.println("Color: " + color);

        int shots = PolaroidCamera.getBatteryLifeShots();
        System.out.println("Battery Life (Shots): " + shots);
    }
}