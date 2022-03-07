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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        ListNode root;
        if (list1.val > list2.val) {
            root = list2;
            list2 = list2.next;
        } else {
            root = list1;
            list1 = list1.next;
        }
        ListNode cur = root;
        while (cur != null) {
            ListNode next = null;
            if (list1 == null) {
                next = list2;
                list2 = list2 != null ? list2.next : null;
            } else if (list2 == null) {
                next = list1;
                list1 = list1.next;
            } else {
                if (list1.val == cur.val) {
                    next = list1;
                    list1 = list1.next;
                } else if (list2.val == cur.val) {
                    next = list2;
                    list2 = list2.next;
                } else if (list1.val < list2.val) {
                    next = list1;
                    list1 = list1.next;
                } else {
                    next = list2;
                    list2 = list2.next;
                }
            }

            cur.next = next;
            cur = cur.next;
        }
        return root;
    }
}