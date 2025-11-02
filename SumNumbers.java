package Assignment_UN;

import java.util.Scanner;

public class SumNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");

        int n = sc.nextInt();
        System.out.println("----------------------------------------------");
        System.out.println("1-Sum of odd numbers");
        System.out.println("2-Sum of even numbers");
        System.out.println("3-Sum of prime numbers");
        System.out.println("4-The average of the sum of odd and prime numbers");
        System.out.println("----------------------------------------------");

        System.out.print("Enter your choice:");

        int ch = sc.nextInt();
        
        int sumOdd = 0, countOdd = 0;
        int sumEven = 0, countEven = 0;
        int sumPrime = 0, countPrime = 0;

        switch (ch) {

            case 1:

                for (int i = 1; i <= n; i++) {

                    if (i % 2 != 0) {
                        sumOdd += i;
                    }
                }

                System.out.println("Sum of odd numbers from 1 to " + n + " is:" + sumOdd);
                break;

            case 2:

                for (int i = 1; i <= n; i++) {

                    if (i % 2 == 0) {
                        sumEven += i;
                    }
                }

                System.out.println("Sum of even numbers from 1 to " + n + " is:" + sumEven);

                break;

            case 3:

                for (int i = 2; i <= n; i++) {

                    boolean isPrime = true;

                    for (int j = 2; j <= i / 2; j++) {
                        if (i % j == 0) {

                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime(i)) {
                        sumPrime += i;
                    }
                }

                System.out.println("Sum of prime numbers from 1 to " + n + " is:" + sumPrime);
                break;

             case 4:

                for (int i = 1; i <= n; i++) {

                    if (i % 2 != 0) {
                        sumOdd += i;
                        countOdd++;
                    }

                    if (isPrime(i)) {

                        sumPrime += i;
                        countPrime++;
                    }
                }
                int totalSum = sumOdd + sumPrime;
                int totalCount = countOdd + countPrime;

                double avg;
                if (totalCount != 0) {

                    avg = (double) totalSum / totalCount;
                } else {
                    avg = 0;
                }

                System.out.println("the avg of the sum of odd and prime numbers = " + avg);
                break;

            default:

                System.out.println("Invalid choice !");
                break;

        }

    }

    public static boolean isPrime(int num) {

        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {

            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
