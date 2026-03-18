class HairDryerRunner {

    public static void main(String[] args) {

        HairDryer.power();

        int heat = HairDryer.getHeatLevel();
        System.out.println("Current Heat Level: " + heat);

        HairDryer.increaseHeat();
        HairDryer.increaseHeat();

        heat = HairDryer.getHeatLevel();
        System.out.println("Heat after increase: " + heat);

        HairDryer.decreaseHeat();

        heat = HairDryer.getHeatLevel();
        System.out.println("Heat after decrease: " + heat);
    }
}