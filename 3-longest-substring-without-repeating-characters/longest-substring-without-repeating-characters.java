class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        Set<Character> set = new HashSet<>();
        int left = 0;
        int right = 1;
        int max = 1;
        set.add(s.charAt(left));

        while(right < s.length()){
            if(set.contains(s.charAt(right))){
              set.remove(s.charAt(left));
              left++;
            }
            else{
                set.add(s.charAt(right));
                max = Math.max(max, right-left+1);
                right++;
            }
        }

        return max;
    }
}