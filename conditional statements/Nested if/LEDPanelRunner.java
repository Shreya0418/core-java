class LEDPanelRunner {

    public static void main(String[] args) {

        LEDPanel.power();

        int brightness = LEDPanel.getBrightness();
        System.out.println("Current Brightness: " + brightness);

        LEDPanel.increaseBrightness();
        LEDPanel.increaseBrightness();

        brightness = LEDPanel.getBrightness();
        System.out.println("Brightness after increase: " + brightness);

        LEDPanel.decreaseBrightness();

        brightness = LEDPanel.getBrightness();
        System.out.println("Brightness after decrease: " + brightness);
    }
}