class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int tempCount = 0;
        for(int num: nums){
            tempCount = map.getOrDefault(num,0)+1;
            map.put(num, tempCount);

            if(tempCount > nums.length/2){
                return num;
            }
        }
        return 0;
    }
}