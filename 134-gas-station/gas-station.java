class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sumGas = 0;
        int sumCost = 0;
        int total = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            sumGas += gas[i];
            sumCost += cost[i];
            total += (gas[i] - cost[i]);
            if(total < 0){
                start = i+1;
                total = 0;
            }
        }
        return sumGas >= sumCost ? start : -1;
    }
}