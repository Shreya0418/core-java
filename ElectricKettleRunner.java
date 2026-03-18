class ElectricKettle {

    public static void main(String[] args) {

        ElectricKettle.power();

        int temp = ElectricKettle.getTemperature();
        System.out.println("Current Temperature: " + temp);

        ElectricKettle.increaseTemperature();
        ElectricKettle.increaseTemperature();

        temp = ElectricKettle.getTemperature();
        System.out.println("Temperature after increase: " + temp);

        ElectricKettle.decreaseTemperature();

        temp = ElectricKettle.getTemperature();
        System.out.println("Temperature after decrease: " + temp);
    }
}