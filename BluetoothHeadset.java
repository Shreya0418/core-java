class BluetoothHeadset {

    static int maxLevel = 10;
    static int minLevel = 0;
    static int currentLevel;
    static boolean status;

    static void power() {
        if (status == false) {
            status = true;
            System.out.println("Headset is ON");
        } else {
            status = false;
            System.out.println("Headset is OFF");
        }
    }

    static int getLevel() {
        return currentLevel;
    }

    static void increaseLevel() {
        if (status == true) {
            if (currentLevel < maxLevel) {
                currentLevel = currentLevel + 1;
                System.out.println("Sound level increased to: " + currentLevel);
            } else {
                System.out.println("Sound already at maximum");
            }
        } else {
            System.out.println("Headset is OFF");
        }
    }

    static void decreaseLevel() {
        if (status == true) {
            if (currentLevel > minLevel) {
                currentLevel = currentLevel - 1;
                System.out.println("Sound level decreased to: " + currentLevel);
            } else {
                System.out.println("Sound already at minimum");
            }
        } else {
            System.out.println("Headset is OFF");
        }
    }
}