class ElectricShaver {

    static int maxSpeed = 5;
    static int minSpeed = 0;
    static int currentSpeed;
    static boolean status;

    static void power() {
        if (status == false) {
            status = true;
            System.out.println("Electric Shaver ON");
        } else {
            status = false;
            System.out.println("Electric Shaver OFF");
        }
    }

    static int getSpeed() {
        return currentSpeed;
    }

    static void increaseSpeed() {
        if (status == true) {
            if (currentSpeed < maxSpeed) {
                currentSpeed = currentSpeed + 1;
                System.out.println("Shaver speed increased to: " + currentSpeed);
            } else {
                System.out.println("Shaver already at maximum speed");
            }
        } else {
            System.out.println("Electric Shaver is OFF");
        }
    }

    static void decreaseSpeed() {
        if (status == true) {
            if (currentSpeed > minSpeed) {
                currentSpeed = currentSpeed - 1;
                System.out.println("Shaver speed decreased to: " + currentSpeed);
            } else {
                System.out.println("Shaver already at minimum speed");
            }
        } else {
            System.out.println("Electric Shaver is OFF");
        }
    }
}