// Last updated: 1/25/2026, 3:26:18 PM
1class Solution {
2    public String[] findRestaurant(String[] list1, String[] list2) {
3        //first, lets load into hashmap< string, indexSum (list1 i + list2 j)>, can the sum be added when loading the map? 
4        // how to tell if both contain? 
5        //lets do map< string, list>, if list length == 2 = match, list is of both indexes, maybe not the best space
6        Map<String, List<Integer>> stringToIndexList = new HashMap<>();
7        //two for loops for differing list length
8        for(int i = 0; i < list1.length; i++){
9           stringToIndexList.computeIfAbsent(list1[i], k -> new ArrayList<>()).add(i);
10        }
11        for(int i = 0; i < list2.length; i++){
12               stringToIndexList.computeIfAbsent(list2[i], k -> new ArrayList<>()).add(i);
13        }
14        List<String> lowestIndexStrings = new ArrayList<>();
15        int lowestIndex = Integer.MAX_VALUE;
16        for(Map.Entry<String, List<Integer>> entry: stringToIndexList.entrySet()){
17            if(entry.getValue().size() < 2){
18              continue;
19            }
20            int indexSum = entry.getValue().get(0) + entry.getValue().get(1);
21            if(indexSum < lowestIndex){
22                lowestIndexStrings.clear();
23                lowestIndex = indexSum;
24                lowestIndexStrings.add(entry.getKey());
25            }else if(indexSum == lowestIndex){
26                 lowestIndexStrings.add(entry.getKey());
27            }
28        }
29        return lowestIndexStrings.toArray(String[]::new);
30    }
31}