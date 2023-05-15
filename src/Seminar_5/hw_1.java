package Seminar_5;

import java.util.*;

public class hw_1 {
    public static void main(String args[]) {
        String text = "Россия идет вперед всей планеты. Планета — это не Россия.";
        text = text.replaceAll("[-|–|—]|\\p{Punct}", " ");
        while (text.contains("  ")){
            text = text.replace("  ", " ");
        }
        String[] arrayText = text.split(" ");

        Map<Integer,String> ourMap = new HashMap<>();
        for (int i = 0; i < arrayText.length; i++){
            ourMap.put(i+1,arrayText[i].toLowerCase());
        }
        System.out.println(ourMap);

        Scanner input = new Scanner(System.in);
        System.out.println("Введите слово:");
        String findWord = input.next();
        findWord = findWord.toLowerCase();
        int count = Collections.frequency(new ArrayList<String>(ourMap.values()), findWord);
        System.out.println("Слово " + findWord + ": " + count);
    }



}
