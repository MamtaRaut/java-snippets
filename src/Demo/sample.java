package Demo;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car a = new Car();
		a.name = "bike";
		a.wheel = 2;
		
	Car b = new Car();
		b.name = "bus";
		b.wheel = 6;
		
		Car c = new Car("cycle",2);
		//new Car()
		System.out.println(c);
		System.out.println(a.name);
		System.out.println(b.name);
		System.out.println(c.name);
		System.out.println(c.wheel);
		
		c.display();
		int x = c.sum(1, 2, 3);
		int y = x%2;
		System.out.println(y);
		
	}
}
	class Car{
		String name ;
		int wheel ;
		
		public void display() {
			System.out.println("Hello World");
		}
		public int sum(int a, int b, int c) {
			int add = a+b+c;
			//System.out.println(add);
			return add;
		}
		Car(){
			 
			System.out.println("Now we are learning constructor");
		}	
		Car(String name, int wheel){
			this.name = name;
			this.wheel = wheel;
		
		}
	}


