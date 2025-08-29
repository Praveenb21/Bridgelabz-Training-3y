package control_flow;

import java.util.Scanner;

public class SumUntilBreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        System.out.println("Enter numbers (0 or Negative value to stop):");
        while (true) {
            double val = input.nextDouble();
            if (val <= 0) break;
            total += val;
        }

        System.out.println("Total is: " + total);
    }
}
