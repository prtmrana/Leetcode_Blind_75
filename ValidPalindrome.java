import java.util.ArrayList;
import java.util.List;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println("given string is a valid palindrome - > " + isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        List<Character> list = new ArrayList<>();

        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                list.add(Character.toLowerCase(ch));
            }
        }

        int i = 0, j = list.size() - 1;

        while (i < j) {
            if (!list.get(i).equals(list.get(j)))
                return false;
            i++;
            j--;
        }

        return true;
    }
}
