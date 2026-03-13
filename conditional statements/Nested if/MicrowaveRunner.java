class MicrowaveRunner {

    public static void main(String[] args) {

        Microwave.power();

        int heat = Microwave.getHeatLevel();
        System.out.println("Current Heat Level: " + heat);

        Microwave.increaseHeat();
        Microwave.increaseHeat();

        heat = Microwave.getHeatLevel();
        System.out.println("Heat after increase: " + heat);

        Microwave.decreaseHeat();

        heat = Microwave.getHeatLevel();
        System.out.println("Heat after decrease: " + heat);
    }
}