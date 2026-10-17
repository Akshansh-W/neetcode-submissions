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
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode p1 = head, p2 = head;

        while (p2 != null && p2.next != null) {
            p1 = p1.next;       // 1. Step slow forward
            p2 = p2.next.next;  // 2. Step fast forward

            if (p1 == p2) {     // 3. NOW check if they met
                return true;
            }
        }

        return false;
    }
}