public class MyFirstGame {
	public static void main(String[] args) {
		// java
		byte pc = 33;
		// you
		byte player = 28;


		int i = player;
		if (i < pc) {
			while (i < x) {
				int diff = pc - i;
				System.out.println("Введенное вами число меньше того, что загадал компьютер на " + diff);
				i++;
					if(i == pc) {
						System.out.println("Вы угадали! " + i);
					}
			}
		}
		else if ( i > pc) {
			while (i > pc) {
				int diff = i - pc;
				System.out.println("Введенное вами число БОЛЬШЕ того, что загадал компьютер на " + diff);
				i--;
					if(i == pc) {
					System.out.println("Вы угадали! " + i);
					}
			}
		}
		if(pc == player) {
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