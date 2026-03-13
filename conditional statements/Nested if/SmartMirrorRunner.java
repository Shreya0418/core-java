class SmartMirrorRunner {

    public static void main(String[] args) {

        SmartMirror.power();

        int brightness = SmartMirror.getBrightness();
        System.out.println("Current Brightness: " + brightness);

        SmartMirror.increaseBrightness();
        SmartMirror.increaseBrightness();

        brightness = SmartMirror.getBrightness();
        System.out.println("Brightness after increase: " + brightness);

        SmartMirror.decreaseBrightness();

        brightness = SmartMirror.getBrightness();
        System.out.println("Brightness after decrease: " + brightness);
    }
}