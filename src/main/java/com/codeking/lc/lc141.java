package com.codeking.lc;

/**
 * @author xiongjl
 * @since 2023/8/9  22:31
 */
public class lc141 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        // 快慢指针
        ListNode fast = head.next;
        while (true) {
            if (fast == null || fast.next == null) {
                return false;
            }
            fast = fast.next.next;
            head = head.next;
            if (fast == head) {
                return true;
            }
        }
    }
}
