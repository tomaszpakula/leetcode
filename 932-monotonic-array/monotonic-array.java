class Solution {
    public boolean isMonotonic(int[] nums) {
        String type = "undefined" ;
        for(int i = 1; i<nums.length; i++){
            if(type == "undefined" && nums[i-1]>nums[i]){
                type = "decreasing";
            }
            else if(type == "undefined" && nums[i-1] < nums[i]){
                type = "increasing";
            }
            else if( (type == "increasing" && nums[i-1]>nums[i]) || (type == "decreasing" && nums[i-1]<nums[i]) ){
                return false;
            }
        }
        return true;
    }
}