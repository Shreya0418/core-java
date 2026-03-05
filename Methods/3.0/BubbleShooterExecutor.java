class BubbleShooterExecutor {

    public static void main(String[] args) {

        String developer = BubbleShooter.getDeveloper();
        System.out.println("Developer: " + developer);

        String platform = BubbleShooter.getPlatform();
        System.out.println("Platform: " + platform);

        String type = BubbleShooter.getGameType();
        System.out.println("Game Type: " + type);

        String mode = BubbleShooter.getMode();
        System.out.println("Mode: " + mode);

        double size = BubbleShooter.getSizeMB();
        System.out.println("Size: " + size + " MB");
    }
}