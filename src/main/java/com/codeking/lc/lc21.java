package com.codeking.lc;

/**
 * @author CodeKing
 * @since 2023/5/24  11:27
 */
public class lc21 {
    public static void main(String[] args) {
        lc21 lc21 = new lc21();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(8);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        System.out.println("node1 = " + node1);
        // 在建立一个链表
        ListNode node6 = new ListNode(4);
        ListNode node7 = new ListNode(4);
        ListNode node8 = new ListNode(4);
        ListNode node9 = new ListNode(5);
        ListNode node10 = new ListNode(6);
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;
        System.out.println("node6 = " + node6);
        ListNode node = lc21.mergeTwoLists(node1, node6);
        System.out.println("node = " + node);
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 递归求解
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        } else if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }


}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}