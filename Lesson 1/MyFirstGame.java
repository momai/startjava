public class MyFirstGame {
	public static void main(String[] args) {
		// java
		byte pc = 20;
		// you
		byte you = 30;



 
			int i = pc - you;
			while (i != 0) {
				if (you < pc) {
					System.out.println("Введённое вами число меньше того, что загадал компьютер на " + i);
					i--;
				}
				else if (you > pc) {

					System.out.println("Введённое вами число БОЛЬШЕ того, что загадал компьютер на " + i);
					i++;
				}
			}
				System.out.println("Вы угадали! " + you);



		// else if ( i > pc) {
		// 	while (i > pc) {
		// 		int diff = i - pc;
		// 		System.out.println("Введенное вами число БОЛЬШЕ того, что загадал компьютер на " + diff);
		// 		i--;
		// 			if(i == pc) {
		// 			System.out.println("Вы угадали! " + i);
		// 			}
		// 	}
		// }
		// if(pc == you) {
		// 	System.out.println("Вы точно подглядели! " + you);
		// }		



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