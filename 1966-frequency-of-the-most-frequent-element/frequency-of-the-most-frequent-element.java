class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        long total = 0;
        int frequency = 0;
        int l = 0;
        int r = 0;

        while (r < nums.length) {
            total += nums[r];
            while ((long) nums[r] * (r - l + 1) > total + k) {
                total -= nums[l];
                l++;
            }

            frequency = Math.max(frequency, r - l + 1);
            r += 1;
        }


        return frequency;
    }
}