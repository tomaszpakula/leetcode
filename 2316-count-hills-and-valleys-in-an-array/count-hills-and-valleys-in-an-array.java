class Solution {
    public int countHillValley(int[] nums) {
        int count = 0;
        
        for(int i = 1; i < nums.length-1; i++){
            int left = i-1;
            int right = i+1;

            while(left > 0 && nums[left]==nums[i]){
                left--;
            }

            while(right < nums.length - 1 && nums[right]==nums[i]){
                right++;
            }
            if( (nums[i] != nums[i-1]) && ((nums[i] > nums[left] && nums[i] > nums[right]) ||  (nums[i] < nums[left] && nums[i] < nums[right]) )){
                count++;
            }
        }
        return count;
    }
}