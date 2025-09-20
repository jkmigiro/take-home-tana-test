import java.util.*;

public class Question1_LongestString {

    public static String getLongestString(
        List<Character> validCharacters,
        String[] strings
    ) {
        Set<Character> validCharSet = new HashSet<>(validCharacters);
        int maxStringIndex = -1;
        for (int j = 0; j < strings.length; j++) {
            var str = strings[j];
            var isValid = true;
            if (str == null || str.isEmpty()) {
                continue;
            }
            var s = '\0' + str;
            for (int i = 1; i < s.length(); i++) {
                // Check if character is valid
                if (!validCharSet.contains(s.charAt(i))) {
                    isValid = false;
                    break;
                }
                // Check if it's a repeating character
                if (s.charAt(i - 1) == s.charAt(i)) {
                    isValid = false;
                    break;
                }
            }
            if (
                isValid &&
                ((maxStringIndex >= 0 &&
                        str.length() > strings[maxStringIndex].length()) ||
                    maxStringIndex < 0)
            ) {
                maxStringIndex = j;
            }
        }
        return maxStringIndex >= 0 ? strings[maxStringIndex] : null;
    }
}
