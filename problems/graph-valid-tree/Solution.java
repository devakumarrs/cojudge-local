import java.util.*;

class Solution {
    private class DisjointSet {
        int n;
        int[] size;
        int[] parent;

        public DisjointSet(int n) {
            this.n = n;
            size = new int[n + 1];
            Arrays.fill(size, 1);
            parent = new int[n + 1];
            for (int i = 0; i <= n; i++) {
                parent[i] = i;
            }
        }

        public int getUltimateParent(int node) {
            if (parent[node] == node) {
                return node;
            }
            return parent[node] = getUltimateParent(parent[node]);
        }

        public boolean isConnected(int n1, int n2) {
            return getUltimateParent(n1) == getUltimateParent(n2);
        }

        public void unionBySize(int n1, int n2) {
            if (isConnected(n1, n2)) {
                return;
            }
            var u1 = getUltimateParent(n1);
            var u2 = getUltimateParent(n2);
            if (size[u1] > size[u2]) {
                size[u1] += size[u2];
                parent[u2] = u1;
            } else {
                size[u2] += size[u1];
                parent[u1] = u2;
            }
            n--;
        }
    }

    public boolean validTree(int n, int[][] edges) {
        if (edges.length + 1 != n) {
            return false;
        }
        DisjointSet ds = new DisjointSet(n);
        for (int[] edge : edges) {
            if (ds.isConnected(edge[0], edge[1])) {
                return false;
            }
            ds.unionBySize(edge[0], edge[1]);
        }
        return ds.n == 1;
    }
}