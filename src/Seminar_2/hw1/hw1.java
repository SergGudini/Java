package Seminar_2.hw1;
import java.util.Scanner;
public class hw1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert size array:");

        int size = input.nextInt();
        int sum = 0, n = 0;

        for(int i = 0; i < size; i++){
            n = input.nextInt();
            if(easyNumber(n)){
                sum += n;
            }
        }

        System.out.println("Summa:" + sum);
    }

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
}
