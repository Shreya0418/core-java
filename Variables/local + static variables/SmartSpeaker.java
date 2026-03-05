class SmartSpeaker {

    static int price = 4999;
    static String brand = "Amazon";
    static String model = "Echo Dot 5th Gen";
    static String color = "Charcoal";
    static String connectivity = "WiFi & Bluetooth";
    static String voiceAssistant = "Alexa";
    static String powerSource = "Corded Electric";
    static String speakerType = "360 Degree Audio";

    public static void main(String[] args) {

        int price = 5999;
        String brand = "Google";
        String model = "Nest Mini";
        String color = "Chalk";
        String connectivity = "WiFi";
        String voiceAssistant = "Google Assistant";
        String powerSource = "Electric Adapter";
        String speakerType = "Stereo Sound";

        // local variables
        System.out.println("The Price is  " + price);
        System.out.println("The Brand is  " + brand);
        System.out.println("The Model is  " + model);
        System.out.println("The Color is  " + color);
        System.out.println("The Connectivity is  " + connectivity);
        System.out.println("The Voice Assistant is  " + voiceAssistant);
        System.out.println("The Power Source is  " + powerSource);
        System.out.println("The Speaker Type is  " + speakerType);

        // static variables
        System.out.println("The Price is  " + SmartSpeaker.price);
        System.out.println("The Brand is  " + SmartSpeaker.brand);
        System.out.println("The Model is  " + SmartSpeaker.model);
        System.out.println("The Color is  " + SmartSpeaker.color);
        System.out.println("The Connectivity is  " + SmartSpeaker.connectivity);
        System.out.println("The Voice Assistant is  " + SmartSpeaker.voiceAssistant);
        System.out.println("The Power Source is  " + SmartSpeaker.powerSource);
        System.out.println("The Speaker Type is  " + SmartSpeaker.speakerType);
    }
}
