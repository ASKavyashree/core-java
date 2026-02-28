package dailyProgram.practise.program;
import java.util.Scanner;
public class Factorial {

        public static int findFactorial(int n) {

            int fact = 1;// 6 24
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            return fact;
        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int result= Factorial.findFactorial(num);
        System.out.println("Factorial = " + result);
        sc.close();
    }
}
