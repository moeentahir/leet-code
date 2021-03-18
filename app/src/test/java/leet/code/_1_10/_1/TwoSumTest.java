package leet.code._1_10._1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    @Test
    void name() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        int[] actual = new TwoSum().twoSum(nums, target);

        assertArrayEquals(expected, actual);
    }

    @Test
    void case2() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};
        int[] actual = new TwoSum().twoSum(nums, target);

        assertArrayEquals(expected, actual);
    }

    @Test
    void case3() {
        int[] nums = {3, 3};
        int target = 6;
        int[] expected = {0, 1};
        int[] actual = new TwoSum().twoSum(nums, target);

        assertArrayEquals(expected, actual);
    }
}