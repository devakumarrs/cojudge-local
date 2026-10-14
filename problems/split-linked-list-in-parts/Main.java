import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            ListNode head = buildList(new int[]{1, 2, 3});
            int k = 5;

            ListNode[] result = sol.splitListToParts(head, k);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            ListNode head = buildList(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
            int k = 3;

            ListNode[] result = sol.splitListToParts(head, k);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }

    private static ListNode buildList(int[] vals) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int v : vals) {
            curr.next = new ListNode(v);
            curr = curr.next;
        }
        return dummy.next;
    }

    private static String listToString(ListNode head) {
        List<String> res = new ArrayList<>();
        ListNode curr = head;
        int steps = 0;
        while (curr != null && steps < 10000) {
            res.add(String.valueOf(curr.val));
            curr = curr.next;
            steps++;
        }
        if (curr != null) res.add("...");
        return "[" + String.join(", ", res) + "]";
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
