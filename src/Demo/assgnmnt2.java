package Demo;

public class assgnmnt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 100; i++) {
			//int a = i%3? (i%5? ("fizzbuzz" : "fizz")):(i%5? ("buzz" : i));
			//System.out.print(i + " ");
			if(i%3 == 0) {
				System.out.print("Fizz" + ",");
			}
			else if(i%5 == 0) {
				System.out.print("Buzz" + ",");
			}
			else if(i%15==0) {
				System.out.print("Fizzbuzz" + ",");
			}
			else {
				System.out.print(i + ",");
			}
		}
	}

}
