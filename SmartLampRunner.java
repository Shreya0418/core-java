class SmartLampRunner {

    public static void main(String[] args) {

        SmartLamp.power();

        int brightness = SmartLamp.getBrightness();
        System.out.println("Current Brightness: " + brightness);

        SmartLamp.increaseBrightness();
        SmartLamp.increaseBrightness();

        brightness = SmartLamp.getBrightness();
        System.out.println("Brightness after increase: " + brightness);

        SmartLamp.decreaseBrightness();

        brightness = SmartLamp.getBrightness();
        System.out.println("Brightness after decrease: " + brightness);
    }
}