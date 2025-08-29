package control_flow;

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        double value;

        System.out.println("Enter numbers (0 to stop):");
        while ((value = input.nextDouble()) != 0) {
            total += value;
        }

        System.out.println("Total is: " + total);
    }
}

