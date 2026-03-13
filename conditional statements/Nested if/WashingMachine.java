class WashingMachine {

    static int maxSpeed = 8;
    static int minSpeed = 0;
    static int currentSpeed;
    static boolean status;

    static void power() {
        if (status == false) {
            status = true;
            System.out.println("Washing Machine ON");
        } else {
            status = false;
            System.out.println("Washing Machine OFF");
        }
    }

    static int getSpeed() {
        return currentSpeed;
    }

    static void increaseSpeed() {
        if (status == true) {
            if (currentSpeed < maxSpeed) {
                currentSpeed = currentSpeed + 1;
                System.out.println("Spin speed increased to: " + currentSpeed);
            } else {
                System.out.println("Spin speed already at maximum");
            }
        } else {
            System.out.println("Washing Machine is OFF");
        }
    }

    static void decreaseSpeed() {
        if (status == true) {
            if (currentSpeed > minSpeed) {
                currentSpeed = currentSpeed - 1;
                System.out.println("Spin speed decreased to: " + currentSpeed);
            } else {
                System.out.println("Spin speed already at minimum");
            }
        } else {
            System.out.println("Washing Machine is OFF");
        }
    }
}