class MobileExecutor{
	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		m1.brand= "Samsung";
		m1.model= "S24";
		m1.price = 94000;
		m1.is5G=false;
		m1.color = "Black";
		
		Sim s1= new Sim();
		s1.simId = 1;
		s1.network="jio";
		s1.type="Prepaid";
		s1.balance = 300;
		s1.isActive=true;
		
		m1.sim = s1;
		m1.getMobileDetails();
		Mobile m2= new Mobile();
		m2.brand = "OnePlus";
		m2.model="Nord";
		m2.price=36000;
		m2.is5G=true;
		m2.color="Blue";
		
		Sim s2 = new Sim();
		s2.simId = 2;
		s2.network = "Airtel";
		s2.type= "Postpaid";
		s2.balance=1200;
		s2.isActive=true;
		
		m2.sim = s2;
		m2.getMobileDetails();
		
		Mobile m3 = new Mobile();
		 m3.brand = "Redmi";
        m3.model = "Note 10";
        m3.price = 15000;
        m3.is5G = false;
        m3.color = "White";

        Sim s3= new Sim();
        s3.simId = 3;
        s3.network= "VI";
        s3.type="Prepaid";
        s3.balance= 250;
        s3.isActive= false;
		
		m3.sim = s3;
        m3.getMobileDetails();

        Mobile m4=new Mobile();
        m4.brand= "Realme";
        m4.model= "Narzo";
        m4.price= 17000;
        m4.is5G= true;
        m4.color= "Grey";
		
		Sim s4 = new Sim();
        s4.simId = 4;
        s4.network= "BSNL";
        s4.type = "Prepaid";
        s4.balance = 100;
        s4.isActive = true;

        m4.sim = s4;
        m4.getMobileDetails();


        Mobile m5= new Mobile();
        m5.brand = "Apple";
        m5.model= "iPhone 13";
        m5.price=70000;
        m5.is5G= true;
        m5.color = "Silver";

        Sim s5= new Sim();
        s5.simId= 5;
        s5.network= "Jio";
        s5.type = "Postpaid";
        s5.balance= 2000;
        s5.isActive= true;

        m5.sim =s5;
        m5.getMobileDetails();


        Mobile m6= new Mobile();
        m6.brand= "Vivo";
        m6.model ="V21";
        m6.price =25000;
        m6.is5G =true;
        m6.color= "Blue";

        Sim s6 = new Sim();
        s6.simId = 6;
        s6.network = "Airtel";
        s6.type= "Prepaid";
        s6.balance =400;
        s6.isActive= true;

        m6.sim = s6;
        m6.getMobileDetails();


        Mobile m7= new Mobile();
        m7.brand = "Oppo";
        m7.model = "F19";
        m7.price = 22000;
        m7.is5G = false;
        m7.color = "Black";

        Sim s7= new Sim();
        s7.simId = 7;
        s7.network = "VI";
        s7.type = "Postpaid";
        s7.balance =1500;
        s7.isActive =true;

        m7.sim = s7;
        m7.getMobileDetails();


        Mobile m8 = new Mobile();
        m8.brand = "Nokia";
        m8.model = "G20";
        m8.price = 13000;
        m8.is5G = false;
        m8.color = "Green";

        Sim s8 = new Sim();
        s8.simId = 8;
        s8.network = "BSNL";
        s8.type = "Prepaid";
        s8.balance = 200;
        s8.isActive = false;

        m8.sim = s8;
        m8.getMobileDetails();


        Mobile m9 = new Mobile();
        m9.brand = "Motorola";
        m9.model = "G60";
        m9.price = 18000;
        m9.is5G = true;
        m9.color = "Grey";

        Sim s9 = new Sim();
        s9.simId = 9;
        s9.network = "Jio";
        s9.type = "Prepaid";
        s9.balance = 350;
        s9.isActive = true;

        m9.sim = s9;
        m9.getMobileDetails();


        Mobile m10 = new Mobile();
        m10.brand = "Samsung";
        m10.model = "S21";
        m10.price = 60000;
        m10.is5G = true;
        m10.color = "Purple";

        Sim s10 = new Sim();
        s10.simId = 10;
        s10.network = "Airtel";
        s10.type = "Postpaid";
        s10.balance = 1800;
        s10.isActive = true;

        m10.sim = s10;
        m10.getMobileDetails();


        // Continue same pattern...

