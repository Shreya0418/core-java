class CarAudioSystem {

    static int maxVolume = 15;
    static int minVolume = 0;
    static int currentVolume;
    static boolean status;

    static void power() {
        if (status == false) {
            status = true;
            System.out.println("Car Audio System ON");
        } else {
            status = false;
            System.out.println("Car Audio System OFF");
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
                System.out.println("Volume already at maximum");
            }
        } else {
            System.out.println("Car Audio System is OFF");
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
            System.out.println("Car Audio System is OFF");
        }
    }
}