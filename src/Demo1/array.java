package Demo1;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] a = new int[5];
		int a[] = {1,2,3,4,5};
		int[] b = new int[a.length];
		for(int i = 0; i < a.length; i++) {
		b[i] = a[i];
		}
		System.out.println("Elements of origial array:");
		for(int i =0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		System.out.println("Elements of new array:");
		for(int i =0; i < b.length; i++) {
			System.out.print(b[i]);
		}
		System.out.println(" ");
		int arr[] = {1,2,2,3,6,7,3,8};
		System.out.println("The duplicate elements are:");
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j< arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}
				
			}
		}
		System.out.println("The reverse array is:");
		for(int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println(" ");
		for(int i =0; i < arr.length; i++) {
			if (i%2 == 0) {
				System.out.println("Elemets at eve positions" + arr[i] + " ");
			}
			else {
				System.out.println("Elements at odd positios" + arr[i] + " ");
			}
		}
		for (int i=0; i< arr.length; i++) {
			if(arr[i]%2 == 0) {
				System.out.println("Multiples of 2"+ " " +arr[i]);
			}
		}
		
	}

}
