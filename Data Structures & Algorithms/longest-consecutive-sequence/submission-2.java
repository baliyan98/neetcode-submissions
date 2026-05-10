class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        if (nums.length == 0) {
            return 0;
        }
        int currentCount = 1;
        int maxCount = 1;
        System.out.println(set);
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i] - 1)) {
                int currentNum = nums[i] + 1;
                while (set.contains(currentNum)) {
                    currentCount++;
                    maxCount = Math.max(maxCount, currentCount);
                    currentNum++;
                }
            }
            currentCount = 1;
        }
        return maxCount;
    }
}
