package dailyProgram.practise.program;
import java.util.Scanner;

public class PrimeNumber {

        // Method to check whether number is Prime
        public static boolean isPrime(int number) {

            if (number <= 1) {
                return false;
            }

            for (int i = 2; i <= number / 2; i++) {

                if (number % i == 0) {
                    return false;
                }
            }

            return true;
        }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean result = PrimeNumber.isPrime(number);

        if (result) {
            System.out.println(number + " is a Prime number");
        } else {
            System.out.println(number + " is not a Prime number");
        }

        sc.close();
    }
}

