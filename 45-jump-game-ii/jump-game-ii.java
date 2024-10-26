class Solution {
    public int jump(int[] nums) {
       if (nums.length == 1) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, nums.length-1);
        int n = nums.length - 2;
        int key;
        int tempDist = 0;

        while(n>=0){
            for(Map.Entry<Integer, Integer> dist: map.entrySet()){
                key= dist.getKey();
                if(map.get(key)-n <= nums[n]){
                    map.put(key+1, n);
                    tempDist=key+1;
                    break;
                }
            }
            n--;
        }
        return tempDist;
    }
}