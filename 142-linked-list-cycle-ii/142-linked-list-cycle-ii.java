/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode cur = head;
        Set<ListNode> set = new LinkedHashSet<>();
        while (cur != null) {
            if (set.contains(cur))
                return cur;
            else
                set.add(cur);
            cur = cur.next;
        }
        return null;
    }
}