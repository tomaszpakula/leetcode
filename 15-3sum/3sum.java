class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> s = new HashSet<>();
        Arrays.sort(nums);

        int left;
        int right;
        int sum;

        for (int x = 0; x < nums.length - 2; x++) {
            left = x + 1;
            right = nums.length - 1;
            while (left < right) {
                sum = nums[x] + nums[left] + nums[right];
                if (sum == 0) {
                    s.add(Arrays.asList(nums[x], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }

        }
        return new ArrayList<>(s);
    }
}