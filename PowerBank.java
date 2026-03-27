class PowerBank {

    String brand;
    String color;
    String batteryType;
    String connectorType;
    String compatibleDevices;
    boolean fastCharging;
    int capacity;

    PowerBank(String brand, String color, String batteryType, String connectorType,
              String compatibleDevices, boolean fastCharging, int capacity) {

        this.brand = brand;
        this.color = color;
        this.batteryType = batteryType;
        this.connectorType = connectorType;
        this.compatibleDevices = compatibleDevices;
        this.fastCharging = fastCharging;
        this.capacity = capacity;
    }

    public void displayDetails() {
        System.out.println(brand);
        System.out.println(color);
        System.out.println(batteryType);
        System.out.println(connectorType);
        System.out.println(compatibleDevices);
        System.out.println(fastCharging);
        System.out.println(capacity);
        System.out.println("----------------------");
    }
}