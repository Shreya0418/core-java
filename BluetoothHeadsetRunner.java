class BluetoothHeadsetRunner {

    public static void main(String[] args) {

        BluetoothHeadset.power();

        int level = BluetoothHeadset.getLevel();
        System.out.println("Current Sound Level: " + level);

        BluetoothHeadset.increaseLevel();
        BluetoothHeadset.increaseLevel();

        level = BluetoothHeadset.getLevel();
        System.out.println("Level after increase: " + level);

        BluetoothHeadset.decreaseLevel();

        level = BluetoothHeadset.getLevel();
        System.out.println("Level after decrease: " + level);
    }
}