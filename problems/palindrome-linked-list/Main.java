import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            ListNode head = buildList(new int[]{1, 2, 2, 1});

            boolean result = sol.isPalindrome(head);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            ListNode head = buildList(new int[]{1, 2});

            boolean result = sol.isPalindrome(head);
            System.out.println("Example 2: " + result);
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
