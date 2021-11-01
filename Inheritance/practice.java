package Inheritance;
class Company
	{
		//global variable
		int empID=801;
		void HR() //method with method overloading use of this keyword
		{
			int empID=802;
			System.out.println("Method 1 overloaded with practice class of HR");
			System.out.println("Local empID of class HR is:" +empID);
			System.out.println("Local empID of class HR is:" +this.empID);
		}
		void HR(int A)
		{
			System.out.println("Local empID of class HR is:" +this.empID);
		}
		
		Company()//constructor with overloading and use of this()
		{
			System.out.println("Company1 Constructor is called...");
		}
		
		Company(double d)
		{
			this();
			System.out.println("Company2 Constructor is called...");
		}
	}
// child class of Company
class Placed extends Company 
	{
		//global variable name as Company name variable
		int empId=803;
		double emp=26.34;
		
		int Manager()//method with method overloading use of this & super keyword
		{
			int empID=903;
			System.out.println("Class company empId is:" +this.empId);
			System.out.println("Class company emp is:" +emp);
			return (20);
		}
		void Manager(int b)
		{
			System.out.println("Class Placed manager called");
			super.HR();
			super.HR(20);
		}
		Placed()//constructor with overloading and use of this() & super()
		{
			this(25);
			System.out.println("Constructor1 of placed called");
		}
		Placed(int d)
		{
			super(25);
			System.out.println("Constructor2 of placed called");
		}
	}

public class practice
{
	public static void main(String[] args)
		{
			Placed P1=new Placed();
			P1.Manager();
			P1.Manager(30);
			//HR H1=new HR();
		}
}
