/**
 * Created by Arjun on 2/18/17.
 */
abstract public class Person {
    private String strLName;
    private String strFName;
    private int intAge;

    public Person()
    {
        strLName = " ";
        strFName = " ";
    }

    public Person(String ln, String fn, int a)
    {
        strLName = ln;
        strFName = fn;
        intAge = a;
    }

    public String getName() {return strFName + " " + strLName;}
    public int getAge() {return intAge;}

    public abstract void takePTO();
}


class Employee extends Person implements fireable
{
    private String strJobTitle;
    private float fltSalary;

    public Employee()
    {
        strJobTitle = "Receptionist";
        fltSalary = 25000;
    }

    public Employee (String ln, String fn, int a, String jt, float sal)
    {
        super(ln,fn,a);
        strJobTitle = jt;
        fltSalary = sal;
    }
    public String getTitle() { return strJobTitle; }
    public float getSalary() {return fltSalary; }

    public String getName()
    {
        if(strJobTitle.equals("Doctor"))
            return "Dr" + super.getName();
        return super.getName();
    }

    public float fire()
    {
        System.out.println("You're Fired!!");
        return fltSalary/160;
    }

    public void takePTO(){
        System.out.println("I am taking precious time off to paint the house");
    }
}