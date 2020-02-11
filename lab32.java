import java.util.Scanner;

public class lab32 {

	static char[] input;
	static int i;
	
	public static void main(String[] args) {
		System.out.println("Enter string:");
		String s = new Scanner(System.in).nextLine();
		input = s.toCharArray();
		i = 0;
		boolean isValid = S();
		if((isValid) & (i == input.length)) {
			System.out.println("accept");
		} else {
			System.out.println("reject");
		}
	}

	static boolean S() {
		int temp = i;
		if(!S1()) {
			i = temp;
			return false;
		}
		return true;
	}
	
	static boolean S2() {
		int temp = i;
		if(i == input.length) return true;
		if(input[i++] != '(') {
			i = temp;
			return false;
		}
		if(!S()) {
			i = temp;
			return false;
		}
		if(input[i++] != ')') {
			i = temp;
			return false;
		}
		if(!S1()) {
			i = temp;
			return false;
		}
		return true;
	}
	
	static boolean S1() {
		int temp = i;
		if(!S2()) {
			i = temp;
		}
		return true;
	}
}
