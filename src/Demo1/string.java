package Demo1;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "dream big";
		String reversedStr = "";
		String[] splitted = s.split(" ");
		System.out.println(splitted[0]);
		System.out.println(splitted[1]);
		for(int i = s.length()-1; i >= 0; i--) {
			System.out.println(s.charAt(i));
			reversedStr = reversedStr + s.charAt(i);
			
		}
		System.out.println("Original String:" + " " + s);
		System.out.println("Reversed string:" +" " +reversedStr);
		if (reversedStr == s) {
			System.out.println("Its a pallindrome");
		}
		else {System.out.println("not a pallindrome");}

		for(int i = 0; i< s.length();i++) {
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i)== 'u') {
				System.out.println("String contais a vowel");
			}
			else {
				System.out.println("it doesn't contain a vowel");
			}
		}
	}

}
