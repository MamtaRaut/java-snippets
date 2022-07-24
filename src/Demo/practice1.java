package Demo;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c = new car(9);
		engine eng = new engine();
		eng.engine_name = "turbo";
		eng.num = 8014;
		c.e = eng;
		//System .out.println(c.e.num);
		bike b = new bike();
		b.display();
		//b.display2();
		car d = new bike();
		d.display();
		teacher p = new parent();
		p.assgmnt();
	}

}
class car{
	engine e;
	public void display() {
		System.out.println("This is parent class");
	}
	public car(){
		System.out.println("example");
	}
	public car(int x){
		System.out.println("overlosding");
	}
	
	//public String duplicate() {
	// System.out.println("example");
	//}
}
class bike extends car{
	public void display() {
		System.out.println("This child class");// Multiple inheritance is not allowed in java.
	}
	bike(){
		System.out.println("cons. overloading");
	}
	
	//public String duplicate(string n) {
		
	//}
}
class engine{
	String engine_name;
	int num;
	
}
abstract class teacher{
	teacher(){
		System.out.println("contructr can be cfreated in abstract class");
	}
	public abstract void assgmnt();
}
class parent extends teacher{
	parent(){
		System.out.println("true");
	}
	public void assgmnt() {
		System.out.println("hello world");
	}
}
interface health{
	public static final int a = 10;
	public abstract void checkUps();
}
interface doctor{
	public abstract void reports();
}
class A implements health, doctor{
	public void checkups(){
		System.out.println("health issues");
	}
	public void reports() {
		System.out.println("health solutions");
	}
}