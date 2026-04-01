class PersonExecutor{
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.name= "Ravi";
		p1.age= 25;
		p1.gender= "Male";
		p1.address= "Bangalore";
		p1.isCitizen= true;
		GovernmentIdentification g1 = new GovernmentIdentification();
		g1.idNumber= 1001;
		g1.idType= "Aadhar";
		g1.issuedBy= "UIDAI";
		g1.validity= "2030";
		g1.isActive= true;
		
		p1.card= g1;
		p1.getPersonDetails();

		Person p2 = new Person();
		p2.name= "Sneha";
		p2.age= 23;
		p2.gender= "Female";
		p2.address= "Mumbai";
		p2.isCitizen= true;
		GovernmentIdentification g2 = new GovernmentIdentification();
		g2.idNumber= 1002;
		g2.idType= "PAN";
		g2.issuedBy= "IncomeTax";
		g2.validity= "Lifetime";
		g2.isActive= true;
		
		p2.card= g2;
		p2.getPersonDetails();

		Person p3 = new Person();
		p3.name= "Arjun";
		p3.age= 30;
		p3.gender= "Male";
		p3.address= "Delhi";
		p3.isCitizen= true;
	
		GovernmentIdentification g3 = new GovernmentIdentification();
		g3.idNumber= 1003;
		g3.idType= "Driving License";
		g3.issuedBy= "RTO";
		g3.validity= "2028";
		g3.isActive= true;
		
		p3.card= g3;
		p3.getPersonDetails();
		Person p4 = new Person();
		p4.name= "Priya";
		p4.age= 28;
		p4.gender= "Female";
		p4.address= "Chennai";
		p4.isCitizen= true;
		
		GovernmentIdentification g4 = new GovernmentIdentification();
		g4.idNumber= 1004;
		g4.idType= "Voter ID";
		g4.issuedBy= "Election Commission";
		g4.validity= "Lifetime";
		g4.isActive= true;
		
		p4.card= g4;
		p4.getPersonDetails();

		Person p5 = new Person();
		p5.name= "Kiran";
		p5.age= 35;
		p5.gender= "Male";
		p5.address= "Hyderabad";
		p5.isCitizen= true;
		
		GovernmentIdentification g5 = new GovernmentIdentification();
		g5.idNumber= 1005;
		g5.idType= "Passport";
		g5.issuedBy= "Govt of India";
		g5.validity= "2032";
		g5.isActive= true;
		
		p5.card= g5;
		p5.getPersonDetails();


		Person p6 = new Person();
		p6.name= "Anita";
		p6.age= 27;
		p6.gender= "Female";
		p6.address= "Pune";
		p6.isCitizen= true;
		
		GovernmentIdentification g6 = new GovernmentIdentification();
		g6.idNumber= 1006;
		g6.idType= "Aadhar";
		g6.issuedBy= "UIDAI";
		g6.validity= "2035";
		g6.isActive= true;
		
		p6.card= g6;
		p6.getPersonDetails();


		Person p7 = new Person();
		p7.name= "Rahul";
		p7.age= 32;
		p7.gender= "Male";
		p7.address= "Kolkata";
		p7.isCitizen= true;
		
		GovernmentIdentification g7 = new GovernmentIdentification();
		g7.idNumber= 1007;
		g7.idType= "PAN";
		g7.issuedBy= "IncomeTax";
		g7.validity= "Lifetime";
		g7.isActive= true;
		
		p7.card= g7;
		p7.getPersonDetails();


		Person p8 = new Person();
		p8.name= "Divya";
		p8.age= 26;
		p8.gender= "Female";
		p8.address= "Ahmedabad";
		p8.isCitizen= true;
		
		GovernmentIdentification g8 = new GovernmentIdentification();
		g8.idNumber= 1008;
		g8.idType= "Driving License";
		g8.issuedBy= "RTO";
		g8.validity= "2030";
		g8.isActive= true;
		
		p8.card= g8;
		p8.getPersonDetails();


		Person p9 = new Person();
		p9.name= "Manoj";
		p9.age= 29;
		p9.gender= "Male";
		p9.address= "Jaipur";
		p9.isCitizen= true;
		
		GovernmentIdentification g9 = new GovernmentIdentification();
		g9.idNumber= 1009;
		g9.idType= "Voter ID";
		g9.issuedBy= "Election Commission";
		g9.validity= "Lifetime";
		g9.isActive= true;
		
		p9.card= g9;
		p9.getPersonDetails();


		Person p10 = new Person();
		p10.name= "Neha";
		p10.age= 24;
		p10.gender= "Female";
		p10.address= "Nagpur";
		p10.isCitizen= true;
		
		GovernmentIdentification g10 = new GovernmentIdentification();
		g10.idNumber= 1010;
		g10.idType= "Passport";
		g10.issuedBy= "Govt of India";
		g10.validity= "2031";
		g10.isActive= true;
		
		p10.card= g10;
		p10.getPersonDetails();


		Person p11 = new Person();
		p11.name= "Amit";
		p11.age= 31;
		p11.gender= "Male";
		p11.address= "Bhopal";
		p11.isCitizen= true;
		
		GovernmentIdentification g11 = new GovernmentIdentification();
		g11.idNumber= 1011;
		g11.idType= "Aadhar";
		g11.issuedBy= "UIDAI";
		g11.validity= "2033";
		g11.isActive= true;
		
		p11.card= g11;
		p11.getPersonDetails();


		Person p12 = new Person();
		p12.name= "Pooja";
		p12.age= 27;
		p12.gender= "Female";
		p12.address= "Patna";
		p12.isCitizen= true;
		
		GovernmentIdentification g12 = new GovernmentIdentification();
		g12.idNumber= 1012;
		g12.idType= "PAN";
		g12.issuedBy= "IncomeTax";
		g12.validity= "Lifetime";
		g12.isActive= true;
		
		p12.card= g12;
		p12.getPersonDetails();


		Person p13 = new Person();
		p13.name= "Vikas";
		p13.age= 33;
		p13.gender= "Male";
		p13.address= "Lucknow";
		p13.isCitizen= true;
		
		GovernmentIdentification g13 = new GovernmentIdentification();
		g13.idNumber= 1013;
		g13.idType= "Driving License";
		g13.issuedBy= "RTO";
		g13.validity= "2029";
		g13.isActive= true;
		
		p13.card= g13;
		p13.getPersonDetails();


		Person p14 = new Person();
		p14.name= "Meena";
		p14.age= 28;
		p14.gender= "Female";
		p14.address= "Goa";
		p14.isCitizen= true;
		
		GovernmentIdentification g14 = new GovernmentIdentification();
		g14.idNumber= 1014;
		g14.idType= "Voter ID";
		g14.issuedBy= "Election Commission";
		g14.validity= "Lifetime";
		g14.isActive= true;
		
		p14.card= g14;
		p14.getPersonDetails();


		Person p15 = new Person();
		p15.name= "Karthik";
		p15.age= 34;
		p15.gender= "Male";
		p15.address= "Coimbatore";
		p15.isCitizen= true;
		
		GovernmentIdentification g15= new GovernmentIdentification();
		g15.idNumber= 1015;
		g15.idType= "Passport";
		g15.issuedBy= "Govt of India";
		g15.validity= "2034";
		g15.isActive= true;
		
		p15.card= g15;
		p15.getPersonDetails();


		Person p16 = new Person();
		p16.name= "Swathi";
		p16.age= 26;
		p16.gender= "Female";
		p16.address= "Kerala";
		p16.isCitizen= true;
		
		GovernmentIdentification g16 = new GovernmentIdentification();
		g16.idNumber= 1016;
		g16.idType= "Aadhar";
		g16.issuedBy= "UIDAI";
		g16.validity= "2036";
		g16.isActive= true;
		
		p16.card= g16;
		p16.getPersonDetails();


		Person p17 = new Person();
		p17.name= "Deepak";
		p17.age= 29;
		p17.gender= "Male";
		p17.address= "Surat";
		p17.isCitizen= true;
		
		GovernmentIdentification g17 = new GovernmentIdentification();
		g17.idNumber= 1017;
		g17.idType= "PAN";
		g17.issuedBy= "IncomeTax";
		g17.validity= "Lifetime";
		g17.isActive= true;
		
		p17.card= g17;
		p17.getPersonDetails();


		Person p18 = new Person();
		p18.name= "Nisha";
		p18.age= 25;
		p18.gender= "Female";
		p18.address= "Varanasi";
		p18.isCitizen= true;
		
		GovernmentIdentification g18 = new GovernmentIdentification();
		g18.idNumber= 1018;
		g18.idType= "Driving License";
		g18.issuedBy= "RTO";
		g18.validity= "2031";
		g18.isActive= true;
		
		p18.card= g18;
		p18.getPersonDetails();


		Person p19 = new Person();
		p19.name= "Suresh";
		p19.age= 36;
		p19.gender="Male";
		p19.address= "Indore";
		p19.isCitizen= true;
		
		GovernmentIdentification g19 = new GovernmentIdentification();
		g19.idNumber= 1019;
		g19.idType= "Voter ID";
		g19.issuedBy="Election Commission";
		g19.validity= "Lifetime";
		g19.isActive= true;
		
		p19.card= g19;
		p19.getPersonDetails();
		Person p20= new Person();
		p20.name= "Lakshmi";
		p20.age= 27;
		p20.gender= "Female";
		p20.address= "Bangalore";
		p20.isCitizen= true;
		
		GovernmentIdentification g20 =new GovernmentIdentification();
		g20.idNumber= 1020;
		g20.idType= "Passport";
		g20.issuedBy= "Govt of India";
		g20.validity= "2035";
		g20.isActive= true;
		
		p20.card= g20;
		p20.getPersonDetails();
	}
}