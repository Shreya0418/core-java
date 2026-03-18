class LEDPanel {

    static int maxBrightness = 10;
    static int minBrightness = 0;
    static int currentBrightness;
    static boolean status;

    static void power() {
        if (status == false) {
            status = true;
            System.out.println("LED Panel ON");
        } else {
            status = false;
            System.out.println("LED Panel OFF");
        }
    }

    static int getBrightness() {
        return currentBrightness;
    }

    static void increaseBrightness() {
        if (status == true) {
            if (currentBrightness < maxBrightness) {
                currentBrightness = currentBrightness + 1;
                System.out.println("Brightness increased to: " + currentBrightness);
            } else {
                System.out.println("Brightness already at maximum");
            }
        } else {
            System.out.println("LED Panel is OFF");
        }
    }

    static void decreaseBrightness() {
        if (status == true) {
            if (currentBrightness > minBrightness) {
                currentBrightness = currentBrightness - 1;
                System.out.println("Brightness decreased to: " + currentBrightness);
            } else {
                System.out.println("Brightness already at minimum");
            }
        } else {
            System.out.println("LED Panel is OFF");
        }
    }
}