class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length == 1) return true;
        int minDistance = 1;
        int index = nums.length - 2;

        while(index != 0){
            if(nums[index]>=minDistance){
                minDistance = 1;
            }
            else{
                minDistance += 1;
            }

            index--;
        }

        return minDistance<=nums[0];
    }
}