class SmartTVExecutor {

    public static void main(String[] args) {

        SmartTV.power();

        int volume = SmartTV.getVolume();
        System.out.println("Current TV Volume: " + volume);

        SmartTV.increaseVolume();
        SmartTV.increaseVolume();

        volume = SmartTV.getVolume();
        System.out.println("Volume after increase: " + volume);

        SmartTV.decreaseVolume();

        volume = SmartTV.getVolume();
        System.out.println("Volume after decrease: " + volume);
    }
}