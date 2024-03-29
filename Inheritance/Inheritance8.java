package Inheritance;
//parent class
class fruits1 {
	int fruitAge;
	fruits1() {
		System.out.println("fruitA class cons..");
		fruitAge = 7;
	}
	public void taste() {
		System.out.println("Fruits are sweet");
	}
}
//child class of fruit
class mango extends fruits1 {
	int fruitAge;

	mango() {
		// super(); //java compiler will write default super()
		System.out.println("mango class Cons..");
		fruitAge = 5;
	}
	public void taste() {
		System.out.println("Mango are Tart in taste");
	}
	public void shape() {
		System.out.println("mango is round");
	}
}

public class Inheritance8 
{
	public static void main(String[] args) {
		System.out.println("*******************************************");
		mango m1=new mango();
		m1.shape();//mango is round
		m1.taste();//Mango are Tart in taste
		System.out.println(m1.fruitAge);//5
		
		fruits1 f1=new fruits1();
		f1.taste();//Fruits are sweet
		System.out.println(f1.fruitAge);//7
		System.out.println("*******************************************");
	}

}
