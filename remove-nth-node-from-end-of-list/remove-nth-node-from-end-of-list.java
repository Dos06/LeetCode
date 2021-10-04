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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev = head, cur = head;
        int size = 0;
        while (cur != null) {
            size++;
            cur = cur.next;
        }
        cur = head;
        int index = size;
        while (cur != null) {
            if (index == n) {
                if (index == size) return cur.next;
                prev.next = cur.next;
                break;
            }
            prev = cur;
            cur = cur.next;
            index--;
        }
        return head;
    }
}