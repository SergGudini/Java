package Seminar_1.cw1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int a = scanner.nextInt();
        System.out.println(subtractProductAndSum(a));
        scanner.close();
    }

    /**
     *
     * @param n входное значение
     * @return произведение минус сумма
     */
    public static int subtractProductAndSum(int n) {

        int product = 1;
        int sum = 0;

        while (n != 0)
        {
            product *= n % 10;
            sum += n % 10;
            n /= 10;
        }
        return product - sum;
    }
}