public class MyFirstGame {
    public static void main(String[] args) {
        byte pcNumber = 49;
        byte yourNumber = 48;
        while (pcNumber != yourNumber) {
            if (yourNumber < pcNumber) {
                System.out.println("Введённое вами число меньше того, что загадал компьютер");
                pcNumber--;
            }
            else if (yourNumber > pcNumber) {
                System.out.println("Введённое вами число БОЛЬШЕ того, что загадал компьютер");
                pcNumber++;
            }
        }
        System.out.println("Вы угадали! " + pcNumber);
    }
}