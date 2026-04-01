class DoorExecutor{
	public static void main(String[] args) {
		Door d1 = new Door();
		d1.material="Wood";
		d1.color= "Brown";
		d1.height= 7;
		d1.isOpen= false;
		d1.type= "Main";
		
		Lock l1 = new Lock();
		l1.lockId= 1;
		l1.brand= "Godrej";
		l1.type= "Digital";
		l1.securityLevel= 5;
		l1.isLocked= true;
		
		d1.lock= l1;
		d1.getDoorDetails();

		Door d2 = new Door();
		d2.material= "Steel";
		d2.color= "Black";
		d2.height= 7;
		d2.isOpen= true;
		d2.type= "Back";
		
		Lock l2 = new Lock();
		l2.lockId= 2;
		l2.brand= "Europa";
		l2.type= "Key";
		l2.securityLevel= 4;
		l2.isLocked= false;
		
		d2.lock= l2;
		d2.getDoorDetails();


		Door d3 = new Door();
		d3.material= "PVC";
		d3.color= "White";
		d3.height= 6;
		d3.isOpen= false;
		d3.type= "Bathroom";
		
		Lock l3 = new Lock();
		l3.lockId= 3;
		l3.brand= "Link";
		l3.type= "Latch";
		l3.securityLevel= 2;
		l3.isLocked= true;
		
		d3.lock= l3;
		d3.getDoorDetails();
		Door d4 = new Door();
		d4.material= "Wood";
		d4.color= "Cream";
		d4.height= 7;
		d4.isOpen= false;
		d4.type= "Bedroom";
		
		Lock l4 = new Lock();
		l4.lockId= 4;
		l4.brand= "Godrej";
		l4.type= "Key";
		l4.securityLevel= 3;
		l4.isLocked= true;
		
		d4.lock= l4;
		d4.getDoorDetails();


		Door d5 = new Door();
		d5.material= "Glass";
		d5.color= "Transparent";
		d5.height= 7;
		d5.isOpen= true;
		d5.type= "Office";
		
		Lock l5 = new Lock();
		l5.lockId= 5;
		l5.brand= "Samsung";
		l5.type= "Digital";
		l5.securityLevel= 5;
		l5.isLocked= false;
		
		d5.lock= l5;
		d5.getDoorDetails();
		
				Door d6 = new Door();
		d6.material= "Steel";
		d6.color= "Grey";
		d6.height= 7;
		d6.isOpen= false;
		d6.type= "Main";
		
		Lock l6 = new Lock();
		l6.lockId= 6;
		l6.brand= "Yale";
		l6.type= "Digital";
		l6.securityLevel= 5;
		l6.isLocked= true;
		
		d6.lock= l6;
		d6.getDoorDetails();


		Door d7 = new Door();
		d7.material= "Wood";
		d7.color= "Dark Brown";
		d7.height= 7;
		d7.isOpen= true;
		d7.type= "Balcony";
		
		Lock l7 = new Lock();
		l7.lockId= 7;
		l7.brand= "Europa";
		l7.type= "Key";
		l7.securityLevel= 3;
		l7.isLocked= false;
		
		d7.lock= l7;
		d7.getDoorDetails();


		Door d8 = new Door();
		d8.material= "PVC";
		d8.color= "Blue";
		d8.height= 6;
		d8.isOpen= false;
		d8.type= "Bathroom";
		
		Lock l8 = new Lock();
		l8.lockId= 8;
		l8.brand= "Link";
		l8.type= "Latch";
		l8.securityLevel= 2;
		l8.isLocked= true;
		
		d8.lock= l8;
		d8.getDoorDetails();
		Door d9 = new Door();
		d9.material= "Wood";
		d9.color= "Beige";
		d9.height= 7;
		d9.isOpen= false;
		d9.type= "Bedroom";
		
		Lock l9 = new Lock();
		l9.lockId= 9;
		l9.brand= "Godrej";
		l9.type= "Key";
		l9.securityLevel= 3;
		l9.isLocked= true;
		
		d9.lock= l9;
		d9.getDoorDetails();


		Door d10 = new Door();
		d10.material= "Glass";
		d10.color= "Transparent";
		d10.height= 7;
		d10.isOpen= true;
		d10.type= "Office";
		
		Lock l10 = new Lock();
		l10.lockId= 10;
		l10.brand= "Samsung";
		l10.type= "Digital";
		l10.securityLevel= 5;
		l10.isLocked= false;
		
		d10.lock= l10;
		d10.getDoorDetails();


		Door d11 = new Door();
		d11.material= "Steel";
		d11.color= "Black";
		d11.height= 7;
		d11.isOpen= false;
		d11.type= "Main";
		
		Lock l11 = new Lock();
		l11.lockId= 11;
		l11.brand= "Yale";
		l11.type= "Digital";
		l11.securityLevel= 5;
		l11.isLocked= true;
		
		d11.lock= l11;
		d11.getDoorDetails();


		Door d12 = new Door();
		d12.material= "Wood";
		d12.color= "White";
		d12.height= 7;
		d12.isOpen= true;
		d12.type= "Guest";
		
		Lock l12 = new Lock();
		l12.lockId= 12;
		l12.brand= "Europa";
		l12.type= "Key";
		l12.securityLevel= 3;
		l12.isLocked= false;
		
		d12.lock= l12;
		d12.getDoorDetails();
		Door d13 = new Door();
		d13.material= "PVC";
		d13.color= "Grey";
		d13.height= 6;
		d13.isOpen= false;
		d13.type= "Bathroom";
		
		Lock l13 = new Lock();
		l13.lockId= 13;
		l13.brand= "Link";
		l13.type= "Latch";
		l13.securityLevel= 2;
		l13.isLocked= true;
		
		d13.lock= l13;
		d13.getDoorDetails();


		Door d14 = new Door();
		d14.material= "Wood";
		d14.color= "Brown";
		d14.height= 7;
		d14.isOpen= false;
		d14.type= "Bedroom";
		
		Lock l14 =new Lock();
		l14.lockId= 14;
		l14.brand= "Godrej";
		l14.type= "Key";
		l14.securityLevel= 3;
		l14.isLocked= true;
		
		d14.lock= l14;
		d14.getDoorDetails();


		Door d15 = new Door();
		d15.material= "Glass";
		d15.color= "Transparent";
		d15.height= 7;
		d15.isOpen= true;
		d15.type= "Office";
		
		Lock l15 = new Lock();
		l15.lockId= 15;
		l15.brand= "Samsung";
		l15.type= "Digital";
		l15.securityLevel= 5;
		l15.isLocked= false;
		
		d15.lock= l15;
		d15.getDoorDetails();


		Door d16 = new Door();
		d16.material= "Steel";
		d16.color= "Grey";
		d16.height= 7;
		d16.isOpen= false;
		d16.type= "Main";
		
		Lock l16 = new Lock();
		l16.lockId= 16;
		l16.brand= "Yale";
		l16.type= "Digital";
		l16.securityLevel= 5;
		l16.isLocked= true;
		
		d16.lock= l16;
		d16.getDoorDetails();


		Door d17 = new Door();
		d17.material= "Wood";
		d17.color= "Dark Brown";
		d17.height= 7;
		d17.isOpen= true;
		d17.type= "Balcony";
		
		Lock l17 = new Lock();
		l17.lockId= 17;
		l17.brand= "Europa";
		l17.type= "Key";
		l17.securityLevel= 3;
		l17.isLocked= false;
		
		d17.lock= l17;
		d17.getDoorDetails();


		Door d18 = new Door();
		d18.material= "PVC";
		d18.color= "Blue";
		d18.height= 6;
		d18.isOpen= false;
		d18.type= "Bathroom";
		
		Lock l18 = new Lock();
		l18.lockId= 18;
		l18.brand= "Link";
		l18.type= "Latch";
		l18.securityLevel= 2;
		l18.isLocked= true;
		
		d18.lock= l18;
		d18.getDoorDetails();


		Door d19 = new Door();
		d19.material= "Wood";
		d19.color= "Beige";
		d19.height= 7;
		d19.isOpen= false;
		d19.type= "Bedroom";
		
		Lock l19 = new Lock();
		l19.lockId= 19;
		l19.brand= "Godrej";
		l19.type= "Key";
		l19.securityLevel= 3;
		l19.isLocked= true;
		
		d19.lock=l19;
		d19.getDoorDetails();
		Door d20 = new Door();
		d20.material= "Glass";
		d20.color= "Transparent";
		d20.height= 7;
		d20.isOpen= true;
		d20.type= "Office";
		
		Lock l20 =new Lock();
		l20.lockId= 20;
		l20.brand= "Samsung";
		l20.type= "Digital";
		l20.securityLevel= 5;
		l20.isLocked= false;
		
		d20.lock= l20;
		d20.getDoorDetails();
	}
}


