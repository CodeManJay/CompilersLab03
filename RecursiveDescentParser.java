//S->a | ^ | (T)
//T-> T, S | S

import java.util.*;

class RecursiveDescentParser{

static int ptr;
static char[] input;

public static void main(String args[])
{
System.out.println("Enter the input string");

String s = new Scanner(System.in).nextLine();

input = s.toCharArray();

if(input.length < 1)
{
System.out.println("The input string is invalid.");
System.exit(0);
}

ptr = 0;
boolean isValid = S();
if((isValid) & (ptr == input.length))

System.out.println("The input string is valid.");
else

System.out.println("The input string is invalid.");

}

static boolean S()
{

int fallback = ptr;

if(input[ptr++] !='a')
{
ptr = fallback;
return false;
}

return true;

}

}