package control_flow;

import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int sum = 0;

        // Process each digit
        while (originalNumber != 0) {
            int digit = originalNumber % 10;  // get last digit
            sum += digit * digit * digit;     // add cube of digit
            originalNumber /= 10;             // remove last digit
        }

        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is NOT an Armstrong number.");
        }

        sc.close();
    }
}
