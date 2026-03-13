class HairDryer {

    static int maxHeat = 3;
    static int minHeat = 0;
    static int currentHeat;
    static boolean status;

    static void power() {
        if (status == false) {
            status = true;
            System.out.println("Hair Dryer ON");
        } else {
            status = false;
            System.out.println("Hair Dryer OFF");
        }
    }

    static int getHeatLevel() {
        return currentHeat;
    }

    static void increaseHeat() {
        if (status == true) {
            if (currentHeat < maxHeat) {
                currentHeat = currentHeat + 1;
                System.out.println("Heat level increased to: " + currentHeat);
            } else {
                System.out.println("Heat already at maximum");
            }
        } else {
            System.out.println("Hair Dryer is OFF");
        }
    }

    static void decreaseHeat() {
        if (status == true) {
            if (currentHeat > minHeat) {
                currentHeat = currentHeat - 1;
                System.out.println("Heat level decreased to: " + currentHeat);
            } else {
                System.out.println("Heat already at minimum");
            }
        } else {
            System.out.println("Hair Dryer is OFF");
        }
    }
}