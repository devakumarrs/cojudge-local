import java.util.*;

class Solution {

    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        Map<String, Set<Integer>> emailToIndex = new HashMap<>();
        for (int i = 0; i < accounts.size(); i++) {
            for (int j = 1; j < accounts.get(i).size(); j++) {
                emailToIndex.computeIfAbsent(accounts.get(i).get(j), k -> new HashSet<>()).add(i);
            }
        }
        boolean[] visited = new boolean[accounts.size()];
        List<List<String>> results = new ArrayList<>();
        for (int i = 0; i < accounts.size(); i++) {
            Set<String> emails = new TreeSet<>();
            if (!visited[i]) {
                dfs(accounts, emailToIndex, visited, emails, i);
                List<String> result = new ArrayList<>(emails);
                result.add(0, accounts.get(i).get(0));
                results.add(result);
            }
        }
        return results;
    }

    private void dfs(List<List<String>> accounts, Map<String, Set<Integer>> emailToIndex, boolean[] visited,
            Set<String> emails, int index) {
        if (visited[index])
            return;
        visited[index] = true;
        for (int i = 1; i < accounts.get(index).size(); i++) {
            String email = accounts.get(index).get(i);
            emails.add(email);
            for (var neiIndex : emailToIndex.get(email)) {
                dfs(accounts, emailToIndex, visited, emails, neiIndex);
            }
        }
    }
}