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
				System.out.println("��������� ���� ����� ������ ����, ��� ������� ��������� �� " + diff);
				i++;
					if(i == x) {
						System.out.println("�� �������! " + i);
					}
			}
		}
		else if ( i > x) {
			while (i > x) {
				int diff = i - x;
				System.out.println("��������� ���� ����� ������ ����, ��� ������� ��������� �� " + diff);
				i--;
					if(i == x) {
					System.out.println("�� �������! " + i);
					}
			}
		}
		if(x == y) {
			System.out.println("�� ����� ����������! " + y);
		}		



		// ������ �������
		// // ���� � ������� ������		
		// int i = y;
		// while (i < x) {
		// 	int diff = x - i;
		// 	System.out.println("��������� ���� ����� ������ ����, ��� ������� ��������� �� " + diff);
		// 	i++;
		// 	if(i == x) {
		// 			System.out.println("�� �������!" + i);
		// 	}
		// }
			
		// // ���� � ������� ������		
		// int j = y;
		// while (j > x) {
		// 	int diff = j - x;
		// 	System.out.println("��������� ���� ����� ������ ����, ��� ������� ��������� �� " + diff);
		// 	j--;
		// 	if(j == x) {
		// 		System.out.println("�� �������! " + j);
		// 	}
		// }


	}
}