public class MyFirstGame {
	public static void main(String[] args) {
		// java
		byte x = 40;
		// you
		byte y = 10;

		if (x < y) {
			int diff = y - x;
			System.out.println("��������� ���� ����� ������ ����, ��� ������� ��������� �� " + diff);
		} else if(x > y) {
			int diff = x - y;
			System.out.println("��������� ���� ����� ������ ����, ��� ������� ��������� �� " + diff);
		}  else if(x == y) {
			System.out.println("�� �������!");
		}
	}
}