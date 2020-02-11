import java.util.Scanner;

public class lab34 {

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
		if(!A()) {
			i = temp;
			return false;
		}
		if(!B()){
			i = temp;
			return false;
		}
		if(input[i++] != 'a') {
			i = temp;
			return false;
		}
		return true;
	}
	
	static boolean A() {
		int temp = i;
		if(input[i] == 'b') {
			i++;
			return true;
		} else {
			if(!B()) {
				i = temp;
				return false;
			}
			if(!B()) {
				i = temp;
				return false;
			}
			return true;
		}
	}
	
	static boolean B() {
		int temp = i;
		if(input[i++] != 'a') {
			i = temp;
			return false;
		}
		if(input[i++] != 'b') {
			i = temp;
			return false;
		}
		return true;
	}
}
