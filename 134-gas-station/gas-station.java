class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = cost.length;
        int distance = 0;
        int i = 0;
        int start = 0;
        int tank = 0;

        while (distance < cost.length && start < n ) {
            tank += (gas[i%n] - cost[i%n]);
            i++;
            if (tank < 0) {
                start = i;
                tank = 0;
                distance = 0;
            } else {
                distance += 1;
            }

        }
        return distance == n ? start : -1;
    }
}