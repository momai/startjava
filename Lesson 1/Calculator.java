public class Calculator {
	public static void main(String[] args) {
		int x = 2;
		int y = 8;
		char s = '^';

		if (s == '+') {
			System.out.println(x + y);
		} else if(s == '-') {
			System.out.println(x - y);
		} else if (s == '*') {
			System.out.println(x * y);
		} else if (s == '/') {
			System.out.println(x / y);
		} else if (s == '%') { 
			System.out.println(x%y);
		} else if (s == '^') {
			long result = 1;
			for ( int i = 1; i <= y; i++) {
				result = result * x;
			}
			System.out.println(result);
		}
	}

}
