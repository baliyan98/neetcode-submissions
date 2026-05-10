class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] preProduct = new int[len];
        int[] postProduct = new int[len];
        int[] result = new int[len];
        preProduct[0] = nums[0];
        postProduct[len - 1] = nums[len - 1];
        for (int i = 1; i < len - 1; i++) {
            preProduct[i] = nums[i] * preProduct[i - 1];
        }
        for (int i = len - 2; i >= 0; i--) {
            postProduct[i] = nums[i] * postProduct[i + 1];
        }
        result[0] = postProduct[1];
        result[len - 1] = preProduct[len - 2];
        for (int i = 1; i < len - 1; i++) {
            result[i] = preProduct[i - 1] * postProduct[i + 1];
        }
        return result;
    }
}
