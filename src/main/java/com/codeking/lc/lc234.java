package com.codeking.lc;

/**
 * @author xiongjl
 * @since 2023/8/9  21:55
 */
public class lc234 {
    public static void main(String[] args) {
        ListNode3 listNode3 = new ListNode3(1);
        listNode3.next = new ListNode3(2);
        lc234 lc234 = new lc234();
        boolean palindrome = lc234.isPalindrome(listNode3);
        System.out.println(palindrome);
    }

    public boolean isPalindrome(ListNode3 head) {
        ListNode3 temp = head;
        int len = 0;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        int mid = len / 2;
        temp = head;
        for (int i = 0; i < mid; i++) {
            temp = temp.next;
        }
        // 翻转链表
        temp = reverseList(temp);
        while (temp != null) {
            if (head.val != temp.val) {
                return false;
            }
            head = head.next;
            temp = temp.next;
        }
        return true;
    }

    public ListNode3 reverseList(ListNode3 head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode3 temp = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return temp;
    }


}

class ListNode3 {
    int val;
    ListNode3 next;

    ListNode3() {
    }

    ListNode3(int val) {
        this.val = val;
    }

    ListNode3(int val, ListNode3 next) {
        this.val = val;
        this.next = next;
    }
}

