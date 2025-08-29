package control_flow;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of months: ");
        int month = input.nextInt();
        System.out.println("Enter the number of days: ");
        int day = input.nextInt();
        boolean isSpring = (month == 3 && day >= 20) ||
                (month == 4 || month == 5) ||
                (month == 6 && day <= 20);
        System.out.println(isSpring ? "It's a Spring Season" : "Not a Spring Season");
    }
}

