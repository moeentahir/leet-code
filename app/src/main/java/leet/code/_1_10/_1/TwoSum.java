package leet.code._1_10._1;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        var result = new int[2];

        for (var i = 0; i < nums.length; i++) {
            for (var j = i + 1; j < nums.length; j++) {
                System.out.println("i: " + i + " j:" + j);
                if (target - nums[i] == nums[j]) {
                    System.out.println("number found");
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
