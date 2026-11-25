// Day 71: String matching: naive, KMP, and rolling hash
public class Example {
    public static void main(String[] args) {
        String value = "abca";
        System.out.println("Longest palindrome length: " + longestPalindrome(value));
    }

    static int longestPalindrome(String value) {
        int best = 0;
        for (int center = 0; center < value.length(); center++) {
            best = Math.max(best, expand(value, center, center));
            best = Math.max(best, expand(value, center, center + 1));
        }
        return best;
    }

    static int expand(String value, int left, int right) {
        while (left >= 0 && right < value.length() && value.charAt(left) == value.charAt(right)) {
            left--; right++;
        }
        return right - left - 1;
    }
}
