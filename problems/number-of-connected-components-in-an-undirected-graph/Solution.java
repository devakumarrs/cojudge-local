import java.util.*;

class Solution {
    private class DisjointSet {
        int components;
        int[] size;
        int[] parent;

        public DisjointSet(int n) {
            this.components = n;
            size = new int[n];
            parent = new int[n];
            Arrays.fill(size, 1);
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        public int findUltimateParent(int node) {
            if (node == parent[node])
                return node;
            return parent[node] = findUltimateParent(parent[node]);
        }

        public boolean unionBySize(int n1, int n2) {
            int up1 = findUltimateParent(n1);
            int up2 = findUltimateParent(n2);
            if (up1 == up2)
                return false;
            if (size[up1] > size[up2]) {
                int temp = up1;
                up1 = up2;
                up2 = temp;
            }
            size[up1] += size[up2];
            parent[up2] = up1;
            components--;
            return true;
        }
    };

    public int countComponents(int n, int[][] edges) {
        DisjointSet ds = new DisjointSet(n);
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            ds.unionBySize(u, v);
        }
        return ds.components;
    }
}
