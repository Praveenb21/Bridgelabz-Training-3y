package control_flow;

import java.util.Scanner;

public class SmallestCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int n1 = input.nextInt();
        System.out.print("Enter a second number: ");
        int n2 = input.nextInt();
        System.out.print("Enter a third number: ");
        int n3 = input.nextInt();
        System.out.println("Is the first number the smallest? " + (n1 < n2 && n1 < n3));
        System.out.println("Is the second number the smallest? " + (n2 < n1 && n2 < n3));
        System.out.println("Is the third number the smallest? " + (n3 < n1 && n3 < n2));
    }
}

