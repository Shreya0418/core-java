class SmartTV {

    static int maxVolume = 100;
    static int minVolume = 0;
    static int currentVolume;
    static boolean status;
	

    static void power() {
        if (status == false) {
            status = true;
            System.out.println("Smart TV ON");
        } else {
            status = false;
            System.out.println("Smart TV OFF");
        }
    }

    static int getVolume() {
        return currentVolume;
    }

    static void increaseVolume() {
        if (status == true) {
            if (currentVolume < maxVolume) {
                currentVolume = currentVolume + 1;
                System.out.println("TV volume increased to: " + currentVolume);
            } else {
                System.out.println("TV volume already at maximum");
            }
        } else {
            System.out.println("Smart TV is OFF");
        }
    }

    static void decreaseVolume() {
        if (status == true) {
            if (currentVolume > minVolume) {
                currentVolume = currentVolume - 1;
                System.out.println("TV volume decreased to: " + currentVolume);
            } else {
                System.out.println("TV volume already at minimum");
            }
        } else {
            System.out.println("Smart TV is OFF");
        }
    }
}

