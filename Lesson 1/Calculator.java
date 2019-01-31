public class Calculator {
	public static void main(String[] args) {
		int x = 2;
		int y = 8;
		char sign = '^';

		if (sign == '+') {
			System.out.println(x + y);
		} else if(sign == '-') {
			System.out.println(x - y);
		} else if (sign == '*') {
			System.out.println(x * y);
		} else if (sign == '/') {
			System.out.println(x / y);
		} else if (sign == '%') { 
			System.out.println(x % y);
		} else if (sign == '^') {
			long result = 1;
			for (int i = 1; i <= y; i++) {
			// так писать не правильно
			// result = result * x;
			result *= x;
			}
			System.out.println(result);
		}
	}
}
