class ElectronicBrush {

    static int maxSpeed = 5;
    static int minSpeed = 0;
    static int currentSpeed;
    static boolean status;

    static void power() {
        if (status == false) {
            status = true;
            System.out.println("Electronic Brush ON");
        } else {
            status = false;
            System.out.println("Electronic Brush OFF");
        }
    }

    static int getSpeed() {
        return currentSpeed;
    }

    static void increaseSpeed() {
        if (status == true) {
            if (currentSpeed < maxSpeed) {
                currentSpeed = currentSpeed + 1;
                System.out.println("Brush vibration speed increased to: " + currentSpeed);
            } else {
                System.out.println("Brush already at maximum speed");
            }
        } else {
            System.out.println("Electronic Brush is OFF");
        }
    }

    static void decreaseSpeed() {
        if (status == true) {
            if (currentSpeed > minSpeed) {
                currentSpeed = currentSpeed - 1;
                System.out.println("Brush vibration speed decreased to: " + currentSpeed);
            } else {
                System.out.println("Brush already at minimum speed");
            }
        } else {
            System.out.println("Electronic Brush is OFF");
        }
    }
}