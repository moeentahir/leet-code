package leet.code._121_130;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {
    @Test
    void give3Elements_shouldReturnTrue() {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        boolean actual = validPalindrome.isPalindrome("aba");

        assertTrue(actual);
    }

    @Test
    void giveNonPalindrome_shouldReturnFalse() {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        boolean actual = validPalindrome.isPalindrome("abc");

        assertFalse(actual);
    }

    @Test
    void giveSingleElement_shouldReturnFalse() {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        boolean actual = validPalindrome.isPalindrome("a");

        assertTrue(actual);
    }

    @Test
    void giveASentence_shouldReturnTrue() {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        boolean actual = validPalindrome.isPalindrome("a");

        assertTrue(actual);
    }

    @Test
    void giveASentence2_shouldReturnTrue() {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        boolean actual = validPalindrome.isPalindrome("A man, a plan, a canal: Panama");

        assertTrue(actual);
    }
}