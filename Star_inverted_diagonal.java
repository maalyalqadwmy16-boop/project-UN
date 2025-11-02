package Assignment_UN;

import java.util.Scanner;

public class Star_inverted_diagonal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter any number:");

        int n = input.nextInt();

        for (int i = 0; i < n; i++) {

            for (int s = 0; s < n - i - 1; s++) {

                System.out.print(" ");
            }

            System.out.println("*");

        }

    }
}
