// Last updated: 12/18/2025, 12:48:47 PM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3            //for each loop through strs , sorted, add to hashmap of sorted string to list of original strings?, go through hasmap and construct list of the lists to return
4            HashMap<String, List<String>> sortedToOrigStringList = new HashMap<>();
5            for(String str: strs){
6                char[] strChars = str.toCharArray(); 
7                Arrays.sort(strChars);
8                String key = new String(strChars);
9                List<String> strList = sortedToOrigStringList.getOrDefault(key, new ArrayList<>());
10                strList.add(str);
11                sortedToOrigStringList.put(key, strList);
12            }
13            List<List<String>> groupedAnagrams = new ArrayList<>();
14            for(List<String> groupedStrs:  sortedToOrigStringList.values()){
15                groupedAnagrams.add(groupedStrs);
16            }
17            return groupedAnagrams;
18    }
19}