package Demo;

public class practice {
	/*static {
		System.out.println("Static will run first ");
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("after static main will run");
		
		student s = new student();//.class file is created only once
		student s1 = new student();
		
		//student.name = "Pabi";
		//System.out.println(student.name);
		student.display();
	}

}
class student{
	String name;
	int id;
	String sub;
	static {
		System.out.println("Static will run first ");
	}
	
	student(){
		this.name = "Ram";
		this.id = 7;
		this.sub = "Java";
		System.out.println("hell Ram");
		 }
	public static void display() {
		System.out.println("Hello world");
	}
}

/* order of execution in a class:
1.first all static members will load
2. static variables assignment and static block execution from top to battom
3. main method execution*/
