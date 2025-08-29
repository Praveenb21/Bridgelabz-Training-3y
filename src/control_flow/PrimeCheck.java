package control_flow;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean isPrime = true; // assume prime

        if (number <= 1) {
            isPrime = false; // prime numbers > 1
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) { // divisible by some number other than 1 and itself
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a Prime number.");
        } else {
            System.out.println(number + " is NOT a Prime number.");
        }

        sc.close();
    }
}
