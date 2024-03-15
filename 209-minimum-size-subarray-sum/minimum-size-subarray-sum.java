class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minimum = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        int sum = nums[0];

        while (left <= right) {
            while (sum < target && right < nums.length - 1) {
                right++;
                sum += nums[right];
            }
            if (sum >= target) minimum = Math.min(right - left + 1, minimum);
            sum -= nums[left];
            left++;
        }


        return minimum > target ? 0 : minimum;
    }
}