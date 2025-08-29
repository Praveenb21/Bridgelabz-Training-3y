package control_flow;

import java.util.Scanner;

public class OddEvenPrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        if (n < 1) {
            System.out.println("Not a natural number");
            return;
        }

        for (int i = 1; i <= n; i++) {
            System.out.println(i + " is " + (i % 2 == 0 ? "even" : "odd"));
        }
    }
}

