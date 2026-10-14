import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0)
            return intervals;
        List<int[]> result = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        var newInterval = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] > newInterval[1]) {
                result.add(newInterval);
                newInterval = intervals[i];
            } else {
                newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            }
        }
        result.add(newInterval);
        return result.toArray(new int[0][]);
    }
}