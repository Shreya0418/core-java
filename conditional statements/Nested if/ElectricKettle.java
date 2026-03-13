class ElectricKettle {

    static int maxTemp = 100;
    static int minTemp = 20;
    static int currentTemp = 50;
    static boolean status;

    static void power() {
        if (status == false) {
            status = true;
            System.out.println("Electric Kettle ON");
        } else {
            status = false;
            System.out.println("Electric Kettle OFF");
        }
    }

    static int getTemperature() {
        return currentTemp;
    }

    static void increaseTemperature() {
        if (status == true) {
            if (currentTemp < maxTemp) {
                currentTemp = currentTemp + 5;
                System.out.println("Temperature increased to: " + currentTemp);
            } else {
                System.out.println("Temperature already at maximum");
            }
        } else {
            System.out.println("Electric Kettle is OFF");
        }
    }

    static void decreaseTemperature() {
        if (status == true) {
            if (currentTemp > minTemp) {
                currentTemp = currentTemp - 5;
                System.out.println("Temperature decreased to: " + currentTemp);
            } else {
                System.out.println("Temperature already at minimum");
            }
        } else {
            System.out.println("Electric Kettle is OFF");
        }
    }
}