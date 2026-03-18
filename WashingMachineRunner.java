class WashingMachineRunner {

    public static void main(String[] args) {

        WashingMachine.power();

        int speed = WashingMachine.getSpeed();
        System.out.println("Current Spin Speed: " + speed);

        WashingMachine.increaseSpeed();
        WashingMachine.increaseSpeed();

        speed = WashingMachine.getSpeed();
        System.out.println("Speed after increase: " + speed);

        WashingMachine.decreaseSpeed();

        speed = WashingMachine.getSpeed();
        System.out.println("Speed after decrease: " + speed);
    }
}