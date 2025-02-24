package Array.JAVA_PROGRAMMING_BATCH;

import java.util.Scanner;

public class SumOfEvenAndOddNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the value of n: ");  
        int n = s.nextInt();

        int sumEven = 0, sumOdd = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {  // Check if the number is even
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }

        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);

       
    }
}
