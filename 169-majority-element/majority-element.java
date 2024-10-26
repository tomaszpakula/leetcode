class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length == 1) return nums[0];
        int max = 0;
        int maxCount = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num: nums){
            map.put(num, map.getOrDefault(num,0)+1);
            if(map.get(num) > maxCount){
                max = num;
                maxCount = map.get(num);
            }
        }

        return max;
    }
}