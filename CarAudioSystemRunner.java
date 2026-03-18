class CarAudioSystemRunner {

    public static void main(String[] args) {

        CarAudioSystem.power();

        int volume = CarAudioSystem.getVolume();
        System.out.println("Current Volume: " + volume);

        CarAudioSystem.increaseVolume();
        CarAudioSystem.increaseVolume();

        volume = CarAudioSystem.getVolume();
        System.out.println("Volume after increase: " + volume);

        CarAudioSystem.decreaseVolume();

        volume = CarAudioSystem.getVolume();
        System.out.println("Volume after decrease: " + volume);
    }
}