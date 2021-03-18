package leet.code._1_10._1;

import java.util.HashMap;

public class TwoSum_Improved {
    public int[] twoSum(int[] nums, int target) {

        var numbersIndex = new HashMap<Integer, Integer>();
        for (var i = 0; i < nums.length; i++) {
            numbersIndex.put(nums[i], i);
        }

        for (var i = 0; i < nums.length; i++) {
            var otherNumber = target - nums[i];
            if(numbersIndex.containsKey(otherNumber) && numbersIndex.get(otherNumber) != i) {
                return new int[] {i, numbersIndex.get(otherNumber)};
            }
        }

        throw new RuntimeException("Could not find number");
    }
}
