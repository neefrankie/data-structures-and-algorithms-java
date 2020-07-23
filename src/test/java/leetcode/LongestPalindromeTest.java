package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromeTest {

    private String s1 = "babad";
    private String s2 = "cbbd";

    private LongestPalindrome solution = new LongestPalindrome();

    @Test
    public void longestPalindrome() {
        assertEquals(solution.longestPalindrome(s1), "aba");
        assertEquals(solution.longestPalindrome(s2), "bb");
    }
}