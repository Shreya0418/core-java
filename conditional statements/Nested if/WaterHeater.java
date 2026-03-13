class WaterHeater {

    static int maxTemp = 80;
    static int minTemp = 20;
    static int currentTemp = 40;
    static boolean status;

    static void power() {
        if (status == false) {
            status = true;
            System.out.println("Water Heater ON");
        } else {
            status = false;
            System.out.println("Water Heater OFF");
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
            System.out.println("Water Heater is OFF");
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
            System.out.println("Water Heater is OFF");
        }
    }
}