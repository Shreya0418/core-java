class SamrtThermostatRunner {

    public static void main(String[] args) {

        SamrtThermostat.power();

        int temp = SamrtThermostat.getTemperature();
        System.out.println("Current Temperature: " + temp);

        SamrtThermostat.increaseTemperature();
        SamrtThermostat.increaseTemperature();

        temp = SamrtThermostat.getTemperature();
        System.out.println("Temperature after increase: " + temp);

        SamrtThermostat.decreaseTemperature();

        temp = SamrtThermostat.getTemperature();
        System.out.println("Temperature after decrease: " + temp);
    }
}