import java.util.*;

class Solution {
    public int[][] runTwitter(String[] operations, int[][] args) {
        List<int[]> results = new ArrayList<>();
        Map<Integer, List<int[]>> userToTweets = new HashMap<>();
        Map<Integer, Set<Integer>> userToFollowers = new HashMap<>();
        for (int i = 1; i < operations.length; i++) {
            String op = operations[i];
            int[] arg = args[i];
            if (op.equals("postTweet")) {
                userToTweets.computeIfAbsent(arg[0], k -> new ArrayList<>())
                        .add(new int[] {arg[1], i});
            } else if (op.equals("follow")) {
                userToFollowers.computeIfAbsent(arg[0], k -> new HashSet<>()).add(arg[1]);
            } else if (op.equals("unfollow")) {
                userToFollowers.computeIfAbsent(arg[0], k -> new HashSet<>()).remove(arg[1]);
            } else {
                userToFollowers.computeIfAbsent(arg[0], k -> new HashSet<>()).add(arg[0]);
                Set<Integer> following = userToFollowers.getOrDefault(arg[0], new HashSet<>());
                Queue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
                for (int f : following) {
                    var tweets = userToTweets.getOrDefault(f, new ArrayList<>());
                    for (int[] tweet : tweets) {
                        if (pq.size() < 10) {
                            pq.offer(tweet);
                        } else if (pq.peek()[1] < tweet[1]) {
                            pq.poll();
                            pq.offer(tweet);
                        }
                    }
                }
                int[] result = new int[pq.size()];
                int j = pq.size() - 1;
                while (!pq.isEmpty()) {
                    result[j] = pq.poll()[0];
                    j--;
                }
                results.add(result);
            }
        }
        return results.toArray(new int[0][]);
    }
}
