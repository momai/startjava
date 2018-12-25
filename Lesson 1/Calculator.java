public class Calculator {
	public static void main(String[] args) {
		int x = 2;
		int y = 4;
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
			int i = 1;
			long result = 1;
			do {
				result = result * x;
				i++;
			} while (i <= y);
			System.out.println(result);
		}
	}

}
