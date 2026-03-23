class OrderSystem{
	
	public static void takeOrder(){
		System.out.println("The odrer is taken successfully");
		
		InventoryCheck.validate();
	}
	
}