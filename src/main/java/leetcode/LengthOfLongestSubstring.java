package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    public int bruteForce(String s) {
        int n = s.length();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (allUnique(s, i, j)) {
                    ans = Math.max(ans, j - i);
                }
            }
        }

        return ans;
    }

    private boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();

        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);

            if (set.contains(ch)) {
                return false;
            }

            set.add(ch);
        }

        return true;
    }

    public int slidingWindow(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0;
        int i = 0;
        int j = 0;

        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        LengthOfLongestSubstring solution = new LengthOfLongestSubstring();

        String s1 = "abcabcbb";
        String s2 = "bbbbbb";
        String s3 = "pwwkew";

        System.out.println(s1 + ": " + solution.bruteForce(s1));

        System.out.println(s2 + ": " + solution.bruteForce(s2));

        System.out.println(s3 + ": " + solution.bruteForce(s3));


        System.out.println(s1 + ": " + solution.slidingWindow(s1));

        System.out.println(s2 + ": " + solution.slidingWindow(s2));

        System.out.println(s3 + ": " + solution.slidingWindow(s3));
    }
}