        Mobile m11 = new Mobile();
        m11.brand = "Redmi";
        m11.model = "Note 11";
        m11.price = 16000;
        m11.is5G = true;
        m11.color = "Blue";

        Sim s11 = new Sim();
        s11.simId = 11;
        s11.network = "VI";
        s11.type = "Prepaid";
        s11.balance = 280;
        s11.isActive = true;

        m11.sim = s11;
        m11.getMobileDetails();


        Mobile m12 = new Mobile();
        m12.brand = "Realme";
        m12.model = "GT";
        m12.price = 30000;
        m12.is5G = true;
        m12.color = "Yellow";

        Sim s12 = new Sim();
        s12.simId = 12;
        s12.network = "Jio";
        s12.type = "Postpaid";
        s12.balance = 2100;
        s12.isActive = true;

        m12.sim = s12;
        m12.getMobileDetails();


        Mobile m13 = new Mobile();
        m13.brand = "Apple";
        m13.model = "iPhone 12";
        m13.price = 65000;
        m13.is5G = true;
        m13.color = "Black";

        Sim s13 = new Sim();
        s13.simId = 13;
        s13.network = "Airtel";
        s13.type = "Prepaid";
        s13.balance = 500;
        s13.isActive = true;

        m13.sim = s13;
        m13.getMobileDetails();


        Mobile m14 = new Mobile();
        m14.brand = "Vivo";
        m14.model = "Y20";
        m14.price = 14000;
        m14.is5G = false;
        m14.color = "White";

        Sim s14 = new Sim();
        s14.simId = 14;
        s14.network = "BSNL";
        s14.type = "Prepaid";
        s14.balance = 150;
        s14.isActive = false;

        m14.sim = s14;
        m14.getMobileDetails();


        Mobile m15 = new Mobile();
        m15.brand = "Oppo";
        m15.model = "A74";
        m15.price = 21000;
        m15.is5G = true;
        m15.color = "Blue";

        Sim s15 = new Sim();
        s15.simId = 15;
        s15.network = "VI";
        s15.type = "Postpaid";
        s15.balance = 1300;
        s15.isActive = true;

        m15.sim = s15;
        m15.getMobileDetails();


        Mobile m16 = new Mobile();
        m16.brand = "Nokia";
        m16.model = "C30";
        m16.price = 12000;
        m16.is5G = false;
        m16.color = "Green";

        Sim s16 = new Sim();
        s16.simId = 16;
        s16.network = "Jio";
        s16.type = "Prepaid";
        s16.balance = 220;
        s16.isActive = true;

        m16.sim = s16;
        m16.getMobileDetails();


        Mobile m17= new Mobile();
        m17.brand ="Motorola";
        m17.model ="Edge";
        m17.price= 35000;
        m17.is5G= true;
        m17.color= "Black";

        Sim s17= new Sim();
        s17.simId= 17;
        s17.network= "Airtel";
        s17.type ="Postpaid";
        s17.balance = 2500;
        s17.isActive = true;

        m17.sim= s17;
        m17.getMobileDetails();


        Mobile m18 = new Mobile();
        m18.brand= "Samsung";
        m18.model= "M31";
        m18.price= 18000;
        m18.is5G =false;
        m18.color= "Red";

        Sim s18 = new Sim();
        s18.simId= 18;
        s18.network= "VI";
        s18.type= "Prepaid";
        s18.balance = 300;
        s18.isActive = true;

        m18.sim = s18;
        m18.getMobileDetails();


        Mobile m19= new Mobile();
        m19.brand ="Realme";
        m19.model="C25";
        m19.price= 13000;
        m19.is5G = false;
        m19.color = "Grey";

        Sim s19= new Sim();
        s19.simId =19;
        s19.network= "BSNL";
        s19.type= "Prepaid";
        s19.balance =120;
        s19.isActive= false;

        m19.sim= s19;
        m19.getMobileDetails();

        Mobile m20=new Mobile();
        m20.brand ="Apple";
        m20.model ="iPhone 14";
        m20.price= 80000;
        m20.is5G= true;
        m20.color= "Purple";

        Sim s20=new Sim();
        s20.simId= 20;
        s20.network= "Jio";
        s20.type ="Postpaid";
        s20.balance= 3000;
        s20.isActive= true;

        m20.sim= s20;
        m20.getMobileDetails();
    }
}
		
	