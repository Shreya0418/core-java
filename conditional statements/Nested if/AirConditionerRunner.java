class AirConditionerExecutor {

    public static void main(String[] args) {

        AirConditioner.power();

        int temp = AirConditioner.getTemperature();
        System.out.println("Current Temperature: " + temp);

        AirConditioner.increaseTemperature();
        AirConditioner.increaseTemperature();

        temp = AirConditioner.getTemperature();
        System.out.println("Temperature after increase: " + temp);

        AirConditioner.decreaseTemperature();

        temp = AirConditioner.getTemperature();
        System.out.println("Temperature after decrease: " + temp);
    }
}