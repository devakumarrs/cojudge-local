import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            ListNode list1 = buildList(new int[]{1, 2, 4});
            ListNode list2 = buildList(new int[]{1, 3, 4});

            ListNode result = sol.mergeTwoLists(list1, list2);
            System.out.println("Example 1: " + listToString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            ListNode list1 = buildList(new int[]{});
            ListNode list2 = buildList(new int[]{});

            ListNode result = sol.mergeTwoLists(list1, list2);
            System.out.println("Example 2: " + listToString(result));
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
