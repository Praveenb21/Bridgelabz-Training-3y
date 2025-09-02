package array;

import java.util.Scanner;
public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
        for (int n : arr) {
            if (n > 0) {
                if (n % 2 == 0) System.out.println(n + " is positive and even");
                else System.out.println(n + " is positive and odd");
            } else if (n < 0) System.out.println(n + " is negative");
            else System.out.println("Number is zero");
        }
        if (arr[0] == arr[4]) System.out.println("First and last are equal");
        else if (arr[0] > arr[4]) System.out.println("First is greater");
        else System.out.println("Last is greater");
    }
}

