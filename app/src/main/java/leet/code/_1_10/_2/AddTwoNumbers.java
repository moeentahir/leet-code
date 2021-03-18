package leet.code._1_10._2;

import java.util.Stack;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode l1Head = l1;
        ListNode l2Head = l2;

        var carryOver = 0;
        var resultStack = new Stack<Integer>();

        while (l1Head != null || l2Head != null) {
            var val1 = 0;
            var val2=0;
            if(l1Head != null ) {
                val1 = l1Head.val;
                l1Head = l1Head.next;
            }
            if(l2Head != null ) {
                val2 = l2Head.val;
                l2Head = l2Head.next;
            }
            var sum = val1 + val2 + carryOver;
            var numberToAdd = sum;
            carryOver = 0;
            if (sum > 9) {
                carryOver = 1;
                numberToAdd = sum - 10;
            }
            resultStack.push(numberToAdd);
        }

        if(carryOver>0) {
            resultStack.push(carryOver);
        }

        ListNode result = null;
        while (!resultStack.empty()) {
            result = new ListNode(resultStack.pop(), result);
        }
        return result;
    }
}
