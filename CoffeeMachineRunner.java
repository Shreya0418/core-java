class CoffeeMachineRunner {

    public static void main(String[] args) {

        CoffeeMachine.power();

        int strength = CoffeeMachine.getStrength();
        System.out.println("Current Coffee Strength: " + strength);

        CoffeeMachine.increaseStrength();
        CoffeeMachine.increaseStrength();

        strength = CoffeeMachine.getStrength();
        System.out.println("Strength after increase: " + strength);

        CoffeeMachine.decreaseStrength();

        strength = CoffeeMachine.getStrength();
        System.out.println("Strength after decrease: " + strength);
    }
}