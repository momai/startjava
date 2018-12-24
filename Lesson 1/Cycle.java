public class Cycle {
	public static void main(String[] args) {
		
		// вывести от 0 до 20
			for(int i = 0; i <= 20; i++) {
				System.out.println(i);
			}
			System.out.println("__________________");

		// числа от 6 до -6 (шаг итерации 2)
			int k = 6;
			while (k >= -6) {
				System.out.println(k);
				k-=2;
			}
			System.out.println("__________________");

		// сумма всех нечетных чисел от 10 до 20
			int j = 10;
			int sum = 0;
			do {			
				if(j % 2 != 0) {
					sum = sum + j;
				}					
				j++;
			} while (j <= 20);
			System.out.println(sum);
			System.out.println("__________________");

	}
}