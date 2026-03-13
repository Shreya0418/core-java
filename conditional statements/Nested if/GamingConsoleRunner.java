class GamingConsoleRunner {

    public static void main(String[] args) {

        GamingConsole.power();

        int sound = GamingConsole.getSoundLevel();
        System.out.println("Current Sound Level: " + sound);

        GamingConsole.increaseSound();
        GamingConsole.increaseSound();

        sound = GamingConsole.getSoundLevel();
        System.out.println("Sound after increase: " + sound);

        GamingConsole.decreaseSound();

        sound = GamingConsole.getSoundLevel();
        System.out.println("Sound after decrease: " + sound);
    }
}