package array;

import java.util.Scanner;

class DigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Negative numbers are not allowed.");
            return;
        }

        int[] frequency = new int[10];

        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            frequency[digit]++;
            temp /= 10;
        }

        System.out.println("Digit frequencies in " + number + ":");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times.");
            }
        }

        input.close();
    }
}
