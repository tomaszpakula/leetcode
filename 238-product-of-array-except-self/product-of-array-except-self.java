class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] product = new int[nums.length];
        int temporaryProduct = 1;

        for (int i = 0; i < nums.length; i++) {
            product[i] = temporaryProduct;
            temporaryProduct *= nums[i];
        }
        temporaryProduct = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            product[i] *= temporaryProduct;
            temporaryProduct *= nums[i];
        }

        return product;
    }
}