class Door{

	String material;
	String color;
	int height;
	boolean isOpen;
	String type;

	Lock lock;

	public void getDoorDetails(){
		System.out.println("Material: " + material);
		System.out.println("Color: " + color);
		System.out.println("Height: " + height);
		System.out.println("Open: " + isOpen);
		System.out.println("Type: " + type);
		System.out.println("----------------------");

		lock.getLockDetails();
	}
}