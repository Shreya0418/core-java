class ElectricShaverRunner {

    public static void main(String[] args) {

        ElectricShaver.power();

        int speed = ElectricShaver.getSpeed();
        System.out.println("Current Shaver Speed: " + speed);

        ElectricShaver.increaseSpeed();
        ElectricShaver.increaseSpeed();

        speed = ElectricShaver.getSpeed();
        System.out.println("Speed after increase: " + speed);

        ElectricShaver.decreaseSpeed();

        speed = ElectricShaver.getSpeed();
        System.out.println("Speed after decrease: " + speed);
    }
}