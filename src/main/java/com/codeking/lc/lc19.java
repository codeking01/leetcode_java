package com.codeking.lc;

/**
 * @author xiongjl
 * @since 2023/8/17  17:35
 */
public class lc19 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(8);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        new lc19().removeNthFromEnd(node1, 2);
    }

    // 法一 遍历两次
    /*public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        // 记录长度
        int len = 0;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        temp= head;
        if (len == n ) {
            return head.next;
        }
        // 找到倒数第n个节点
        while (len - n > 1) {
            temp = temp.next;
            len--;
        }
        // 删除
        temp.next = temp.next.next;
        return head;
    }*/
    // 法二 递归去做
    /*public ListNode removeNthFromEnd(ListNode head, int n) {
        int index=recrusion(head, n);
        // 如果是第一个直接返回
        if (index==0) {
            return head.next;
        }
        return head;
    }

    public int recrusion(ListNode head,int n) {
        if (head == null) {
            return n;
        }
        int k=recrusion(head.next, n);
        if (k == 0) {
            head.next = head.next.next;
        }
        return --k;
    }*/
    // 法三 前后指针
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 前一个指针和后一个指针刚好差n,这样的话就可以一起到达结尾了
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (fast == null) {
            return slow.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

}