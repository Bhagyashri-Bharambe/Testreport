package Inheritance;
//parent class
class fruits
{
	int fruitAge;
	fruits() 
		{
			System.out.println("fruit class construstor..");
			fruitAge = 7;
		}
	public void taste() 
		{
			System.out.println("Fruits are sweet");
		}
}
//child class of fruit
class orange extends fruits
{
	int fruitAge;
	orange() 
		{
			// super(); //java compiler will write default super()
			System.out.println("orange class construstor..");
			fruitAge = 5;
		}
	public void shape()
		{
			System.out.println("orange is round");
			System.out.println("Orange fruitAge: "+fruitAge);
			System.out.println("Fruits fruitAge: "+super.fruitAge);
			super.taste();
		}
}
public class Inherit7
{
	public static void main(String[] args)
	{

		System.out.println("*******************Start main method************************");
		orange o1=new orange();
		o1.shape();
		System.out.println("*******************End main method************************");
	}
}
