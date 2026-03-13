class CoffeeMachine {

    static int maxStrength = 5;
    static int minStrength = 0;
    static int currentStrength;
    static boolean status;

    static void power() {
        if (status == false) {
            status = true;
            System.out.println("Coffee Machine ON");
        } else {
            status = false;
            System.out.println("Coffee Machine OFF");
        }
    }

    static int getStrength() {
        return currentStrength;
    }

    static void increaseStrength() {
        if (status == true) {
            if (currentStrength < maxStrength) {
                currentStrength = currentStrength + 1;
                System.out.println("Coffee strength increased to: " + currentStrength);
            } else {
                System.out.println("Coffee strength already maximum");
            }
        } else {
            System.out.println("Coffee Machine is OFF");
        }
    }

    static void decreaseStrength() {
        if (status == true) {
            if (currentStrength > minStrength) {
                currentStrength = currentStrength - 1;
                System.out.println("Coffee strength decreased to: " + currentStrength);
            } else {
                System.out.println("Coffee strength already minimum");
            }
        } else {
            System.out.println("Coffee Machine is OFF");
        }
    }
}