package leet.code._1_10._2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

    @Test
    void test1() {
        ListNode listOne1 = new ListNode(3);
        ListNode listOne2 = new ListNode(4, listOne1);
        ListNode listOne3 = new ListNode(2, listOne2);

        ListNode listTwo1 = new ListNode(4);
        ListNode listTwo2 = new ListNode(6, listTwo1);
        ListNode listTwo3 = new ListNode(5, listTwo2);

        ListNode actual = new AddTwoNumbers().addTwoNumbers(listOne3, listTwo3);

        assertEquals(7, actual.getVal());
        assertEquals(0, actual.getNext().getVal());
        assertEquals(8, actual.getNext().getNext().getVal());
    }

    @Test
    void test2() {
        ListNode listOne1 = new ListNode(3);
        ListNode listOne2 = new ListNode(4, listOne1);

        ListNode listTwo1 = new ListNode(1);
        ListNode actual = new AddTwoNumbers().addTwoNumbers(listOne2, listTwo1);

        assertEquals(5, actual.getVal());
        assertEquals(3, actual.getNext().getVal());
    }

    @Test
    void test3() {
        ListNode listOne2 = new ListNode(9);

        ListNode listTwo1 = new ListNode(9);
        ListNode actual = new AddTwoNumbers().addTwoNumbers(listOne2, listTwo1);

        assertEquals(8, actual.getVal());
//        assertEquals(1, actual.getNext().getVal());
    }
}