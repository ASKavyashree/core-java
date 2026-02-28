package dailyProgram.practise.program;
import java.util.Scanner;

public class IndexFinder {

    public void findIndexes(String input, char ch) {

        int firstIndex = input.indexOf(ch);///java 0123
        if (firstIndex == -1) {//
            System.out.println("Character not found in the string.");
        } else {
            System.out.println("Character found at index: " + firstIndex);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String:");
        String str = scanner.nextLine();
        System.out.println("Enter a character to find:");
        char ch = scanner.next().charAt(0);

        IndexFinder finder = new IndexFinder();

        finder.findIndexes(str, ch);

        scanner.close();
    }
}
