class HeaterRunner {

    public static void main(String[] args) {

        Heater.power();

        int heat = Heater.getHeatLevel();
        System.out.println("Current Heat Level: " + heat);

        Heater.increaseHeat();
        Heater.increaseHeat();

        heat = Heater.getHeatLevel();
        System.out.println("Heat after increase: " + heat);

        Heater.decreaseHeat();

        heat = Heater.getHeatLevel();
        System.out.println("Heat after decrease: " + heat);
    }
}