package Assignment_UN;

import java.util.Scanner;

public class Inverted_Star_Triangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter any number:");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = i; j < n; j++) {

                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
