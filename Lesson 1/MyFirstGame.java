public class MyFirstGame {
    public static void main(String[] args) {
        byte pcNumber = 45;
        byte youNumber = 48;
            int i = pcNumber;
            while (i != youNumber) {
                if (youNumber < i) {
                    int diff = i - youNumber;
                    System.out.println("¬ведЄнное вами число меньше того, что загадал компьютер на " + diff);
                    i--;
                }
                else if (youNumber > i) {
                    int diff = youNumber - i;
                    System.out.println("¬ведЄнное вами число ЅќЋ№Ў≈ того, что загадал компьютер на " + diff);
                    i++;
                }
            }
                System.out.println("¬ы угадали! " + pcNumber);
    }
}