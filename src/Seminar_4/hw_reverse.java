package Seminar_4;
import java.util.*;

public class hw_reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер листа:");
        int size = input.nextInt();
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            list.add(((int) (Math.random() * 31)));
        }
        System.out.println("Исходный лист: " + list);

        Collections.reverse(list);
        System.out.println("Перевернутый лист: " + list);
    }
}
