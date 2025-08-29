package control_flow;

import java.util.Scanner;

public class SumNaturalCompareWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = input.nextInt();
        if (n < 1) {
            System.out.println("Not a natural number");
            return;
        }

        int sum = 0, i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }

        int formula = n * (n + 1) / 2;
        System.out.println("Sum (loop): " + sum);
        System.out.println("Sum (formula): " + formula);
    }
}

