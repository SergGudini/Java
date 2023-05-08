package Seminar_2.hw2;

import java.util.Scanner;

public class hw2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert size array:");
        int size = input.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = ((int)(Math.random() * 31) - 15);
            System.out.println(array[i]);
        }

        System.out.println(returnArray(array));
    }

    public static boolean returnArray (int[] array){

        for (int i = 0; i < array.length - 1; i++){
            if (array[i+1] < array[i]){
                return false;
            }
        }
        return true;
    }
}
