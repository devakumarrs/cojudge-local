import java.util.*;

class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>(numCourses);
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] pre : prerequisites) {
            adj.get(pre[1]).add(pre[0]);
        }
        Deque<Integer> dq = new ArrayDeque<>();
        byte[] visited = new byte[numCourses];
        // 0 - unvisited, 1 - visiting, 2 - visited
        for (int i = 0; i < numCourses; i++) {
            if (visited[i] == 0 && hasCycle(i, dq, visited, adj)) {
                return new int[0];
            }
        }
        int[] result = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            result[i] = dq.pop();
        }
        return result;
    }

    private boolean hasCycle(int node, Deque<Integer> dq, byte[] visited, List<List<Integer>> adj) {
        // 0 - unvisited, 1 - visiting, 2 - visited
        visited[node] = 1;
        for (int nei : adj.get(node)) {
            if (visited[nei] == 1) {
                return true;
            }
            if (visited[nei] == 0 && hasCycle(nei, dq, visited, adj)) {
                return true;
            }
        }
        dq.push(node);
        visited[node] = 2;
        return false;
    }
}
