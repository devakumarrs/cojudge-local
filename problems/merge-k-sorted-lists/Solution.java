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
    public ListNode mergeKLists(ListNode[] lists) {
        int start = 0, end = lists.length - 1;
        return mergeKLists(lists, start, end);
    }

    private ListNode mergeKLists(ListNode[] lists, int start, int end) {
        if (start > end)
            return null;
        if (start == end)
            return lists[start];
        int mid = start + (end - start) / 2;
        ListNode left = mergeKLists(lists, start, mid);
        ListNode right = mergeKLists(lists, mid + 1, end);
        return merge(left, right);
    }

    private ListNode merge(ListNode head1, ListNode head2) {
        ListNode sent = new ListNode(0);
        ListNode p = sent;
        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                p.next = head1;
                head1 = head1.next;
            } else {
                p.next = head2;
                head2 = head2.next;
            }
            p = p.next;
        }
        p.next = head1 == null ? head2 : head1;
        return sent.next;
    }
}