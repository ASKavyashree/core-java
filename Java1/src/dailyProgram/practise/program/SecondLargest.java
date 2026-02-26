package dailyProgram.practise.program;

public class SecondLargest {

        // Method to find second largest element
        public int findSecondLargest(int[] arr) {

            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int num : arr) {
                if (num > largest) {
                    secondLargest = largest;
                    largest = num;
                } else if (num > secondLargest && num != largest) {
                    secondLargest = num;
                }
            }

            return secondLargest;
        }
    }
