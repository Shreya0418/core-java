class Watch {

    String operatingSystem;
    String specialFeature;
    String connectivityTechnology;
    String wirelessCommunicationStandard;
    String sportType;
    String humanInterfaceInput;
    double waterResistanceDepth;

    Watch(String operatingSystem, String specialFeature, String connectivityTechnology,
          String wirelessCommunicationStandard, String sportType,
          String humanInterfaceInput, double waterResistanceDepth) {

        this.operatingSystem = operatingSystem;
        this.specialFeature = specialFeature;
        this.connectivityTechnology = connectivityTechnology;
        this.wirelessCommunicationStandard = wirelessCommunicationStandard;
        this.sportType = sportType;
        this.humanInterfaceInput = humanInterfaceInput;
        this.waterResistanceDepth = waterResistanceDepth;
    }

    public void displayDetails() {
        System.out.println(operatingSystem);
        System.out.println(specialFeature);
        System.out.println(connectivityTechnology);
        System.out.println(wirelessCommunicationStandard);
        System.out.println(sportType);
        System.out.println(humanInterfaceInput);
        System.out.println(waterResistanceDepth);
        System.out.println("----------------------");
    }
}