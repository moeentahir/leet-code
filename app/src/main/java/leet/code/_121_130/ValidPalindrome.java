package leet.code._121_130;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        var input = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        var start = 0;
        var end = input.length() - 1;
        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;


        }
        return true;
    }
}
