class RoomHumidifierRunner {

    public static void main(String[] args) {

        RoomHumidifier.power();

        int mist = RoomHumidifier.getMistLevel();
        System.out.println("Current Mist Level: " + mist);

        RoomHumidifier.increaseMist();
        RoomHumidifier.increaseMist();

        mist = RoomHumidifier.getMistLevel();
        System.out.println("Mist after increase: " + mist);

        RoomHumidifier.decreaseMist();

        mist = RoomHumidifier.getMistLevel();
        System.out.println("Mist after decrease: " + mist);
    }
}