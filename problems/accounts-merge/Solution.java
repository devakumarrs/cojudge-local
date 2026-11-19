import java.util.*;

class Solution {
    private class DisjointSet {
        int n;
        int[] parent;
        int[] size;

        public DisjointSet(List<List<String>> accounts) {
            n = accounts.size();
            parent = new int[n];
            size = new int[n];
            for (int i = 0; i < accounts.size(); i++) {
                parent[i] = i;
                size[i] = accounts.get(i).size() - 1;
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
            if (size[u1] >= size[u2]) {
                size[u1] += size[u2];
                parent[u2] = u1;
            } else {
                size[u2] += size[u1];
                parent[u1] = u2;
            }
        }
    };

    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        DisjointSet ds = new DisjointSet(accounts);
        Map<String, Integer> emailToIndex = new HashMap<>();
        for (int i = 0; i < accounts.size(); i++) {
            for (int j = 1; j < accounts.get(i).size(); j++) {
                String email = accounts.get(i).get(j);
                if (emailToIndex.containsKey(email)) {
                    ds.ubs(i, emailToIndex.get(email));
                } else {
                    emailToIndex.put(email, i);
                }
            }
        }
        Map<Integer, List<Integer>> upMap = new HashMap<>();
        for (int i = 0; i < accounts.size(); i++) {
            int up = ds.fup(i);
            upMap.computeIfAbsent(up, k -> new ArrayList<>()).add(i);
        }
        List<List<String>> result = new ArrayList<>();
        for (var entry : upMap.entrySet()) {
            var emails = new TreeSet<String>();
            for (int index : entry.getValue()) {
                for (int i = 1; i < accounts.get(index).size(); i++) {
                    emails.add(accounts.get(index).get(i));
                }
            }
            var list = new ArrayList<>(emails);
            list.add(0, accounts.get(entry.getKey()).get(0));
            result.add(list);
        }
        return result;
    }
}