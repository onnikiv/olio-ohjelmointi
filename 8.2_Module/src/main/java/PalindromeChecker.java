
import java.util.ArrayList;
import java.util.List;

public class PalindromeChecker {

    public boolean testIsPalindrome(String inputStr) {
        
        List<Character> chars = new ArrayList<>();
        List<Character> reversedChars = new ArrayList<>();

        String str = inputStr.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            
            if (currentChar != ' ' && currentChar != ',' && currentChar != '.') {
                chars.add(currentChar);
            }
        }
        
        for (int i = chars.size() - 1; i >= 0; i--) {
            reversedChars.add(chars.get(i));
        }
            
        System.out.println(chars);
        System.out.println(reversedChars);

        return chars.equals(reversedChars);
    }
}
