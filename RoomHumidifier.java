class RoomHumidifier {

    static int maxMist = 7;
    static int minMist = 0;
    static int currentMist;
    static boolean status;

    static void power() {
        if (status == false) {
            status = true;
            System.out.println("Room Humidifier ON");
        } else {
            status = false;
            System.out.println("Room Humidifier OFF");
        }
    }

    static int getMistLevel() {
        return currentMist;
    }

    static void increaseMist() {
        if (status == true) {
            if (currentMist < maxMist) {
                currentMist = currentMist + 1;
                System.out.println("Mist level increased to: " + currentMist);
            } else {
                System.out.println("Mist already at maximum");
            }
        } else {
            System.out.println("Room Humidifier is OFF");
        }
    }

    static void decreaseMist() {
        if (status == true) {
            if (currentMist > minMist) {
                currentMist = currentMist - 1;
                System.out.println("Mist level decreased to: " + currentMist);
            } else {
                System.out.println("Mist already at minimum");
            }
        } else {
            System.out.println("Room Humidifier is OFF");
        }
    }
}