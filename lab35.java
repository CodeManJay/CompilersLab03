import java.util.Scanner;

public class lab35 {

	static char[] input;
	static int i;
	
	public static void main(String[] args) {
		System.out.println("Enter  string:");
		String s = new Scanner(System.in).nextLine();
		input = s.toCharArray();
		i = 0;
		boolean isValid = E();
		if((isValid) & (i == input.length)) {
			System.out.println("accept");
		} else {
			System.out.println("reject");
		}
	}
	
	static boolean E() {
		int temp = i;
		if(!T()) {
			i = temp;
			return false;
		}
		if(!A()){
			i = temp;
			return false;
		}
		return true;
	}
	
	static boolean A() {
		int temp = i;
		if(!A1()) {
			i = temp;
		}
		return true;
	}
	
	static boolean A1() {
		int temp = i;
		if(input[i++] != '+') {
			i = temp;
			return false;
		}
		if(!T()) {
			i = temp;
			return false;
		}
		if(!A()){
			i = temp;
			return false;
		}
		return true;
	}
	
	static boolean T() {
		int temp = i;
		if(!F()) {
			i = temp;
			return false;
		}
		if(!B()){
			i = temp;
			return false;
		}
		return true;
	}
	
	static boolean B() {
		int temp = i;
		if(!B1()) {
			i = temp;
		}
		return true;
	}
	
	static boolean B1() {
		int temp = i;
		if(input[i++] != '*') {
			i = temp;
			return false;
		}
		if(!F()) {
			i = temp;
			return false;
		}
		if(!B()){
			i = temp;
			return false;
		}
		return true;
	}
	
	static boolean F() {
		int temp = i;
		if(input[i] == 'a') {	// assume a as identifier
			i++;
			return true;
		} else {
			if(input[i++] != '(') {
				i = temp;
				return false;
			}
			if(!E()) {
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
}
