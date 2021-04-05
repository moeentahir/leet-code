package leet.code._121_130;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest_Expand {
    @Test
    void give3Elements_shouldReturnTrue() {
        var validPalindrome = new ValidPalindrome_Expand();
        boolean actual = validPalindrome.isPalindrome("aba");

        assertTrue(actual);
    }

    @Test
    void giveNonPalindrome_shouldReturnFalse() {
        var validPalindrome = new ValidPalindrome_Expand();
        boolean actual = validPalindrome.isPalindrome("abc");

        assertFalse(actual);
    }

    @Test
    void giveSingleElement_shouldReturnFalse() {
        var validPalindrome = new ValidPalindrome_Expand();
        boolean actual = validPalindrome.isPalindrome("a");

        assertTrue(actual);
    }

    @Test
    void giveASentence_shouldReturnTrue() {
        var validPalindrome = new ValidPalindrome_Expand();
        boolean actual = validPalindrome.isPalindrome("a");

        assertTrue(actual);
    }

    @Test
    void compoteMid_whenStringLengthIsOdd_shouldReturnMiddleItem() {
        var validPalindrome = new ValidPalindrome_Expand();
        ValidPalindrome_Expand.MidPoint actual = validPalindrome.compoteMid("aba");

        assertEquals(1, actual.getStart(), "Start");
        assertEquals(1, actual.getEnd(), "End");

    }

    @Test
    void compoteMid_whenStringLengthIsEven_shouldReturnMidTwo() {
        var validPalindrome = new ValidPalindrome_Expand();
        ValidPalindrome_Expand.MidPoint actual = validPalindrome.compoteMid("abba");

        assertEquals(1, actual.getStart(), "Start");
        assertEquals(2, actual.getEnd(), "End");

    }
}