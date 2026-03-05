class Hospital{
	
	static String departmentNames[] = {"Cardiology", "Neurology", "Orthopedics", "Pediatrics", "Gynecology", "Dermatology", "Oncology", "Radiology", "Urology", "Psychiatry"};
	
	public static void getDepartmentNames(){
	    System.out.println("getDepartmentNames invoked");
	
	      for(String departmentName : departmentNames){
		      System.out.println(departmentName);
	      }
	
	System.out.println("Invoke ended");
	
    }
}

