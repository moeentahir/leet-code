package leet.code._1_10._3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubStringTest {
    @Test
    void test1() {
        int actual = new LongestSubString().lengthOfLongestSubstring("");

        assertEquals(0, actual);
    }

    @Test
    void test2() {
        int actual = new LongestSubString().lengthOfLongestSubstring("abcabcbb");

        assertEquals(3, actual);
    }

    @Test
    void test3() {
        int actual = new LongestSubString().lengthOfLongestSubstring("pwwkewww");

        assertEquals(3, actual);
    }

    @Test
    void test4() {
        int actual = new LongestSubString().lengthOfLongestSubstring("bbbbbbbb");

        assertEquals(1, actual);
    }

    @Test
    void test5() {
        int actual = new LongestSubString().lengthOfLongestSubstring(" ");

        assertEquals(1, actual);
    }

    @Test
    void test6() {
        int actual = new LongestSubString().lengthOfLongestSubstring("a");

        assertEquals(1, actual);
    }

    @Test
    void test7() {
        int actual = new LongestSubString().lengthOfLongestSubstring("dvdf");

        assertEquals(3, actual);
    }

    @Test
    void test8() {
        int actual = new LongestSubString().lengthOfLongestSubstring("bbtablud");

        assertEquals(6, actual);
    }
}