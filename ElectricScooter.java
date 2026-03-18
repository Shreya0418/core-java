class ElectricScooter {

    static int maxSpeed = 60;
    static int minSpeed = 0;
    static int currentSpeed;
    static boolean status;

    static void power() {
        if (status == false) {
            status = true;
            System.out.println("Electric Scooter ON");
        } else {
            status = false;
            System.out.println("Electric Scooter OFF");
        }
    }

    static int getSpeed() {
        return currentSpeed;
    }

    static void increaseSpeed() {
        if (status == true) {
            if (currentSpeed < maxSpeed) {
                currentSpeed = currentSpeed + 5;
                System.out.println("Speed increased to: " + currentSpeed);
            } else {
                System.out.println("Scooter already at maximum speed");
            }
        } else {
            System.out.println("Electric Scooter is OFF");
        }
    }

    static void decreaseSpeed() {
        if (status == true) {
            if (currentSpeed > minSpeed) {
                currentSpeed = currentSpeed - 5;
                System.out.println("Speed decreased to: " + currentSpeed);
            } else {
                System.out.println("Scooter already at minimum speed");
            }
        } else {
            System.out.println("Electric Scooter is OFF");
        }
    }
}