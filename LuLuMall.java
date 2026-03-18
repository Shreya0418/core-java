class LuLuMall {
	
	static String brandNames[] = {"\nWestside", "Tommy Hilfiger", "Calvin Klein", "Levi's", "Aldo", "Puma", "Adidas", "US Polo Assn", "Pepe Jeans", "Van Haunsen"};
	
	public static void getBrandNames() {
		System.out.println("\ngetBrandNames invoked");
		
		for(String brandName : brandNames) {
			System.out.println(brandName);
		}
		
		System.out.println("\ngetBrandNames ended");
	}


}