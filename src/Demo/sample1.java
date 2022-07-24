package Demo;

public class sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		int a = 10;
		int b = 2;
		System.out.println( sum(a,b));
		System.out.println(sub(a,b));
		System.out.println(mul(a,b));
		System.out.println(div(a,b));
	}
		
		public static int sum(int a, int b) {
			int add = a+b;
			return add;
		}
		
		
		public static int sub(int a, int b) {
			int diff = a-b;
			
			return diff;
		}
		public static int mul(int a, int b) {
			int m = a*b;
			
			return m;
		}

		public static int div(int a, int b) {
			int d = a/b;
			
			return d;
		}


}
