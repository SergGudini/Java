package Seminar_1.cw2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(countDiff(n, scanner));
        scanner.close();
    }

    /**
     *
     * @param n количество чисел в последовательности
     * @param scanner
     * @return кол положительных, идущие перед отрицательным
     */
    public static int countDiff(int n, Scanner scanner){
        int a = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < n - 1; i++)
        {
            int b = scanner.nextInt();
            if (a > 0 && b < 0) {
                count++;
            }
            a = b;
        }
        return count;
    }
}
