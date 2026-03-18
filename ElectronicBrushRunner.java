class ElectronicBrushRunner {

    public static void main(String[] args) {

        ElectronicBrush.power();

        int speed = ElectronicBrush.getSpeed();
        System.out.println("Current Brush Speed: " + speed);

        ElectronicBrush.increaseSpeed();
        ElectronicBrush.increaseSpeed();

        speed = ElectronicBrush.getSpeed();
        System.out.println("Speed after increase: " + speed);

        ElectronicBrush.decreaseSpeed();

        speed = ElectronicBrush.getSpeed();
        System.out.println("Speed after decrease: " + speed);
    }
}