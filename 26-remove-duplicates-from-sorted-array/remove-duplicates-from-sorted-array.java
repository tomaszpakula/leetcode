class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums[0];
        int k = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > n){
                nums[k] = nums[i];
                n = nums[k];
                k+=1;
            }
        }
        return k;
    }
}