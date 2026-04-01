class GymExecutor{
	public static void main(String[] args) {
		
		Gym g1 = new Gym();
		g1.gymName= "Golds Gym";
		g1.location= "Bangalore";
		g1.totalMembers= 200;
		g1.isOpen= true;
		g1.type= "Fitness";
		
		Trainer t1 = new Trainer();
		t1.trainerId= 1;
		t1.name= "Ravi";
		t1.experience= 5;
		t1.specialization= "Weight Training";
		t1.isCertified= true;
		
		g1.trainer= t1;
		g1.getGymDetails();


		Gym g2 = new Gym();
		g2.gymName= "Cult Fit";
		g2.location= "Bangalore";
		g2.totalMembers= 300;
		g2.isOpen= true;
		g2.type= "CrossFit";
		
		Trainer t2 = new Trainer();
		t2.trainerId= 2;
		t2.name= "Sneha";
		t2.experience= 4;
		t2.specialization= "Yoga";
		t2.isCertified= true;
		
		g2.trainer= t2;
		g2.getGymDetails();


		Gym g3 = new Gym();
		g3.gymName= "Fitness First";
		g3.location= "Mumbai";
		g3.totalMembers= 250;
		g3.isOpen= true;
		g3.type= "Cardio";
		
		Trainer t3 = new Trainer();
		t3.trainerId= 3;
		t3.name= "Arjun";
		t3.experience= 6;
		t3.specialization= "Cardio";
		t3.isCertified= true;
		
		g3.trainer= t3;
		g3.getGymDetails();


		Gym g4 = new Gym();
		g4.gymName= "Anytime Fitness";
		g4.location= "Delhi";
		g4.totalMembers= 180;
		g4.isOpen= true;
		g4.type= "Fitness";
		
		Trainer t4 = new Trainer();
		t4.trainerId= 4;
		t4.name= "Priya";
		t4.experience= 3;
		t4.specialization= "Zumba";
		t4.isCertified= true;
		
		g4.trainer= t4;
		g4.getGymDetails();


		Gym g5 = new Gym();
		g5.gymName= "Powerhouse";
		g5.location= "Chennai";
		g5.totalMembers= 220;
		g5.isOpen= false;
		g5.type= "Weight";
		
		Trainer t5 = new Trainer();
		t5.trainerId= 5;
		t5.name= "Kiran";
		t5.experience= 7;
		t5.specialization= "Bodybuilding";
		t5.isCertified= true;
		
		g5.trainer= t5;
		g5.getGymDetails();


		Gym g6 = new Gym();
		g6.gymName= "Muscle Factory";
		g6.location= "Hyderabad";
		g6.totalMembers= 260;
		g6.isOpen= true;
		g6.type= "Fitness";
		
		Trainer t6 = new Trainer();
		t6.trainerId= 6;
		t6.name= "Anita";
		t6.experience= 5;
		t6.specialization= "Aerobics";
		t6.isCertified= true;
		
		g6.trainer= t6;
		g6.getGymDetails();


		Gym g7 = new Gym();
		g7.gymName= "FitZone";
		g7.location= "Pune";
		g7.totalMembers= 210;
		g7.isOpen= true;
		g7.type= "CrossFit";
		
		Trainer t7 = new Trainer();
		t7.trainerId= 7;
		t7.name= "Rahul";
		t7.experience= 4;
		t7.specialization= "Strength";
		t7.isCertified= true;
		
		g7.trainer= t7;
		g7.getGymDetails();


		Gym g8 = new Gym();
		g8.gymName= "Pro Fitness";
		g8.location= "Kolkata";
		g8.totalMembers= 190;
		g8.isOpen= true;
		g8.type= "Fitness";
		
		Trainer t8 = new Trainer();
		t8.trainerId= 8;
		t8.name= "Divya";
		t8.experience= 3;
		t8.specialization= "Yoga";
		t8.isCertified= true;
		
		g8.trainer= t8;
		g8.getGymDetails();


		Gym g9 = new Gym();
		g9.gymName= "Iron Gym";
		g9.location= "Ahmedabad";
		g9.totalMembers= 230;
		g9.isOpen= true;
		g9.type= "Weight";
		
		Trainer t9 = new Trainer();
		t9.trainerId= 9;
		t9.name= "Manoj";
		t9.experience= 6;
		t9.specialization= "Powerlifting";
		t9.isCertified= true;
		
		g9.trainer= t9;
		g9.getGymDetails();


		Gym g10 = new Gym();
		g10.gymName= "Flex Gym";
		g10.location= "Jaipur";
		g10.totalMembers= 170;
		g10.isOpen= false;
		g10.type= "Fitness";
		
		Trainer t10 = new Trainer();
		t10.trainerId= 10;
		t10.name= "Neha";
		t10.experience= 5;
		t10.specialization= "Cardio";
		t10.isCertified= true;
		
		g10.trainer= t10;
		g10.getGymDetails();


		Gym g11 = new Gym();
		g11.gymName= "Elite Gym";
		g11.location= "Nagpur";
		g11.totalMembers= 160;
		g11.isOpen= true;
		g11.type= "Fitness";
		
		Trainer t11 = new Trainer();
		t11.trainerId= 11;
		t11.name= "Amit";
		t11.experience= 4;
		t11.specialization= "Strength";
		t11.isCertified= true;
		
		g11.trainer= t11;
		g11.getGymDetails();


		Gym g12 = new Gym();
		g12.gymName= "Max Fitness";
		g12.location= "Bhopal";
		g12.totalMembers= 150;
		g12.isOpen= true;
		g12.type= "Cardio";
		
		Trainer t12 = new Trainer();
		t12.trainerId= 12;
		t12.name= "Pooja";
		t12.experience= 3;
		t12.specialization= "Yoga";
		t12.isCertified= true;
		
		g12.trainer= t12;
		g12.getGymDetails();


		Gym g13 = new Gym();
		g13.gymName= "Urban Gym";
		g13.location= "Patna";
		g13.totalMembers= 140;
		g13.isOpen= true;
		g13.type= "Fitness";
		
		Trainer t13 = new Trainer();
		t13.trainerId= 13;
		t13.name= "Vikas";
		t13.experience= 5;
		t13.specialization= "Weight Training";
		t13.isCertified= true;
		
		g13.trainer= t13;
		g13.getGymDetails();


		Gym g14 = new Gym();
		g14.gymName= "Body Zone";
		g14.location= "Lucknow";
		g14.totalMembers= 180;
		g14.isOpen= true;
		g14.type= "Fitness";
		
		Trainer t14 = new Trainer();
		t14.trainerId= 14;
		t14.name= "Meena";
		t14.experience= 4;
		t14.specialization= "Zumba";
		t14.isCertified= true;
		
		g14.trainer= t14;
		g14.getGymDetails();


		Gym g15 = new Gym();
		g15.gymName= "Fit House";
		g15.location= "Goa";
		g15.totalMembers= 120;
		g15.isOpen= false;
		g15.type= "Cardio";
		
		Trainer t15 = new Trainer();
		t15.trainerId= 15;
		t15.name= "Karthik";
		t15.experience= 6;
		t15.specialization= "Strength";
		t15.isCertified= true;
		
		g15.trainer= t15;
		g15.getGymDetails();


		Gym g16 = new Gym();
		g16.gymName= "Strong Gym";
		g16.location= "Coimbatore";
		g16.totalMembers= 200;
		g16.isOpen= true;
		g16.type= "Weight";
		
		Trainer t16 = new Trainer();
		t16.trainerId= 16;
		t16.name= "Swathi";
		t16.experience= 5;
		t16.specialization= "Aerobics";
		t16.isCertified= true;
		
		g16.trainer= t16;
		g16.getGymDetails();


		Gym g17 = new Gym();
		g17.gymName= "Core Fitness";
		g17.location= "Kerala";
		g17.totalMembers= 130;
		g17.isOpen= true;
		g17.type= "Fitness";
		
		Trainer t17 = new Trainer();
		t17.trainerId= 17;
		t17.name= "Deepak";
		t17.experience= 4;
		t17.specialization= "Core Training";
		t17.isCertified= true;
		
		g17.trainer= t17;
		g17.getGymDetails();


		Gym g18 = new Gym();
		g18.gymName= "Prime Gym";
		g18.location= "Surat";
		g18.totalMembers= 160;
		g18.isOpen= true;
		g18.type= "Fitness";
		
		Trainer t18 = new Trainer();
		t18.trainerId= 18;
		t18.name= "Nisha";
		t18.experience= 3;
		t18.specialization= "Yoga";
		t18.isCertified= true;
		
		g18.trainer= t18;
		g18.getGymDetails();


		Gym g19 = new Gym();
		g19.gymName= "Titan Gym";
		g19.location= "Varanasi";
		g19.totalMembers= 140;
		g19.isOpen= true;
		g19.type= "Weight";
		
		Trainer t19 = new Trainer();
		t19.trainerId= 19;
		t19.name= "Suresh";
		t19.experience= 6;
		t19.specialization= "Bodybuilding";
		t19.isCertified= true;
		
		g19.trainer= t19;
		g19.getGymDetails();


		Gym g20 = new Gym();
		g20.gymName= "Ultimate Gym";
		g20.location= "Indore";
		g20.totalMembers= 180;
		g20.isOpen= true;
		g20.type= "Fitness";
		
		Trainer t20 = new Trainer();
		t20.trainerId= 20;
		t20.name= "Lakshmi";
		t20.experience= 5;
		t20.specialization= "Cardio";
		t20.isCertified= true;
		
		g20.trainer= t20;
		g20.getGymDetails();
	}
}