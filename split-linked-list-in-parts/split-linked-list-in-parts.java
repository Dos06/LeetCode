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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] arr = new ListNode[k];
        int count = 0;
        ListNode cur = head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        int n = count / k;
        int mod = count % k;
        int[] indexes = new int[Math.min(count, k)];
        for (int i = 0, j = 0; i < count && j < Math.min(count, k); i += (n == 0) ? 1 : n, j++) {
            if (k < count && mod > 0 && i > 0) {
                i++;
                mod--;
            }
            indexes[j] = i;
        }

        cur = head;
        int index = 0;
        ListNode prev = null;
        for (int i = 0; index < indexes.length; i++) {
            ListNode temp = cur.next;
            if (i == indexes[index]) {
                if (prev != null) {
                    prev.next = null;
                }
                arr[index] = cur;
                index++;
            }
            prev = cur;
            cur = temp;
        }

        return arr;
    }
}