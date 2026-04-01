class FreelancerExecutor{
	public static void main(String[] args) {
		
		Freelancer f1= new Freelancer();
		f1.name= "Ravi";
		f1.skill= "Web Development";
		f1.experience=3;
		f1.isAvailable=true;
		f1.platform= "Upwork";
		
		Client c1 = new Client();
		c1.clientId= 1;
		c1.name= "ABC Corp";
		c1.project= "Website";
		c1.budget= 50000;
		c1.isVerified= true;
		
		f1.client= c1;
		f1.getFreelancerDetails();

		Freelancer f2 = new Freelancer();
		f2.name="Sneha";
		f2.skill= "Graphic Design";
		f2.experience= 4;
		f2.isAvailable= true;
		f2.platform= "Fiverr";
		
		Client c2 = new Client();
		c2.clientId= 2;
		c2.name= "XYZ Ltd";
		c2.project= "Logo";
		c2.budget= 10000;
		c2.isVerified= true;
		
		f2.client= c2;
		f2.getFreelancerDetails();


		Freelancer f3 = new Freelancer();
		f3.name= "Arjun";
		f3.skill= "App Development";
		f3.experience= 5;
		f3.isAvailable=false;
		f3.platform= "Upwork";
		
		Client c3 =new Client();
		c3.clientId= 3;
		c3.name= "TechSoft";
		c3.project= "Mobile App";
		c3.budget= 80000;
		c3.isVerified= true;
		
		f3.client= c3;
		f3.getFreelancerDetails();


		Freelancer f4 = new Freelancer();
		f4.name= "Priya";
		f4.skill= "Content Writing";
		f4.experience=2;
		f4.isAvailable= true;
		f4.platform= "Freelancer";
		
		Client c4= new Client();
		c4.clientId= 4;
		c4.name= "BlogHub";
		c4.project="Articles";
		c4.budget= 15000;
		c4.isVerified= false;
		
		f4.client= c4;
		f4.getFreelancerDetails();


		Freelancer f5= new Freelancer();
		f5.name= "Kiran";
		f5.skill= "SEO";
		f5.experience= 6;
		f5.isAvailable= true;
		f5.platform= "Upwork";
		
		Client c5 = new Client();
		c5.clientId= 5;
		c5.name= "MarketingPro";
		c5.project= "SEO Optimization";
		c5.budget= 30000;
		c5.isVerified= true;
		
		f5.client= c5;
		f5.getFreelancerDetails();


		Freelancer f6 = new Freelancer();
		f6.name= "Anita";
		f6.skill= "UI/UX";
		f6.experience= 4;
		f6.isAvailable= true;
		f6.platform= "Fiverr";
		
		Client c6 = new Client();
		c6.clientId= 6;
		c6.name= "DesignHub";
		c6.project= "App Design";
		c6.budget= 40000;
		c6.isVerified= true;
		
		f6.client= c6;
		f6.getFreelancerDetails();


		Freelancer f7 = new Freelancer();
		f7.name= "Rahul";
		f7.skill= "Data Analysis";
		f7.experience= 5;
		f7.isAvailable= false;
		f7.platform= "Freelancer";
		
		Client c7 = new Client();
		c7.clientId= 7;
		c7.name= "DataCorp";
		c7.project= "Analytics";
		c7.budget= 60000;
		c7.isVerified= true;
		
		f7.client= c7;
		f7.getFreelancerDetails();


		Freelancer f8 = new Freelancer();
		f8.name= "Divya";
		f8.skill= "Digital Marketing";
		f8.experience= 3;
		f8.isAvailable= true;
		f8.platform= "Upwork";
		
		Client c8 = new Client();
		c8.clientId= 8;
		c8.name= "SalesBoost";
		c8.project= "Ads";
		c8.budget= 25000;
		c8.isVerified= false;
		
		f8.client= c8;
		f8.getFreelancerDetails();


		Freelancer f9 = new Freelancer();
		f9.name= "Manoj";
		f9.skill= "Video Editing";
		f9.experience= 4;
		f9.isAvailable= true;
		f9.platform= "Fiverr";
		
		Client c9 = new Client();
		c9.clientId= 9;
		c9.name= "MediaHouse";
		c9.project= "Editing";
		c9.budget= 20000;
		c9.isVerified= true;
		
		f9.client= c9;
		f9.getFreelancerDetails();


		Freelancer f10 = new Freelancer();
		f10.name= "Neha";
		f10.skill= "Animation";
		f10.experience= 5;
		f10.isAvailable= true;
		f10.platform= "Freelancer";
		
		Client c10 = new Client();
		c10.clientId= 10;
		c10.name= "AnimStudio";
		c10.project= "Animation";
		c10.budget= 45000;
		c10.isVerified= true;
		
		f10.client= c10;
		f10.getFreelancerDetails();
    
	    		Freelancer f11 = new Freelancer();
		f11.name= "Amit";
		f11.skill= "Cyber Security";
		f11.experience= 6;
		f11.isAvailable= true;
		f11.platform= "Upwork";
		
		Client c11 = new Client();
		c11.clientId= 11;
		c11.name= "SecureTech";
		c11.project= "Security Audit";
		c11.budget= 70000;
		c11.isVerified= true;
		
		f11.client= c11;
		f11.getFreelancerDetails();


		Freelancer f12 = new Freelancer();
		f12.name= "Pooja";
		f12.skill= "Translation";
		f12.experience= 3;
		f12.isAvailable= true;
		f12.platform= "Fiverr";
		
		Client c12 = new Client();
		c12.clientId= 12;
		c12.name= "GlobalText";
		c12.project= "Translate";
		c12.budget= 12000;
		c12.isVerified= false;
		
		f12.client= c12;
		f12.getFreelancerDetails();


		Freelancer f13 = new Freelancer();
		f13.name= "Vikas";
		f13.skill= "Blockchain";
		f13.experience= 5;
		f13.isAvailable= false;
		f13.platform= "Upwork";
		
		Client c13 = new Client();
		c13.clientId= 13;
		c13.name= "CryptoTech";
		c13.project= "Blockchain App";
		c13.budget= 90000;
		c13.isVerified= true;
		
		f13.client= c13;
		f13.getFreelancerDetails();


		Freelancer f14 = new Freelancer();
		f14.name= "Meena";
		f14.skill= "Teaching";
		f14.experience= 4;
		f14.isAvailable= true;
		f14.platform= "Freelancer";
		
		Client c14 = new Client();
		c14.clientId= 14;
		c14.name= "EduWorld";
		c14.project= "Online Classes";
		c14.budget= 20000;
		c14.isVerified= true;
		
		f14.client= c14;
		f14.getFreelancerDetails();


		Freelancer f15 = new Freelancer();
		f15.name= "Karthik";
		f15.skill= "Game Dev";
		f15.experience= 5;
		f15.isAvailable= true;
		f15.platform= "Upwork";
		
		Client c15 = new Client();
		c15.clientId= 15;
		c15.name= "GameZone";
		c15.project= "Game";
		c15.budget= 80000;
		c15.isVerified= true;
		
		f15.client= c15;
		f15.getFreelancerDetails();


		Freelancer f16 = new Freelancer();
		f16.name= "Swathi";
		f16.skill= "Photography";
		f16.experience= 3;
		f16.isAvailable= true;
		f16.platform= "Fiverr";
		
		Client c16 = new Client();
		c16.clientId= 16;
		c16.name= "PhotoHub";
		c16.project= "Shoot";
		c16.budget= 25000;
		c16.isVerified= false;
		
		f16.client= c16;
		f16.getFreelancerDetails();


		Freelancer f17 = new Freelancer();
		f17.name= "Deepak";
		f17.skill= "Cloud";
		f17.experience= 6;
		f17.isAvailable= true;
		f17.platform= "Upwork";
		
		Client c17 = new Client();
		c17.clientId= 17;
		c17.name= "CloudCorp";
		c17.project= "Migration";
		c17.budget= 75000;
		c17.isVerified= true;
		
		f17.client= c17;
		f17.getFreelancerDetails();


		Freelancer f18 = new Freelancer();
		f18.name= "Nisha";
		f18.skill= "HR";
		f18.experience= 4;
		f18.isAvailable= true;
		f18.platform= "Freelancer";
		
		Client c18 = new Client();
		c18.clientId= 18;
		c18.name= "HR Solutions";
		c18.project= "Recruitment";
		c18.budget= 30000;
		c18.isVerified= true;
		
		f18.client= c18;
		f18.getFreelancerDetails();


		Freelancer f19 = new Freelancer();
		f19.name= "Suresh";
		f19.skill= "Accounting";
		f19.experience= 7;
		f19.isAvailable= false;
		f19.platform= "Upwork";
		
		Client c19 = new Client();
		c19.clientId= 19;
		c19.name= "FinancePro";
		c19.project= "Accounts";
		c19.budget= 50000;
		c19.isVerified= true;
		
		f19.client= c19;
		f19.getFreelancerDetails();


		Freelancer f20 = new Freelancer();
		f20.name= "Lakshmi";
		f20.skill= "Interior Design";
		f20.experience= 5;
		f20.isAvailable= true;
		f20.platform= "Fiverr";
		
		Client c20 = new Client();
		c20.clientId= 20;
		c20.name= "HomeDecor";
		c20.project= "Design";
		c20.budget= 60000;
		c20.isVerified= true;
		
		f20.client= c20;
		f20.getFreelancerDetails();
	}
}

		