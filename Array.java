package Assignment_UN;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number:");
        int n = s.nextInt();

        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {

            System.out.println("enter value of array:");
            a[i] = s.nextInt();

        }

        int odd[] = new int[n];
        int j = 0;
        for (int i = 0; i < a.length; i++) {

            if (a[i] % 2 != 0) {

                odd[j] = a[i];

                j++;
            }
        }

        int even[] = new int[n];
        int k = 0;
        for (int i = 0; i < a.length; i++) {

            if (a[i] % 2 == 0) {

                even[k] = a[i];
                k++;

            }
        }
        System.out.println("the value of main array:");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i] + " ");
        }
        
        System.out.println("-----------------------------------------");
        System.out.println("the value of odd array:");
        for (int i = 0; i < j; i++) {
            System.out.println(odd[i] + " ");
        }
        
        System.out.println("-----------------------------------------");
        System.out.println("the value of even array:");
        for (int i = 0; i < k; i++) {
            System.out.println(even[i] + " ");
        }

    }

} 
