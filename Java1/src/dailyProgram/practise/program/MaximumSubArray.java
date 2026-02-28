package dailyProgram.practise.program;
import java.util.Scanner;
public class MaximumSubArray {
    public static int findMaxSubarray(int[] arr) {

        int maxSoFar = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            currentSum = Math.max(arr[i], currentSum + arr[i]);// 5

            maxSoFar = Math.max(maxSoFar, currentSum);// 5
        }

        return maxSoFar;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = MaximumSubArray.findMaxSubarray(arr);

        System.out.println("Maximum Subarray Sum: " + result);

        sc.close();
    }
}
