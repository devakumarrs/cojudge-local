/*
Definition for singly-linked list. 
ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
*/
class Solution {
    public ListNode reorderList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode sent = new ListNode(0, head);
        ListNode slow = sent, fast = sent;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;

        ListNode prev = null, curr = head2;
        while (curr != null) {
            ListNode fut = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fut;
        }
        head2 = prev;
        ListNode ptr = sent;
        while (head != null && head2 != null) {
            ptr.next = head;
            head = head.next;
            ptr = ptr.next;
            ptr.next = head2;
            head2 = head2.next;
            ptr = ptr.next;
        }
        ptr.next = head == null ? head2 : head;
        return sent.next;
    }
}