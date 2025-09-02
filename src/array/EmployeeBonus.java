package array;

import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int employeeCount = 10;
        double[] salary = new double[employeeCount];
        int[] yearsOfService = new int[employeeCount];
        double[] bonus = new double[employeeCount];
        double[] newSalary = new double[employeeCount];

        double totalBonus = 0.0, totalOldSalary = 0.0, totalNewSalary = 0.0;

        for (int i = 0; i < employeeCount; i++) {
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            double enteredSalary = input.nextDouble();
            if (enteredSalary <= 0) {
                System.out.println("Invalid salary, try again.");
                i--;
                continue;
            }

            System.out.print("Enter years of service of employee " + (i + 1) + ": ");
            int enteredYears = input.nextInt();
            if (enteredYears < 0) {
                System.out.println("Invalid years of service, try again.");
                i--;
                continue;
            }

            salary[i] = enteredSalary;
            yearsOfService[i] = enteredYears;
        }

        for (int i = 0; i < employeeCount; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\n--- Employee Salary Report ---");
        for (int i = 0; i < employeeCount; i++) {
            System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f%n",
                    (i + 1), salary[i], bonus[i], newSalary[i]);
        }

        System.out.printf("%nTotal Old Salary: %.2f%n", totalOldSalary);
        System.out.printf("Total Bonus Payout: %.2f%n", totalBonus);
        System.out.printf("Total New Salary: %.2f%n", totalNewSalary);

        input.close();
    }
}
