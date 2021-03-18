package leet.code._1_10._3;

public class LongestSubString {
    public int lengthOfLongestSubstring(String s) {

        if (s.length() == 0) {
            return 0;
        }
        var start = 0;
        var max = 0;

        for (var i = 1; i < s.length(); i++) {

            String currentStr = s.substring(start, i);
            char currentChar = s.charAt(i);
            int currentItemIndex = currentStr.lastIndexOf(currentChar);
            if (currentItemIndex > -1) {
                start += currentItemIndex + 1;
            } else {
                var currentLength = i - start;
                if (currentLength > max) {
                    max = currentLength;
                }
            }
        }

        return max + 1;
    }
}
