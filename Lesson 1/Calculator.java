public class Calculator {
	public static void main(String[] args) {
		int x = 32;
		int y = 0;
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
				// так писать неправильно
				// result = result * x;
				result *= x;
			}
			System.out.println(result);
		}
	}
}