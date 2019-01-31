public class MyFirstGame {
    public static void main(String[] args) {
        byte pcNumber = 45;
        byte youNumber = 48;
            int i = pcNumber;
            while (i != youNumber) {
                if (youNumber < i) {
                    int diff = i - youNumber;
                    System.out.println("Введённое вами число меньше того, что загадал компьютер на " + diff);
                    i--;
                }
                else if (youNumber > i) {
                    int diff = youNumber - i;
                    System.out.println("Введённое вами число БОЛЬШЕ того, что загадал компьютер на " + diff);
                    i++;
                }
            }
                System.out.println("Вы угадали! " + pcNumber);
    }
}