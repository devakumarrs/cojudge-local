import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            GraphNode node = buildGraph(new int[][]{new int[]{2, 4}, new int[]{1, 3}, new int[]{2, 4}, new int[]{1, 3}});

            GraphNode result = sol.cloneGraph(node);
            System.out.println("Example 1: " + graphToString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            GraphNode node = buildGraph(new int[][]{new int[]{}});

            GraphNode result = sol.cloneGraph(node);
            System.out.println("Example 2: " + graphToString(result));
        }
    }

    private static GraphNode buildGraph(int[][] adjList) {
        if (adjList == null || adjList.length == 0) return null;
        Map<Integer, GraphNode> map = new HashMap<>();
        for (int i = 1; i <= adjList.length; i++) {
            map.put(i, new GraphNode(i));
        }
        for (int i = 0; i < adjList.length; i++) {
            GraphNode curr = map.get(i + 1);
            if (adjList[i] != null) {
                for (int neighborVal : adjList[i]) {
                    curr.neighbors.add(map.get(neighborVal));
                }
            }
        }
        return map.get(1);
    }

    private static String graphToString(GraphNode node) {
        if (node == null) return "[]";
        Map<Integer, GraphNode> visited = new TreeMap<>();
        Queue<GraphNode> queue = new LinkedList<>();
        queue.offer(node);
        visited.put(node.val, node);
        while (!queue.isEmpty()) {
            GraphNode curr = queue.poll();
            for (GraphNode neighbor : curr.neighbors) {
                if (!visited.containsKey(neighbor.val)) {
                    visited.put(neighbor.val, neighbor);
                    queue.offer(neighbor);
                }
            }
        }
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= visited.size(); i++) {
            GraphNode n = visited.get(i);
            List<String> neighbors = new ArrayList<>();
            if (n != null) {
                for (GraphNode nb : n.neighbors) {
                    neighbors.add(String.valueOf(nb.val));
                }
            }
            result.add("[" + String.join(",", neighbors) + "]");
        }
        return "[" + String.join(",", result) + "]";
    }
}

class GraphNode {
    public int val;
    public List<GraphNode> neighbors;
    public GraphNode() {
        val = 0;
        neighbors = new ArrayList<GraphNode>();
    }
    public GraphNode(int _val) {
        val = _val;
        neighbors = new ArrayList<GraphNode>();
    }
    public GraphNode(int _val, List<GraphNode> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
