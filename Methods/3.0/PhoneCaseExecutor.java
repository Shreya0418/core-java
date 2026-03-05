class PhoneCaseExecutor {

    public static void main(String[] args) {

        String brand = PhoneCase.getBrand();
        System.out.println("Brand: " + brand);

        double price = PhoneCase.getPrice();
        System.out.println("Price: " + price);

        String material = PhoneCase.getMaterial();
        System.out.println("Material: " + material);

        String model = PhoneCase.getCompatibleModel();
        System.out.println("Compatible Model: " + model);
    }
}