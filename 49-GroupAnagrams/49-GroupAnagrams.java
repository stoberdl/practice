// Last updated: 12/17/2025, 3:11:55 PM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        return new ArrayList<>(
4                Arrays.stream(strs)
5                        .collect(
6                                Collectors.groupingBy(str -> {
7                                    HashMap<Character, Integer> charToCountMap = new HashMap<>();
8                                    for (int i = 0; i < str.length(); i++) {
9                                        charToCountMap.put(str.charAt(i),
10                                                charToCountMap.getOrDefault(str.charAt(i), 0) + 1);
11                                    }
12                                    return charToCountMap;
13                                }))
14                        .values());
15    }
16}