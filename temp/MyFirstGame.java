public class MyFirstGame {
	public static void main(String[] args) {
		// java
		byte x = 40;
		// you
		byte y = 50;

		if (x < y) {
			for(int i = 0; i < x; i++) {
			int diff = y - x;
			System.out.println("��������� ���� ����� ������ ����, ��� ������� ��������� �� " + diff);
			y--;
			}

		} else if(x > y) {
			int diff = x - y;
			System.out.println("��������� ���� ����� ������ ����, ��� ������� ��������� �� " + diff);
		}  else if(x == y) {
			System.out.println("�� �������!");
		}
	}
}