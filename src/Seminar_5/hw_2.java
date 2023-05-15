package Seminar_5;

import Seminar_3.Product;

import java.util.*;

public class hw_2 {
    public static void main(String args[]) {
        Sotrudnik human1 = new Sotrudnik("Мария","Иванова");
        Sotrudnik human2 = new Sotrudnik("Александр","Губкин");
        Sotrudnik human3 = new Sotrudnik("Петр","Чекалов");
        Sotrudnik human4 = new Sotrudnik("Мария","Смелова");
        Sotrudnik human5 = new Sotrudnik("Роман","Зубин");
        Sotrudnik human6 = new Sotrudnik("Петр","Зубин");
        Sotrudnik human7 = new Sotrudnik("Алексей","Зубин");
        Sotrudnik human8 = new Sotrudnik("Мария","Злобина");

        List<Sotrudnik> humanList = new ArrayList<>();
        humanList.add(human1);
        humanList.add(human2);
        humanList.add(human3);
        humanList.add(human4);
        humanList.add(human5);
        humanList.add(human6);
        humanList.add(human7);
        humanList.add(human8);

        ArrayList<String> countName = new ArrayList<>(); //список с экслюзивных имен
        for(int i = 0; i < humanList.size(); i++){
            if (!countName.contains(humanList.get(i).name)){
                countName.add(humanList.get(i).name);
            }
        }
/**
 * Подсчет совпадений
 */
        int count = 0;
        Map<String,Integer> humanMap = new HashMap<>();
        for(int i = 0; i < countName.size(); i++){
            for(int j = 0; j < humanList.size(); j++){
                if(countName.get(i).contains(humanList.get(j).name)){
                    count++;
                }
            }
            humanMap.put(countName.get(i),count);
            count = 0;
        }
        System.out.println("Несортированный список");
        System.out.println(humanMap);
/**
 * Сортировка
 */
        List<Map.Entry<String,Integer>> sortList = new ArrayList<>(humanMap.entrySet());
        Collections.sort(sortList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        System.out.println("Отсортированный список");
        for (int i = sortList.size() - 1; i >= 0; i--){
            System.out.println(sortList.get(i));
        }
    }

}
