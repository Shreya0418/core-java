class Speaker {

    static int maxVolume = 10;
    static int minVolume = 0;
    static int currentVolume;
    static boolean status;

    static void power() {
        if (status == false) {
            status = true;
            System.out.println("Speaker is ON");
        } else {

            status = false;
            System.out.println("Speaker is OFF");
        }
    }

    static int getVolume() {
        return currentVolume;
    }

    static void increaseVolume() {
        if (status == true) {
            if (currentVolume < maxVolume) {
                currentVolume = currentVolume + 1;
                System.out.println("Volume increased to: " + currentVolume);
            } else {
                System.out.println("Volume already at max");
            }
        } else {
            System.out.println("Speaker is OFF");
        }
    }

    static void decreaseVolume() {
        if (status == true) {
            if (currentVolume > minVolume) {
                currentVolume = currentVolume - 1;
                System.out.println("Volume decreased to: " + currentVolume);
            } else {
                System.out.println("Volume already at minimum");
            }
        } else {
            System.out.println("Speaker is OFF");
        }
    }
}