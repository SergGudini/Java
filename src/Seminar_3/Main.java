package Seminar_3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String args[]) {
        System.out.println("----------Задание 1----------");
        Zadanie1();

        System.out.println("----------Задание 2----------");
        Zadanie2();

        System.out.println("----------Задание 3----------");
        Zadanie3();

        System.out.println("----------Задание 4----------");
        Zadanie4();

    }

    /**
     * Дан массив записей: наименование товара, цена, сорт.
     * Найти наибольшую цену товаров 1го или 2го сорта среди товаров,
     * название которых содержит «высший».
     */
    public static void Zadanie1(){

        Product pr = new Product("apples hight", "1",25);
        Product pr2 = new Product("apples hight", "2",15);
        Product pr3 = new Product("apples", "3",10);
        Product pr4 = new Product("apples hight", "3",11);
        Product pr5 = new Product("apples hight", "2",30);

        List<Product> productList = new ArrayList<>();
        productList.add(pr);
        productList.add(pr2);
        productList.add(pr3);
        productList.add(pr4);
        productList.add(pr5);

        int maxPrice = productList.get(0).price;
        for(int i = 0; i < productList.size(); i++){
            if (productList.get(i).name.contains("hight") &&
               (productList.get(i).sort.contains("1") || productList.get(i).sort.contains("2"))){

                if (productList.get(i).price > maxPrice){
                    maxPrice = productList.get(i).price;
                }
            }
        }
        System.out.println("Наибольшая цена товара: " + maxPrice);
    }

    /**
     *  Сведения о товаре состоят из наименования,
     *  страны-производителя, веса, цены, сорта.
     *  Получить наименования товаров заданного сорта с наименьшей ценой
     */
    public static void Zadanie2(){
            Scanner input = new Scanner(System.in);

            Product2 prod1 = new Product2("apple","BY",234,23,"2");
            Product2 prod2 = new Product2("arbuz","RUS",23,15,"1");
            Product2 prod3 = new Product2("mango","PL",34,95,"2");
            Product2 prod4 = new Product2("kivi","BY",134,10,"3");
            Product2 prod5 = new Product2("grusha","LT",230,25,"3");

            List<Product2> productList2 = new ArrayList<>();
            productList2.add(prod1);
            productList2.add(prod2);
            productList2.add(prod3);
            productList2.add(prod4);
            productList2.add(prod5);

            System.out.println("Введите сорт от 1 до 3: ");
            String inputSort = input.next();
            String resultName;
            int minPrice = productList2.get(0).price;
            int minPosition = 0;
            for(int i = 1; i < productList2.size(); i++){
                if (productList2.get(i).sort.equals(inputSort)){
                    if (productList2.get(i).price < minPrice){
                        minPrice = productList2.get(i).price;
                        minPosition = i;
                    }
                }
            }
            System.out.println("Наименование товара с наименьшей ценой: " + productList2.get(minPosition).name);
        }

    /**
     * Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
     * Найти названия книг, в которых простое количество страниц,
     * фамилия автора содержит «А» и год издания после 2010 г, включительно.
     */
    public static boolean easyNumber (int n){
        if (n < 2){
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }

        return true;
    }
    public static void Zadanie3(){
        Product3 prod1 = new Product3("Dog1","Ahmatova",2010,55);
        Product3 prod2 = new Product3("Dog2","Qwrob",2008,55);
        Product3 prod3 = new Product3("Dog3","Bolgov",2015,67);
        Product3 prod4 = new Product3("Dog4","Asder",2000,55);
        Product3 prod5 = new Product3("Dog5","Ahfp",2018,59);
        Product3 prod6 = new Product3("Dog6","Vbgt",2022,14);
        Product3 prod7 = new Product3("Dog7","Cvbra",2010,47);

        List<Product3> productList3 = new ArrayList<>();
        productList3.add(prod1);
        productList3.add(prod2);
        productList3.add(prod3);
        productList3.add(prod4);
        productList3.add(prod5);
        productList3.add(prod6);
        productList3.add(prod7);

        String[] array = {};
        for(int i = 0; i < productList3.size(); i++){
            if(easyNumber(productList3.get(i).page)){
                if((productList3.get(i).surname.contains("a") ||productList3.get(i).surname.contains("A"))
                        && productList3.get(i).year >= 2010){
                    System.out.println("Название книги: " + productList3.get(i).name);
                }
            }
        }
    }
    /**
     *  Задан целочисленный список ArrayList.
     *  Найти минимальное, максимальное и среднее из этого списка.
     */
    public static void Zadanie4(){

        Random rand = new Random();
        ArrayList<Integer> array = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++){
            array.add(rand.nextInt(0,10));
        }
        System.out.println(array.toString());

        int maxNumber = array.get(0);
        int minNumber = array.get(0);
        int sum = 0;

        for(int i = 1; i < array.size(); i++){
            if (array.get(i) > maxNumber) maxNumber = array.get(i);
            if (array.get(i) < minNumber) minNumber = array.get(i);
            sum = sum + array.get(i);
        }
        System.out.printf("Максимальный элемент: " + maxNumber + '\n');
        System.out.printf("Минимальный элемент: " + minNumber + '\n');
        System.out.printf("Среднее арифметическое: " + ((float)sum/array.size()));
    }
}
