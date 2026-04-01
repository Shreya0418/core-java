class RealEstateExecutor{
	public static void main(String[] args) {
		RealEstate r1=new RealEstate();
		r1.companyName= "Prestige";
		r1.location="Bangalore";
		r1.totalProjects= 25;
		r1.isApproved= true;
		r1.type= "Residential";
		
		Property p1=new Property();
		p1.propertyId= 1;
		p1.propertyType= "Apartment";
		p1.price= 8000000;
		p1.owner="Ravi";
		p1.isAvailable= true;
		
		r1.property= p1;
		r1.getRealEstateDetails();

		RealEstate r2= new RealEstate();
		r2.companyName= "Brigade";
		r2.location= "Bangalore";
		r2.totalProjects= 18;
		r2.isApproved= true;
		r2.type= "Commercial";
		
		Property p2= new Property();
		p2.propertyId= 2;
		p2.propertyType= "Villa";
		p2.price= 15000000;
		p2.owner= "Sneha";
		p2.isAvailable= false;
		
		r2.property= p2;
		r2.getRealEstateDetails();


		RealEstate r3= new RealEstate();
		r3.companyName= "Sobha";
		r3.location= "Mysore";
		r3.totalProjects= 12;
		r3.isApproved= true;
		r3.type= "Residential";
		
		Property p3= new Property();
		p3.propertyId= 3;
		p3.propertyType= "Flat";
		p3.price= 6000000;
		p3.owner= "Arjun";
		p3.isAvailable= true;
		
		r3.property= p3;
		r3.getRealEstateDetails();


		RealEstate r4= new RealEstate();
		r4.companyName= "Puravankara";
		r4.location= "Chennai";
		r4.totalProjects= 20;
		r4.isApproved= true;
		r4.type= "Residential";
		
		Property p4= new Property();
		p4.propertyId= 4;
		p4.propertyType= "Plot";
		p4.price= 4000000;
		p4.owner= "Priya";
		p4.isAvailable= true;
		
		r4.property= p4;
		r4.getRealEstateDetails();


		RealEstate r5= new RealEstate();
		r5.companyName= "Godrej";
		r5.location= "Mumbai";
		r5.totalProjects= 30;
		r5.isApproved= true;
		r5.type= "Commercial";
		
		Property p5= new Property();
		p5.propertyId= 5;
		p5.propertyType= "Office";
		p5.price= 20000000;
		p5.owner= "Kiran";
		p5.isAvailable= false;
		
		r5.property= p5;
		r5.getRealEstateDetails();


		RealEstate r6= new RealEstate();
		r6.companyName= "DLF";
		r6.location= "Delhi";
		r6.totalProjects= 40;
		r6.isApproved= true;
		r6.type= "Commercial";
		
		Property p6= new Property();
		p6.propertyId= 6;
		p6.propertyType= "Mall";
		p6.price= 50000000;
		p6.owner= "Anita";
		p6.isAvailable= true;
		
		r6.property= p6;
		r6.getRealEstateDetails();

		RealEstate r7= new RealEstate();
		r7.companyName= "Tata Housing";
		r7.location= "Pune";
		r7.totalProjects= 15;
		r7.isApproved= true;
		r7.type= "Residential";
		
		Property p7= new Property();
		p7.propertyId= 7;
		p7.propertyType= "Apartment";
		p7.price= 7000000;
		p7.owner= "Rahul";
		p7.isAvailable= true;
		
		r7.property= p7;
		r7.getRealEstateDetails();


		RealEstate r8= new RealEstate();
		r8.companyName= "Lodha";
		r8.location= "Mumbai";
		r8.totalProjects= 35;
		r8.isApproved= true;
		r8.type= "Residential";
		
		Property p8= new Property();
		p8.propertyId= 8;
		p8.propertyType= "Penthouse";
		p8.price= 30000000;
		p8.owner= "Divya";
		p8.isAvailable= false;
		
		r8.property= p8;
		r8.getRealEstateDetails();


		RealEstate r9= new RealEstate();
		r9.companyName= "Mahindra Lifespaces";
		r9.location= "Hyderabad";
		r9.totalProjects= 10;
		r9.isApproved= true;
		r9.type= "Residential";
		
		Property p9= new Property();
		p9.propertyId= 9;
		p9.propertyType= "Flat";
		p9.price= 5500000;
		p9.owner= "Manoj";
		p9.isAvailable= true;
		
		r9.property= p9;
		r9.getRealEstateDetails();


		RealEstate r10= new RealEstate();
		r10.companyName= "Oberoi";
		r10.location= "Mumbai";
		r10.totalProjects= 22;
		r10.isApproved= true;
		r10.type= "Commercial";
		
		Property p10= new Property();
		p10.propertyId= 10;
		p10.propertyType= "Office";
		p10.price= 25000000;
		p10.owner= "Neha";
		p10.isAvailable= true;
		
		r10.property= p10;
		r10.getRealEstateDetails();
		
		RealEstate r11= new RealEstate();
		r11.companyName= "Brigade";
		r11.location= "Hyderabad";
		r11.totalProjects= 16;
		r11.isApproved= true;
		r11.type= "Residential";
		
		Property p11= new Property();
		p11.propertyId= 11;
		p11.propertyType= "Villa";
		p11.price= 18000000;
		p11.owner= "Amit";
		p11.isAvailable= true;
		
		r11.property= p11;
		r11.getRealEstateDetails();

		RealEstate r12= new RealEstate();
		r12.companyName= "Prestige";
		r12.location= "Chennai";
		r12.totalProjects= 28;
		r12.isApproved= true;
		r12.type= "Commercial";
		
		Property p12= new Property();
		p12.propertyId= 12;
		p12.propertyType= "Office";
		p12.price= 22000000;
		p12.owner= "Pooja";
		p12.isAvailable= false;
		
		r12.property= p12;
		r12.getRealEstateDetails();

		RealEstate r13= new RealEstate();
		r13.companyName= "Sobha";
		r13.location= "Bangalore";
		r13.totalProjects= 14;
		r13.isApproved= true;
		r13.type= "Residential";
		
		Property p13= new Property();
		p13.propertyId= 13;
		p13.propertyType= "Apartment";
		p13.price= 9000000;
		p13.owner= "Vikas";
		p13.isAvailable= true;
		
		r13.property= p13;
		r13.getRealEstateDetails();


		RealEstate r14= new RealEstate();
		r14.companyName= "Godrej";
		r14.location= "Pune";
		r14.totalProjects= 32;
		r14.isApproved= true;
		r14.type= "Commercial";
		
		Property p14= new Property();
		p14.propertyId= 14;
		p14.propertyType= "Mall";
		p14.price= 45000000;
		p14.owner= "Meena";
		p14.isAvailable= true;
		
		r14.property= p14;
		r14.getRealEstateDetails();


		RealEstate r15= new RealEstate();
		r15.companyName= "DLF";
		r15.location= "Delhi";
		r15.totalProjects= 38;
		r15.isApproved= true;
		r15.type= "Commercial";
		
		Property p15= new Property();
		p15.propertyId= 15;
		p15.propertyType= "Office";
		p15.price= 30000000;
		p15.owner= "Karthik";
		p15.isAvailable= false;
		
		r15.property= p15;
		r15.getRealEstateDetails();


		RealEstate r16= new RealEstate();
		r16.companyName= "Lodha";
		r16.location= "Mumbai";
		r16.totalProjects= 36;
		r16.isApproved= true;
		r16.type= "Residential";
		
		Property p16= new Property();
		p16.propertyId= 16;
		p16.propertyType= "Penthouse";
		p16.price= 35000000;
		p16.owner= "Swathi";
		p16.isAvailable= true;
		
		r16.property= p16;
		r16.getRealEstateDetails();


		RealEstate r17= new RealEstate();
		r17.companyName= "Tata Housing";
		r17.location= "Kolkata";
		r17.totalProjects= 17;
		r17.isApproved= true;
		r17.type= "Residential";
		
		Property p17= new Property();
		p17.propertyId= 17;
		p17.propertyType= "Flat";
		p17.price= 6500000;
		p17.owner= "Deepak";
		p17.isAvailable= true;
		
		r17.property= p17;
		r17.getRealEstateDetails();

		RealEstate r18= new RealEstate();
		r18.companyName= "Mahindra Lifespaces";
		r18.location= "Ahmedabad";
		r18.totalProjects= 11;
		r18.isApproved= true;
		r18.type= "Residential";
		
		Property p18= new Property();
		p18.propertyId= 18;
		p18.propertyType= "Plot";
		p18.price= 5000000;
		p18.owner= "Nisha";
		p18.isAvailable= false;
		
		r18.property= p18;
		r18.getRealEstateDetails();

		RealEstate r19= new RealEstate();
		r19.companyName= "Oberoi";
		r19.location= "Mumbai";
		r19.totalProjects= 24;
		r19.isApproved= true;
		r19.type= "Commercial";
		
		Property p19= new Property();
		p19.propertyId= 19;
		p19.propertyType= "Office";
		p19.price= 27000000;
		p19.owner= "Suresh";
		p19.isAvailable= true;
		
		r19.property= p19;
		r19.getRealEstateDetails();


		RealEstate r20= new RealEstate();
		r20.companyName= "Puravankara";
		r20.location= "Bangalore";
		r20.totalProjects= 21;
		r20.isApproved= true;
		r20.type= "Residential";
		
		Property p20=new Property();
		p20.propertyId= 20;
		p20.propertyType= "Apartment";
		p20.price= 8500000;
		p20.owner="Lakshmi";
		p20.isAvailable=true;
		
		r20.property= p20;
		r20.getRealEstateDetails();

	}
}