class SmartFridgeRunner {

    public static void main(String[] args) {

        SmartFridge.power();

        int level = SmartFridge.getCoolingLevel();
        System.out.println("Current Cooling Level: " + level);

        SmartFridge.increaseCooling();
        SmartFridge.increaseCooling();

        level = SmartFridge.getCoolingLevel();
        System.out.println("Cooling after increase: " + level);

        SmartFridge.decreaseCooling();

        level = SmartFridge.getCoolingLevel();
        System.out.println("Cooling after decrease: " + level);
    }
}