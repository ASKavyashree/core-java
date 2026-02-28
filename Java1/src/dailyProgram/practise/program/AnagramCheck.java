package dailyProgram.practise.program;
import java.util.Arrays;
public class AnagramCheck {

        public static boolean isAnagram(String s1, String s2) {

            char[] a = s1.toCharArray();
            char[] b = s2.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);


            return Arrays.equals(a, b);
        }



    public static void main(String[] args) {

        String s1 = "heart";
        String s2 = "earth";

        boolean result = AnagramCheck.isAnagram(s1, s2);

        if (result) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}

