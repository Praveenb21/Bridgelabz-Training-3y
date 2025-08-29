package control_flow;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Salary: ");
        double salary = input.nextDouble();
        System.out.println("Enter your ServiceYears: " );
        int serviceYears = input.nextInt();

        if (serviceYears > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus is: " + bonus);
        } else {
            System.out.println("No bonus");
        }
    }
}

