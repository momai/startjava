public class Calculator {
	public static void main(String[] args) {
		int x = 83;
		int y = 7;
		int s = '^';
		int result;
		if (s == '+'){
			result = x + y;
			System.out.println(result);
		}
		else if(s == '-'){
			result = x - y;
			System.out.println(result);
		}
		else if (s == '*'){
			result = x * y;
			System.out.println(result);
		}
		else if (s == '/'){
			result = x / y;
			System.out.println(result);
		}
		// рассчет процента от числа, 'x' число, 'y' процент
		else if (s == '%'){ 
			result = x * y / 100;
			System.out.println(result);
		}
		else if (s == '^'){
			int j = 1;
			long sum = x;
			do {			
				sum = sum * x;
				j++;
			} 
		 	while (j <= y);
		 	sum = sum / x;
			System.out.println(sum);
		}
	}

}
