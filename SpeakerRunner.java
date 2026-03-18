class SpeakerRunner {

    public static void main(String[] args) {

        Speaker.power();

        System.out.println("Initial Volume: " + Speaker.getVolume());

        Speaker.increaseVolume();
        Speaker.increaseVolume();

        System.out.println("Volume after increasing: " + Speaker.getVolume());

        Speaker.decreaseVolume();

        System.out.println("Volume after decreasing: " + Speaker.getVolume());
    }
}