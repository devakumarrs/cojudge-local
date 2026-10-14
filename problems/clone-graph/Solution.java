/*
// Definition for a GraphNode.
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
};
*/

import java.util.*;

// DFS

// class Solution {
//     private Map<GraphNode, GraphNode> map = new HashMap<>();

//     public GraphNode cloneGraph(GraphNode node) {
//         if (node == null)
//             return null;
//         if (map.containsKey(node)) {
//             return map.get(node);
//         }
//         GraphNode clonedNode = new GraphNode(node.val);
//         map.put(node, clonedNode);
//         for (GraphNode neighbor : node.neighbors) {
//             clonedNode.neighbors.add(cloneGraph(neighbor));
//         }
//         return clonedNode;
//     }
// }

// BFS

class Solution {

    private Map<GraphNode, GraphNode> map = new HashMap<>();

    public GraphNode cloneGraph(GraphNode node) {
        if (node == null)
            return null;
        Deque<GraphNode> dq = new ArrayDeque<>();
        dq.offer(node);
        while (!dq.isEmpty()) {
            GraphNode current = dq.poll();
            if (!map.containsKey(current)) {
                map.put(current, new GraphNode(current.val));
            }
            for (var neighbor : current.neighbors) {
                if (!map.containsKey(neighbor)) {
                    dq.offer(neighbor);
                    map.put(neighbor, new GraphNode(neighbor.val));
                }
                map.get(current).neighbors.add(map.get(neighbor));
            }
        }
        return map.get(node);
    }
}
