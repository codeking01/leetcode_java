package com.codeking.lc;

/**
 * @author xiongjl
 * @since 2023/8/8  21:58
 */
public class lc206 {
    public static void main(String[] args) {
        ListNode2 listNode2 = new ListNode2(1);
        listNode2.next = new ListNode2(2);
        listNode2.next.next = new ListNode2(3);
        new lc206().reverseList(listNode2);
    }

    // 双指针
    public ListNode2 reverseList(ListNode2 head) {
        ListNode2 pre = null;
        ListNode2 cur = head;
        ListNode2 next = null;
        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    /*public ListNode3 reverseList(ListNode3 head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode3 temp = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return temp;
    }*/

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
}

class ListNode2 {
    int val;
    ListNode2 next;

    ListNode2() {
    }

    ListNode2(int val) {
        this.val = val;
    }

    ListNode2(int val, ListNode2 next) {
        this.val = val;
        this.next = next;
    }
}