// Last updated: 1/26/2026, 4:55:57 PM
1class Solution {
2    public int canCompleteCircuit(int[] gas, int[] cost) {
3        //if gas >= 0 when getting to final station good, optherwise fail
4        //if starting station gas < cost = no go start,
5        //
6        // int startIndex = -1;
7        // int maxGas =0;
8        // int minCost = Integer.MAX_VALUE;
9        // for(int i = 0; i < gas.length(); i++){
10        //     if(gas[i] >= maxGas && cost[i] <= minCost){//flawed
11        //         maxGas = gas[i];
12        //         minCost = cost[i];
13        //         startIndex = i;
14        //     }
15        // }
16        int index = 0;
17        int gasTank = -1;
18        int stationCount = 0;
19        for (int i = 0; i < gas.length; i++) {
20            if (gas[i] < cost[i] || gas[i] == 0) {
21                continue;
22            } else if (gas[i] == cost[i]) {
23                stationCount++;
24                if (stationCount == gas.length)
25                    return 0;
26                continue;
27            }
28            gasTank = gas[i];
29            index = i;
30            stationCount = 0;//1?
31            while (gasTank >= 0) {
32                gasTank -= cost[index];
33                if (gasTank < 0) {
34                    continue;
35                }
36                if (index + 1 == gas.length) {
37                    index = 0;
38                } else {
39                    index++;
40                }
41                gasTank += gas[index];
42                stationCount++;
43                if (stationCount == gas.length) {
44                    return index;
45                }
46            }
47
48        }
49        return -1;
50    }
51}