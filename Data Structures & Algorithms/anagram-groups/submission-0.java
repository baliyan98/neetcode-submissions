class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // n^2 via two loop

        // sort each words in the given string array
        // create a hashmap where key would be sorted word and values would be actual strings
        // return the values from the hashmap
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            String currentWord = strs[i];
            String sortedWord = getSortedWord(currentWord);
            if (map.containsKey(sortedWord)) {
                List<String> currentList = map.get(sortedWord);
                currentList.add(currentWord);
            } else {
                List<String> newList = new ArrayList<>();
                newList.add(currentWord);
                map.put(sortedWord, newList);
            }
        }
        for (List<String> value : map.values()) {
            result.add(new ArrayList(value));
        }
        return result;
    }

    public String getSortedWord(String word) {
        return Stream.of(word.split("")).sorted().collect(Collectors.joining());
    }
}
