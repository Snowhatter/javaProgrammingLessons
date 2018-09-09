
public class Employee {
	int intEmplId;
	String strName;
	String strDept;
	
	Employee()
	{
		System.out.println("A new employee is created");
	}
	
	Employee(String n, String d, int i)
	{
		this(); 
		strName = n;
		strDept = d;
		intEmplId = i;
		String strEmpVar = "Boooya";
		
		System.out.println("Hello Ms." +n + " You belong to Department " +d + 
				" And your Employee Id is " +i + "," + strEmpVar + "!!!!");
	}
	
	void doWork() /*No Return*/
	{
		System.out.println("I sleep all night and work all day");
	}

}
