package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthOfLongestSubstringTest {
    private String s1 = "abcabcbb";
    private String s2 = "bbbbbb";
    private String s3 = "pwwkew";

    private LengthOfLongestSubstring solution = new LengthOfLongestSubstring();

    @Test
    public void bruteForce() {
        assertEquals(solution.bruteForce(s1), 3);
        assertEquals(solution.bruteForce(s2), 1);
        assertEquals(solution.bruteForce(s3), 3);
    }

    @Test
    public void slidingWindow() {
        assertEquals(solution.slidingWindow(s1), 3);
        assertEquals(solution.slidingWindow(s2), 1);
        assertEquals(solution.slidingWindow(s3), 3);
    }
}