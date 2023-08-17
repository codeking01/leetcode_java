package com.codeking.lc;

/**
 * @author xiongjl
 * @since 2023/8/10  9:46
 */
public class lc142 {
    // 法一使用 HashSet
    /*public ListNode detectCycle(ListNode head) {
        // 这个是使用一个数组先存储一下进入的元素，然后后面进入的元素如果是加入数组（环上的），一定是在数组中的某个位置
        HashSet<ListNode> set = new HashSet<>();
        ListNode temp = head;
        while (temp != null) {
            // 先看看有没有
            if (set.contains(temp)) {
                return temp;
            }
            set.add(temp);
            temp = temp.next;
        }
        return null;
    }*/
    // 法二 使用快慢指针
    public ListNode detectCycle(ListNode head) {
        // 关键是 当相遇的时候，慢指针再走x步一定会和头节点走x步相遇
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                fast = head;
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return null;
        }
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }

}
