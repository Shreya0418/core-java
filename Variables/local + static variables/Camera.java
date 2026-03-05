class Camera {

    static int price = 84999;
    static String brand = "Canon";
    static String model = "EOS 200D";
    static int megapixels = 24;
    static String lensType = "18-55mm";
    static String videoResolution = "4K";

    public static void main(String[] args) {

        int price = 92999;
        String brand = "Sony";
        String model = "Alpha A6400";
        int megapixels = 26;
        String lensType = "16-50mm";
        String videoResolution = "4K UHD";

        // local
        System.out.println("Price is " + price);
        System.out.println("Brand is " + brand);
        System.out.println("Model is " + model);
        System.out.println("Megapixels are " + megapixels);
        System.out.println("Lens Type is " + lensType);
        System.out.println("Video Resolution is " + videoResolution);

        // static
        System.out.println("Price is " + Camera.price);
        System.out.println("Brand is " + Camera.brand);
        System.out.println("Model is " + Camera.model);
        System.out.println("Megapixels are " + Camera.megapixels);
        System.out.println("Lens Type is " + Camera.lensType);
        System.out.println("Video Resolution is " + Camera.videoResolution);
    }
}
