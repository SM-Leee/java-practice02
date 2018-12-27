package practice02;

public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		/* 코드를 완성합니다 */
		String reverseStr = (new StringBuffer(str)).reverse().toString();
		char[] c = new char[reverseStr.length()];
		for(int i =0;i<str.length();i++) {
			c[i] = reverseStr.charAt(i);
		}
		return c;
	}

	public static void printCharArray(char[] array){
		/* 코드를 완성합니다 */
		System.out.println(array);
	}
}
