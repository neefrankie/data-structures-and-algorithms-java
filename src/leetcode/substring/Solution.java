package leetcode.substring;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
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

    public boolean allUnique(String s, int start, int end) {
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

    public static void main(String[] args) {
        Solution solution = new Solution();

        String s1 = "abcabcbb";
        System.out.println(s1 + ": " + solution.lengthOfLongestSubstring(s1));


        String s2 = "bbbbbb";
        System.out.println(s2 + ": " + solution.lengthOfLongestSubstring(s2));

        String s3 = "pwwkew";
        System.out.println(s3 + ": " + solution.lengthOfLongestSubstring(s3));
    }
}
