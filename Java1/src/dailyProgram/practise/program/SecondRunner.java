package dailyProgram.practise.program;
import java.util.Scanner;
public class SecondRunner {


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            SecondLargest sl = new SecondLargest();

            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int result = sl.findSecondLargest(arr);

            if (result == Integer.MIN_VALUE) {
                System.out.println("No second largest element found.");
            } else {
                System.out.println("Second largest element: " + result);
            }

            sc.close();
        }
    }

