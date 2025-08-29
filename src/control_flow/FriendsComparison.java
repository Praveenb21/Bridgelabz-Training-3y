package control_flow;

import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + friends[i] + " (in cm): ");
            heights[i] = sc.nextInt();
        }

        // Youngest
        int minAge = ages[0], youngest = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngest = i;
            }
        }
        //Tallest
        int maxHeight = heights[0], tallest = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallest = i;
            }
        }

        System.out.println("Youngest: " + friends[youngest] + " with age " + minAge);
        System.out.println("Tallest: " + friends[tallest] + " with height " + maxHeight + " cm");

        sc.close();
    }
}
