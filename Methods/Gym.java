class Gym{
	
	static String equipmentNames[] = {"\nTreadmills", "Barbell", "Weight Plates", "Kelttle Bells", "Resistance Bands", "Weight Bench", "Lat Pulldown Machine", "Reverse Hyperextension", "Pull-Up Bar", "Rowers"};
	
	public static void getEquipmentNames() {
		System.out.println("\ngetEquipmentNames invoked");
		
		for(String equipmentName : equipmentNames) {
			System.out.println(equipmentName);
		}
		
		System.out.println("\nEnd of getEquipmentNames");
	}
	
}