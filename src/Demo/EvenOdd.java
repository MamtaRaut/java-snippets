package Demo;
import java.util.Scanner;
public class EvenOdd {
	

	public static void main(String[] args) {
		// TODO publiAuto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		findEvenOdd(n);

	}
	
	public static void findEvenOdd(int num) {
		if(num % 2 == 0) {
			System.out.println("Even number");
		}
		else {
			System.out.println("Odd number");
		}
		
	}
}
