class Solution {
    public int jump(int[] nums) {
        if (nums.length == 1){
            return 0;
        }

        int goal = nums.length - 1;
        int steps = 0;
        int i = 0;

        while (i >= 0 && i < nums.length){
            if (i + nums[i] >= goal){
                steps += 1;
                goal = i;
                if (i!=0){
                    i=0;
                }
                else{
                    i--;
                };
            }
            else{
                i++;
            }

        }

        return steps;

    }
}