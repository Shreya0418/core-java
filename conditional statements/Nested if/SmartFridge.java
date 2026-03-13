class SmartFridge {

    static int maxCooling = 10;
    static int minCooling = 1;
    static int currentCooling;
    static boolean status;

    static void power() {
        if (status == false) {
            status = true;
            System.out.println("Smart Fridge ON");
        } else {
            status = false;
            System.out.println("Smart Fridge OFF");
        }
    }

    static int getCoolingLevel() {
        return currentCooling;
    }

    static void increaseCooling() {
        if (status == true) {
            if (currentCooling < maxCooling) {
                currentCooling = currentCooling + 1;
                System.out.println("Cooling level increased to: " + currentCooling);
            } else {
                System.out.println("Cooling already at maximum");
            }
        } else {
            System.out.println("Smart Fridge is OFF");
        }
    }

    static void decreaseCooling() {
        if (status == true) {
            if (currentCooling > minCooling) {
                currentCooling = currentCooling - 1;
                System.out.println("Cooling level decreased to: " + currentCooling);
            } else {
                System.out.println("Cooling already at minimum");
            }
        } else {
            System.out.println("Smart Fridge is OFF");
        }
    }
}