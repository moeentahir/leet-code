package leet.code._121_130;

public class ValidPalindrome_Expand {
    boolean isPalindrome(String s) {
//        var input = s.replaceAll("[^A-Za-z0-9]", "");
//        var start = 0;
//        var end = input.length() - 1;
//        var isPalindrome = true;
//        while (start < end) {
//
//            if (input.charAt(start) != input.charAt(end)) {
//                isPalindrome = false;
//                break;
//            }
//
//            start++;
//            end--;
//        }
//        return isPalindrome;
        return true;
    }

    MidPoint compoteMid(String args) {
        int start = 0;
        int end = 0;

        if (args.length() % 2 == 0) {
            start = (args.length() / 2) - 1;
            end = start + 1;

        } else {
            end = start = (int) Math.floor((double) args.length() / 2);
        }

        return new MidPoint(start, end);
    }

    class MidPoint {
        private final int start;
        private final int end;

        public MidPoint(int start, int end) {

            this.start = start;
            this.end = end;
        }

        public int getStart() {
            return start;
        }

        public int getEnd() {
            return end;
        }
    }
}
