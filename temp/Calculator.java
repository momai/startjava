public class Calculator {
	public static void main(String[] args) {
		int x = 2;
		int y = 4;
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
		// рассчет процента от числа, x число, y процент
		else if (s == '%'){ 
			result = x * y / 100;
			System.out.println(result);
		}

		else if (s == '^'){ 
			int i = y;
			int	sum = 0;
			while (i >= y){
				sum = x * x;
				i++;
				System.out.println(sum);
			}


			// for (int i = 1; i <= y; i++){
			// 	sum = x * x;
			// 	System.out.println(sum);
			// }



			System.out.println("______");
			System.out.println(sum);
			}
		}

	}
