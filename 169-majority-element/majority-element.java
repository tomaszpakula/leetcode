class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length == 1) return nums[0];
        int max = 0;
        int tempCount = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num: nums){
            tempCount = map.getOrDefault(num,0)+1;
            map.put(num, tempCount);
            if(tempCount > map.getOrDefault(max,0)){
                max = num;
            }
        }

        return max;
    }
}