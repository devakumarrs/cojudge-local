import java.util.*;

class Solution {
    private class DisjointSet {
        int n;
        int[] size;
        int[] parent;

        public DisjointSet(int n) {
            this.n = n;
            parent = new int[n];
            size = new int[n];
            Arrays.fill(size, 1);
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        int fup(int node) {
            if (node == parent[node]) {
                return node;
            }
            parent[node] = fup(parent[node]);
            return parent[node];
        }

        void ubs(int n1, int n2) {
            int u1 = fup(n1);
            int u2 = fup(n2);
            if (u1 == u2)
                return;
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

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        DisjointSet ds = new DisjointSet(n);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isConnected[i][j] == 1) {
                    ds.ubs(i, j);
                }
            }
        }
        return ds.n;
    }
}