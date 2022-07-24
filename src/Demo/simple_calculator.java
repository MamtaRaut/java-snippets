package Demo;

import java.util.Scanner;

public class simple_calculator{

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("Welcome to my Calculator");
		System.out.println("Press 1 for Addition");
		System.out.println("Press 2 for Subtraction");
		System.out.println("Press 3 for Multiplication");
		System.out.println("Press 4 for Division");
		
		Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			System.out.println("operator: " + n);
			switch(n) {
			case 1:
				System.out.println("Enter two numbers");
				int a = sc.nextInt();
				int b = sc.nextInt();
				System.out.println("sum: " + (a+b));
				break;
				
			case 2:
				System.out.println("Enter two numbers");
				int c = sc.nextInt();
				int d = sc.nextInt();
				System.out.println(c - d);
				break;
				
			case 3:
				System.out.println("Enter two numbers");
				int e = sc.nextInt();
				int f = sc.nextInt();
				System.out.println(e * f);
				break;
				
			case 4:
				System.out.println("Enter two numbers");
				int g = sc.nextInt();
				int h = sc.nextInt();
				System.out.println(g / h);
				break;
				
				default: 
					System .out.println("wrong value entered");
			}
		}



	}


