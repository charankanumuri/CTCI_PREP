public class LengthOfLongPalindrome {

    // Given a string s which consists of lowercase or uppercase letters, return the
    // length of the longest palindrome that can be built with those letters.

    // Letters are case sensitive, for example, "Aa" is not considered a palindrome
    // here.

    // Example 1:

    // Input: s = "abccccdd"
    // Output: 7
    // Explanation:
    // One longest palindrome that can be built is "dccaccd", whose length is 7.

    // Example 2:

    // Input: s = "a"
    // Output: 1

    // Example 3:
    // Input: s = "bb"
    // Output: 2

    // Constraints:

    // 1 <= s.length <= 2000
    // s consists of lowercase and/or uppercase English letters only.

    static int len = 0;

    public static void main(String[] args) {
        String s = "abcdefabcdef";

        maxLengthOfPalindrome(s);
        System.out.println("Length of modified string that is palindrome " + len);
    }

    public static void maxLengthOfPalindrome(String s) {
        // only small and capital letters are allowed so ASCII 128 chars are possible.
        int[] count = new int[128];
        for (char c : s.toCharArray()) {
            // if count[char] == 2 that means they can be modified such that palindrome ccan
            // be formed
            // to form a palindrome same char should be present 2 times in a string for
            // sure.
            if (++count[c] == 2) {
                len += 2;
                // mark it to 0 so that check for count in the remaining string and find if it
                // is palindrome or not.
                count[c] = 0;
            }
        }
    }

}
