class RestaurantExecutor{
	public static void main(String[] args) {
		Restaurant r1=new Restaurant();
		r1.restaurantName="Empire";
		r1.location= "Bangalore";
		r1.rating= 4;
		r1.isOpen=true;
		r1.cuisine = "Multi";
		
		Chef c1=new Chef();
		c1.chefId =1;
		c1.name="Ravi";
		c1.experience = 10;
		c1.specialty= "Biryani";
		c1.isHeadChef= true;
		
		r1.chef= c1;
		r1.getRestaurantDetails();


		Restaurant r2 = new Restaurant();
		r2.restaurantName= "Meghana Foods";
		r2.location= "Bangalore";
		r2.rating= 5;
		r2.isOpen= true;
		r2.cuisine= "Andhra";
		
		Chef c2 = new Chef();
		c2.chefId= 2;
		c2.name= "Sneha";
		c2.experience= 8;
		c2.specialty= "Chicken Curry";
		c2.isHeadChef= true;
		
		r2.chef= c2;
		r2.getRestaurantDetails();


		Restaurant r3 = new Restaurant();
		r3.restaurantName= "KFC";
		r3.location= "Mumbai";
		r3.rating= 4;
		r3.isOpen= true;
		r3.cuisine= "FastFood";
		
		Chef c3 = new Chef();
		c3.chefId= 3;
		c3.name= "Arjun";
		c3.experience= 6;
		c3.specialty= "Fried Chicken";
		c3.isHeadChef= false;
		
		r3.chef= c3;
		r3.getRestaurantDetails();


		Restaurant r4 = new Restaurant();
		r4.restaurantName= "Dominos";
		r4.location= "Delhi";
		r4.rating= 4;
		r4.isOpen= true;
		r4.cuisine= "Italian";
		
		Chef c4 = new Chef();
		c4.chefId= 4;
		c4.name= "Priya";
		c4.experience= 5;
		c4.specialty= "Pizza";
		c4.isHeadChef= false;
		
		r4.chef= c4;
		r4.getRestaurantDetails();


		Restaurant r5 = new Restaurant();
		r5.restaurantName= "Udupi";
		r5.location= "Chennai";
		r5.rating= 5;
		r5.isOpen= true;
		r5.cuisine= "South Indian";
		
		Chef c5 = new Chef();
		c5.chefId= 5;
		c5.name= "Kiran";
		c5.experience= 12;
		c5.specialty= "Dosa";
		c5.isHeadChef= true;
		
		r5.chef= c5;
		r5.getRestaurantDetails();


		Restaurant r6 = new Restaurant();
		r6.restaurantName= "Barbeque Nation";
		r6.location= "Hyderabad";
		r6.rating= 5;
		r6.isOpen= true;
		r6.cuisine= "Grill";
		
		Chef c6 = new Chef();
		c6.chefId= 6;
		c6.name= "Anita";
		c6.experience= 9;
		c6.specialty= "BBQ";
		c6.isHeadChef= true;
		
		r6.chef= c6;
		r6.getRestaurantDetails();


		Restaurant r7 = new Restaurant();
		r7.restaurantName= "Pizza Hut";
		r7.location= "Pune";
		r7.rating= 4;
		r7.isOpen= true;
		r7.cuisine= "Italian";
		
		Chef c7 = new Chef();
		c7.chefId= 7;
		c7.name= "Rahul";
		c7.experience= 7;
		c7.specialty= "Pizza";
		c7.isHeadChef= false;
		
		r7.chef= c7;
		r7.getRestaurantDetails();


		Restaurant r8 = new Restaurant();
		r8.restaurantName= "Subway";
		r8.location= "Kolkata";
		r8.rating= 4;
		r8.isOpen= true;
		r8.cuisine= "FastFood";
		
		Chef c8 = new Chef();
		c8.chefId= 8;
		c8.name= "Divya";
		c8.experience= 4;
		c8.specialty= "Sandwich";
		c8.isHeadChef= false;
		
		r8.chef= c8;
		r8.getRestaurantDetails();


		Restaurant r9 = new Restaurant();
		r9.restaurantName= "Tandoor";
		r9.location= "Ahmedabad";
		r9.rating= 5;
		r9.isOpen= true;
		r9.cuisine= "North Indian";
		
		Chef c9 = new Chef();
		c9.chefId= 9;
		c9.name= "Manoj";
		c9.experience= 11;
		c9.specialty= "Tandoori";
		c9.isHeadChef= true;
		
		r9.chef= c9;
		r9.getRestaurantDetails();


		Restaurant r10 = new Restaurant();
		r10.restaurantName= "Bawarchi";
		r10.location= "Jaipur";
		r10.rating= 4;
		r10.isOpen= false;
		r10.cuisine= "Hyderabadi";
		
		Chef c10 = new Chef();
		c10.chefId= 10;
		c10.name= "Neha";
		c10.experience= 6;
		c10.specialty= "Biryani";
		c10.isHeadChef= true;
		
		r10.chef= c10;
		r10.getRestaurantDetails();


		Restaurant r11 = new Restaurant();
		r11.restaurantName= "Spice Hub";
		r11.location= "Nagpur";
		r11.rating= 4;
		r11.isOpen= true;
		r11.cuisine= "Indian";
		
		Chef c11 = new Chef();
		c11.chefId= 11;
		c11.name= "Amit";
		c11.experience= 5;
		c11.specialty= "Curry";
		c11.isHeadChef= false;
		
		r11.chef= c11;
		r11.getRestaurantDetails();


		Restaurant r12 = new Restaurant();
		r12.restaurantName= "Food Court";
		r12.location= "Bhopal";
		r12.rating= 3;
		r12.isOpen= true;
		r12.cuisine= "Multi";
		
		Chef c12 = new Chef();
		c12.chefId= 12;
		c12.name= "Pooja";
		c12.experience= 4;
		c12.specialty= "Snacks";
		c12.isHeadChef= false;
		
		r12.chef= c12;
		r12.getRestaurantDetails();


		Restaurant r13 = new Restaurant();
		r13.restaurantName= "Royal Dine";
		r13.location= "Patna";
		r13.rating= 5;
		r13.isOpen= true;
		r13.cuisine= "North Indian";
		
		Chef c13 = new Chef();
		c13.chefId= 13;
		c13.name= "Vikas";
		c13.experience= 9;
		c13.specialty= "Paneer";
		c13.isHeadChef= true;
		
		r13.chef= c13;
		r13.getRestaurantDetails();


		Restaurant r14 = new Restaurant();
		r14.restaurantName= "City Cafe";
		r14.location= "Lucknow";
		r14.rating= 4;
		r14.isOpen= true;
		r14.cuisine= "Cafe";
		
		Chef c14 = new Chef();
		c14.chefId= 14;
		c14.name= "Meena";
		c14.experience= 6;
		c14.specialty= "Coffee";
		c14.isHeadChef= false;
		
		r14.chef= c14;
		r14.getRestaurantDetails();


		Restaurant r15 = new Restaurant();
		r15.restaurantName= "Sea Food Hub";
		r15.location= "Goa";
		r15.rating= 5;
		r15.isOpen= true;
		r15.cuisine= "Seafood";
		
		Chef c15 = new Chef();
		c15.chefId= 15;
		c15.name= "Karthik";
		c15.experience= 10;
		c15.specialty= "Fish Fry";
		c15.isHeadChef= true;
		
		r15.chef= c15;
		r15.getRestaurantDetails();


		Restaurant r16 = new Restaurant();
		r16.restaurantName= "South Spice";
		r16.location= "Coimbatore";
		r16.rating= 4;
		r16.isOpen= true;
		r16.cuisine= "South Indian";
		
		Chef c16 = new Chef();
		c16.chefId= 16;
		c16.name= "Swathi";
		c16.experience= 7;
		c16.specialty= "Idli";
		c16.isHeadChef= true;
		
		r16.chef= c16;
		r16.getRestaurantDetails();


		Restaurant r17 = new Restaurant();
		r17.restaurantName= "Kerala Taste";
		r17.location= "Kerala";
		r17.rating= 5;
		r17.isOpen= true;
		r17.cuisine= "Kerala";
		
		Chef c17 = new Chef();
		c17.chefId= 17;
		c17.name= "Deepak";
		c17.experience= 8;
		c17.specialty= "Appam";
		c17.isHeadChef= true;
		
		r17.chef= c17;
		r17.getRestaurantDetails();


		Restaurant r18 = new Restaurant();
		r18.restaurantName= "Surat Snacks";
		r18.location= "Surat";
		r18.rating= 4;
		r18.isOpen= true;
		r18.cuisine= "Snacks";
		
		Chef c18 = new Chef();
		c18.chefId= 18;
		c18.name= "Nisha";
		c18.experience= 5;
		c18.specialty= "Farsan";
		c18.isHeadChef= false;
		
		r18.chef= c18;
		r18.getRestaurantDetails();


		Restaurant r19 = new Restaurant();
		r19.restaurantName= "Banaras Bhoj";
		r19.location= "Varanasi";
		r19.rating= 5;
		r19.isOpen= true;
		r19.cuisine= "Traditional";
		
		Chef c19 = new Chef();
		c19.chefId= 19;
		c19.name= "Suresh";
		c19.experience= 9;
		c19.specialty= "Thali";
		c19.isHeadChef= true;
		
		r19.chef= c19;
		r19.getRestaurantDetails();


		Restaurant r20 = new Restaurant();
		r20.restaurantName= "Indore Foods";
		r20.location= "Indore";
		r20.rating= 4;
		r20.isOpen= true;
		r20.cuisine= "Street Food";
		
		Chef c20 = new Chef();
		c20.chefId= 20;
		c20.name= "Lakshmi";
		c20.experience= 6;
		c20.specialty= "Poha";
		c20.isHeadChef= true;
		
		r20.chef= c20;
		r20.getRestaurantDetails();
	}
}