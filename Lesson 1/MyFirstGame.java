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
            
            // int i = pcNumber;
            // while (i != yourNumber) {
            //     if (yourNumber < i) {
            //         int diff = i - yourNumber;
            //         System.out.println("Введённое вами число меньше того, что загадал компьютер на " + diff);
            //         i--;
            //     }
            //     else if (yourNumber > i) {
            //         int diff = yourNumber - i;
            //         System.out.println("Введённое вами число БОЛЬШЕ того, что загадал компьютер на " + diff);
            //         i++;
            //     }
            // }
            //     System.out.println("Вы угадали! " + pcNumber);
    }
}