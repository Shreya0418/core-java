class Tv{

	String brand;
	String type;
	int price;
	boolean isSmart;
	String size;

	Remote remote;

	public void getTvDetails(){
		System.out.println("Brand: " + brand);
		System.out.println("Type: " + type);
		System.out.println("Price: " + price);
		System.out.println("Smart: " + isSmart);
		System.out.println("Size: " + size);
		System.out.println("----------------------");

		remote.getRemoteDetails();
	}
}