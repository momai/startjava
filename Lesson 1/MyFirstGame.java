public class MyFirstGame {
	public static void main(String[] args) {
		// java
		byte pc = 20;
		// you
		byte you = 30;



 
			int i = pc - you;
			while (i != 0) {
				if (you < pc) {
					System.out.println("�������� ���� ����� ������ ����, ��� ������� ��������� �� " + i);
					i--;
				}
				else if (you > pc) {

					System.out.println("�������� ���� ����� ������ ����, ��� ������� ��������� �� " + i);
					i++;
				}
			}
				System.out.println("�� �������! " + you);



		// else if ( i > pc) {
		// 	while (i > pc) {
		// 		int diff = i - pc;
		// 		System.out.println("��������� ���� ����� ������ ����, ��� ������� ��������� �� " + diff);
		// 		i--;
		// 			if(i == pc) {
		// 			System.out.println("�� �������! " + i);
		// 			}
		// 	}
		// }
		// if(pc == you) {
		// 	System.out.println("�� ����� ����������! " + you);
		// }		



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