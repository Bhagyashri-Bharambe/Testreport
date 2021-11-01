package Inheritance;
//parent class
class fruit
{
	fruit()
		{
			System.out.println("fruit class constructor..");
		}
	public void taste()
		{
			System.out.println("Fruits are sweet");
		}
}
//child class of fruit
class apple extends fruit 
{
	apple()
		{
			//super(); //java compiler will write default super()
			System.out.println("Apple class constructor..");
		}
	public void shape()
		{
			System.out.println("Apple is round");
		}
}
public class Inherit3 
{
	public static void main(String[] args) 
		{
			apple fr = new apple(); // object of child class
			fr.taste(); // call method of parent class
			fr.shape(); // call method of child class
		}
}
