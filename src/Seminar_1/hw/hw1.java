package Seminar_1.hw;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class hw1 {
    public static void main(String args[]) {

        /*int[] array = {1, 2, 1, 2, -1, 1, 3, 1, 3, -1, 0};*/
        int[] array = new int[11];
        int sum = 0, count = 0, inputCount = 0;
        int i = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Insert array elements:");
        while(true){
            inputCount = input.nextInt();
            if (inputCount == 0){
                break;
            }
            else {
                array[i] = inputCount;
                i++;
            }
        }

        for(i = 0; i < array.length; i++) {
            if (array[i] < 0){
               count = array[i - 1];
               sum = sum + count;
            }
        }

        System.out.println(sum);
    }
}
