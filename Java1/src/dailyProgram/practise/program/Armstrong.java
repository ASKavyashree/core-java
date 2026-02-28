package dailyProgram.practise.program;
import java.util.Scanner;

public class Armstrong {
    // Method to check Armstrong number
    public static boolean isArmstrong(int number) {

        int originalNumber = number;
        int sum = 0;
        int digits = 0;
        int temp = number;

        // Step 1: Count digits
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        // Step 2: Calculate sum of digit^digits
        temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + power(digit, digits);
            temp = temp / 10;
        }

        // Step 3: Compare
        return sum == originalNumber;
    }

    // Method to calculate power using loop
    static int power(int base, int exponent) {
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }

        return result;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean result = Armstrong.isArmstrong(number);

        if (result) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }

        sc.close();
    }

}
