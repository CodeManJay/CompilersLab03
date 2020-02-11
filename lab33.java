import java.util.Scanner;

public class lab33 {

	static char[] input;
	static int i;
	
	public static void main(String[] args) {
		System.out.println("Enter  string:");
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
		if(input[i] == 'a') {
			i++;
			return true;
		} else {
			if(input[i++] != '(') {
				i = temp;
				return false;
			}
			if(!L()) {
				i = temp;
				return false;
			}
			if(input[i++] != ')') {
				i = temp;
				return false;
			}
			return true;
		}
	}
	
	static boolean L() {
		int temp = i;
		if(!S()) {
			i = temp;
			return false;
		}
		if(!L1()){
			i = temp;
			return false;
		}
		return true;
	}
	
	static boolean L1() {
		int temp = i;
		if(!L2()) {
			i = temp;
		}
		return true;
	}
	
	static boolean L2() {
		int temp = i;
		if(input[i++] != ',') {
			i = temp;
			return false;
		}
		if(!S()) {
			i = temp;
			return false;
		}
		if(!L1()) {
			i = temp;
			return false;
		}
		return true;
	}
}
