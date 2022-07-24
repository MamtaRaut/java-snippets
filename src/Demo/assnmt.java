package Demo;

public class assnmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5;
		for (int i = 1; i <= rows; i++) {
			for(int j = 1; j <= i; j++) {
		
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		for(int l = 1; l <= rows; l++) {
			for(int m = rows; m >= l; m--) {
				System.out.print(m + " ");
			}
			System.out.println();
		}

	}

}
