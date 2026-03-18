class SmartDoorLockExecutor {

    public static void main(String[] args) {

        String brand = SmartDoorLock.getBrand();
        System.out.println("Brand: " + brand);

        String unlock = SmartDoorLock.getUnlockType();
        System.out.println("Unlock Type: " + unlock);

        String connectivity = SmartDoorLock.getConnectivity();
        System.out.println("Connectivity: " + connectivity);

        String material = SmartDoorLock.getMaterial();
        System.out.println("Material: " + material);

        double price = SmartDoorLock.getPrice();
        System.out.println("Price: " + price);
    }
}