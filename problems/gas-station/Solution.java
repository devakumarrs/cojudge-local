class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int globalBalance = 0, localBalance = 0, startIndex = 0;
        for (int i = 0; i < gas.length; i++) {
            int currentBalance = gas[i] - cost[i];
            globalBalance += currentBalance;
            localBalance += currentBalance;
            if (localBalance < 0) {
                localBalance = 0;
                startIndex = i + 1;
            }
        }
        return globalBalance < 0 ? -1 : startIndex % gas.length;
    }
}