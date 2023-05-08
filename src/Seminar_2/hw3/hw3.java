package Seminar_2.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class hw3 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert size array:");
        int size = input.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = ((int)(Math.random() * 31) - 15);
            System.out.println(array[i]);
        }

        System.out.println(Arrays.toString(replaceElement(array)));
    }

    public static int[] replaceElement (int[] array){
        int sum = 0;

        for(int i = 0; i < array.length; i++){
            if (array[i] >= 10 && array[i] <= 99){
                sum += i;
            }
        }

        for(int i = 0; i < array.length; i++){
            if (array[i] < 0){
                array[i] = sum;
            }
        }
        return array;
    }

}
