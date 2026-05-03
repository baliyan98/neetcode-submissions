class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // convert it into an arrayList of integer

        Map<Integer, Long> map = Arrays.stream(nums).boxed().collect(
            Collectors.groupingBy(n -> n, Collectors.counting()));

        List<Map.Entry<Integer, Long>> updatedList = new ArrayList<>(map.entrySet());

        updatedList.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = updatedList.get(i).getKey();
        }

        return result;
    }
}
