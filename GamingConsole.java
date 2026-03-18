class GamingConsole {

    static int maxSound = 10;
    static int minSound = 0;
    static int currentSound;
    static boolean status;

    static void power() {
        if (status == false) {
            status = true;
            System.out.println("Gaming Console ON");
        } else {
            status = false;
            System.out.println("Gaming Console OFF");
        }
    }

    static int getSoundLevel() {
        return currentSound;
    }

    static void increaseSound() {
        if (status == true) {
            if (currentSound < maxSound) {
                currentSound = currentSound + 1;
                System.out.println("Sound level increased to: " + currentSound);
            } else {
                System.out.println("Sound already at maximum");
            }
        } else {
            System.out.println("Gaming Console is OFF");
        }
    }

    static void decreaseSound() {
        if (status == true) {
            if (currentSound > minSound) {
                currentSound = currentSound - 1;
                System.out.println("Sound level decreased to: " + currentSound);
            } else {
                System.out.println("Sound already at minimum");
            }
        } else {
            System.out.println("Gaming Console is OFF");
        }
    }
}