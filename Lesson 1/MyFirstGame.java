public class MyFirstGame {
    public static void main(String[] args) {
        byte pcNumber = 49;
        byte yourNumber = 48;
            while (pcNumber != yourNumber) {
                if (yourNumber < pcNumber) {
                    System.out.println("�������� ���� ����� ������ ����, ��� ������� ���������");
                    pcNumber--;
                }
                else if (yourNumber > pcNumber) {
                    System.out.println("�������� ���� ����� ������ ����, ��� ������� ���������");
                    pcNumber++;
                }
            }
                System.out.println("�� �������! " + pcNumber);
            
            // int i = pcNumber;
            // while (i != yourNumber) {
            //     if (yourNumber < i) {
            //         int diff = i - yourNumber;
            //         System.out.println("�������� ���� ����� ������ ����, ��� ������� ��������� �� " + diff);
            //         i--;
            //     }
            //     else if (yourNumber > i) {
            //         int diff = yourNumber - i;
            //         System.out.println("�������� ���� ����� ������ ����, ��� ������� ��������� �� " + diff);
            //         i++;
            //     }
            // }
            //     System.out.println("�� �������! " + pcNumber);
    }
}