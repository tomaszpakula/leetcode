class Solution {
    public int rob(int[] nums) {
        int rob1 = 0;
        int rob2 = 0;
        int temp;

        for(int n: nums){
            temp = rob2;
            rob2 = Math.max(rob2, rob1 + n);
            rob1 = temp;    
        }

        return rob2;

    }
}