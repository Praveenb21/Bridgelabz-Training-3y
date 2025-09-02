package array;

import java.util.Scanner;
public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Not a natural number");
            return;
        }
        int[] evens = new int[number/2+1], odds = new int[number/2+1];
        int ei = 0, oi = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) evens[ei++] = i;
            else odds[oi++] = i;
        }
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oi; i++) System.out.print(odds[i] + " ");
        System.out.print("\nEven numbers: ");
        for (int i = 0; i < ei; i++) System.out.print(evens[i] + " ");
    }
}

