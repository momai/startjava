public class MyFirstGame {
	public static void main(String[] args) {
		// java
		byte x = 40;
		// you
		byte y = 10;

		if (x < y) {
			int diff = y - x;
			System.out.println("Введенное вами число больше того, что загадал компьютер на " + diff);
		} else if(x > y) {
			int diff = x - y;
			System.out.println("Введенное вами число меньше того, что загадал компьютер на " + diff);
		}  else if(x == y) {
			System.out.println("Вы угадали!");
		}
	}
}