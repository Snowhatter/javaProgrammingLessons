public class UseEmployee {
	public static void main(String[] args)
	{
		//Employee empAK = new Employee(); /* Default Constructor*/
		Employee empAS = new Employee("Aditi Subramanian", "Physical Therapist", 1223456);
		System.out.println("Empl Id: " + empAS.intEmplId);
		
		/*empAK.strName = "Arjun Krishnamurthy";
		empAK.intEmplId = 123987;
		empAK.strDept = "Performance Reporting Office";
		
		System.out.println(empAK.strName); 
		System.out.println(empAK.strDept);
		System.out.println(empAK.intEmplId);*/
	}

}
