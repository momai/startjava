public class Cycle {
	public static void main(String[] args) {
		
		// вывести от 0 до 20
			for(int w = 0; w <= 20; w++) {
				System.out.println(w);
			}
			System.out.println("__________________");

		// числа от 6 до -6 (шаг итерации 2)
			int h = 6;
			while (h >= -6) {
				System.out.println(h);
				h-=2;
			}
			System.out.println("__________________");

		// сумма всех нечетных чисел от 10 до 20
			int i = 10;
			int sum = 0;
			do {
				if(i % 2 == 0) {
				}
				else{
					sum = sum + i;			
				}			
				i++;
			} while (i <= 20);
			System.out.println(sum);
			System.out.println("__________________");

	}
}