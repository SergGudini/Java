package Seminar_1.hw;
import java.util.Scanner;
public class hw1 {

    public class ArithmeticOperations {
        public static void main(String[] args) {
            // запрашиваем у пользователя числа
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите число a: ");
            int a = scanner.nextInt();
            System.out.print("Введите число b: ");
            int b = scanner.nextInt();

            // проверяем, что оба числа являются целыми
            if ((a % 1 == 0) && (b % 1 == 0)) {
                // вычисляем результат выполнения арифметических операций
                System.out.println("a + b = " + (a + b));
                System.out.println("a - b = " + (a - b));
                System.out.println("a * b = " + (a * b));
                if (b != 0) {
                    System.out.println("a / b = " + (a / b));
                    System.out.println("a % b = " + (a % b));
                } else {
                    System.out.println("Нельзя делить на 0");
                }
            } else {
                // выводим сообщение об ошибке
                System.out.println("Ошибка: a и b должны быть целыми числами");
            }
        }
    }
}
