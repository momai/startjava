public class MyFirstGame {
	public static void main(String[] args) {
		// java
		byte x = 33;
		// you
		byte y = 28;


		int i = y;
		if (i < x) {
			while (i < x) {
				int diff = x - i;
				System.out.println("Введенное вами число меньше того, что загадал компьютер на " + diff);
				i++;
					if(i == x) {
						System.out.println("Вы угадали! " + i);
					}
			}
		}
		else if ( i > x) {
			while (i > x) {
				int diff = i - x;
				System.out.println("Введенное вами число БОЛЬШЕ того, что загадал компьютер на " + diff);
				i--;
					if(i == x) {
					System.out.println("Вы угадали! " + i);
					}
			}
		}
		if(x == y) {
			System.out.println("Вы точно подглядели! " + y);
		}		



		// СТАРЫЙ ВАРИАНТ
		// // если я загадал меньше		
		// int i = y;
		// while (i < x) {
		// 	int diff = x - i;
		// 	System.out.println("Введенное вами число меньше того, что загадал компьютер на " + diff);
		// 	i++;
		// 	if(i == x) {
		// 			System.out.println("Вы угадали!" + i);
		// 	}
		// }
			
		// // если я загадал больше		
		// int j = y;
		// while (j > x) {
		// 	int diff = j - x;
		// 	System.out.println("Введенное вами число БОЛЬШЕ того, что загадал компьютер на " + diff);
		// 	j--;
		// 	if(j == x) {
		// 		System.out.println("Вы угадали! " + j);
		// 	}
		// }


	}
}