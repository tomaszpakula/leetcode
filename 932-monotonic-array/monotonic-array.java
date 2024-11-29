class Solution {
    public boolean isMonotonic(int[] nums) {
        int type = 0 ;
        for(int i = 1; i<nums.length; i++){
            if(type == 0 && nums[i-1]>nums[i]){
                type = -1;
            }
            else if(type == 0 && nums[i-1] < nums[i]){
                type = 1;
            }
            else if( (type == 1 && nums[i-1]>nums[i]) || (type == -1 && nums[i-1]<nums[i]) ){
                return false;
            }
        }
        return true;
    }
}