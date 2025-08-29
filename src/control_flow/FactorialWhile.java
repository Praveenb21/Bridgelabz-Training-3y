package control_flow;

import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = input.nextInt();
        if (num < 0) {
            System.out.println("Not a valid input");
            return;
        }

        int fact = 1;
        int i = 1;
        while (i <= num) {
            fact *= i;
            i++;
        }

        System.out.println("Factorial is: " + fact);
    }
}

