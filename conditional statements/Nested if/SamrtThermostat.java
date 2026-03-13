class SamrtThermostat {

    static int maxTemp = 35;
    static int minTemp = 16;
    static int currentTemp = 24;
    static boolean status;

    static void power() {
        if (status == false) {
            status = true;
            System.out.println("samrt Thermostat ON");
        } else {
            status = false;
            System.out.println("samrt Thermostat OFF");
        }
    }

    static int getTemperature() {
        return currentTemp;
    }

    static void increaseTemperature() {
        if (status == true) {
            if (currentTemp < maxTemp) {
                currentTemp = currentTemp + 1;
                System.out.println("Temperature increased to: " + currentTemp);
            } else {
                System.out.println("Temperature already at maximum");
            }
        } else {
            System.out.println("samrt Thermostat is OFF");
        }
    }

    static void decreaseTemperature() {
        if (status == true) {
            if (currentTemp > minTemp) {
                currentTemp = currentTemp - 1;
                System.out.println("Temperature decreased to: " + currentTemp);
            } else {
                System.out.println("Temperature already at minimum");
            }
        } else {
            System.out.println("samrt Thermostat is OFF");
        }
    }
}