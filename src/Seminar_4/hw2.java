package Seminar_4;
import java.util.*;
public class hw2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите скобочки");
        String userInput = input.nextLine();
        System.out.println(checking(userInput));
    }
    public static boolean checking(String s) {
        LinkedList<Character> list = new LinkedList<>();
        int openSize = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                list.add(s.charAt(i));
            }
            else{
                if (list.isEmpty()){
                    return false;
                }
                else if (s.charAt(i) == ')' && list.getLast().equals('('))
                    list.pollLast();
                else if (s.charAt(i) == '}' && list.getLast().equals('{'))
                    list.pollLast();
                else if (s.charAt(i) == ']' && list.getLast().equals('['))
                    list.pollLast();
                else
                    return false;
                }
            }
        return list.isEmpty();
    }
}
