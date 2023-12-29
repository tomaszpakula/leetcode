class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> num: map.entrySet()){
            if(num.getValue() > nums.length / 2){
                return num.getKey();
            }
        }
        
        return 0;
    }
}