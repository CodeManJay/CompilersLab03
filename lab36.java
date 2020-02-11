import java.util.Scanner;

public class lab36 {

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
		if(!E()){
			i = temp;
			return false;
		}
		return true;
	}
	
	static boolean E() {
		int temp = i;
		if(!T()){
			i = temp;
			return false;
		}
		if(!E1()){
			i = temp;
			return false;
		}
		return true;
	}
	
	static boolean T() {
		int temp = i;
		if(!F()){
			i = temp;
			return false;
		}
		if(!T1()){
			i = temp;
			return false;
		}
		return true;
	}
	
	static boolean F() {
		int temp = i;
		if(input[i] == 'a') {
			i++;
			return true;
		} else if (input[i] == 'b') {
			i++;
			return true;
		} else if (input[i] == '0') {
			i++;
			return true;
		} else if (input[i] == '1') {
			i++;
			return true;
		} else if (input[i] == '2') {
			i++;
			return true;
		} else if (input[i] == '3') {
			i++;
			return true;
		} else if (input[i] == '4') {
			i++;
			return true;
		} else if (input[i] == '5') {
			i++;
			return true;
		} else if (input[i] == '6') {
			i++;
			return true;
		} else if (input[i] == '7') {
			i++;
			return true;
		} else if (input[i] == '8') {
			i++;
			return true;
		} else if (input[i] == '9') {
			i++;
			return true;
		}
		return false;
	}
	
	static boolean E1() {
		int temp = i;
		if(!E2()) {
			i = temp;
		}
		return true;
	}
	
	static boolean E2() {
		int temp = i;
		if(input[i] != '+' && input[i++] != '-') {
			i = temp;
			return false;
		}
		if(!T()) {
			i = temp;
			return false;
		}
		if(!E1()) {
			i = temp;
			return false;
		}
		return true;
	}
	
	static boolean T1() {
		int temp = i;
		if(!T2()) {
			i = temp;
		}
		return true;
	}
	
	static boolean T2() {
		int temp = i;
		if(input[i] != '*' && input[i++] != '/') {
			i = temp;
			return false;
		}
		if(!F()) {
			i = temp;
			return false;
		}
		if(!T1()) {
			i = temp;
			return false;
		}
		return true;
	}
}
