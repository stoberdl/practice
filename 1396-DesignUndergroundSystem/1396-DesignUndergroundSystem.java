// Last updated: 12/31/2025, 2:57:41 PM
1class UndergroundSystem {
2
3    Map<Integer, CheckData> idToCheckInData = new HashMap<>();
4    Map<String, StationAverages> stationStEndIdToAverage = new HashMap<>();
5
6    private record CheckData(String stationName, int time) {
7    }
8
9    public UndergroundSystem() {
10
11    }
12
13    public void checkIn(int id, String stationName, int time) {
14        idToCheckInData.put(id, new CheckData(stationName, time));
15    }
16
17    public void checkOut(int id, String stationName, int time) {
18        CheckData checkData = idToCheckInData.get(id);//hmm
19        String stationStEndId = stationStEndId(checkData.stationName, stationName);
20        stationStEndIdToAverage
21                .computeIfAbsent(stationStEndId, k -> new StationAverages())
22                .addTrip(time - checkData.time);
23        idToCheckInData.remove(id);
24    }
25
26    public double getAverageTime(String startStation, String endStation) {
27        return stationStEndIdToAverage.get(stationStEndId(startStation, endStation)).getAverage();
28    }
29
30    private String stationStEndId(String startStation, String endStation) {
31        return startStation + ":" + endStation;
32    }
33
34    private static class StationAverages {
35        double totalTime = 0;
36        int tripCount = 0;
37
38        void addTrip(int travelTime) {
39            totalTime += travelTime;
40            tripCount++;
41        }
42
43        double getAverage() {
44            return totalTime / tripCount;
45        }
46    }
47}
48
49/**
50 * Your UndergroundSystem object will be instantiated and called as such:
51 * UndergroundSystem obj = new UndergroundSystem();
52 * obj.checkIn(id,stationName,t);
53 * obj.checkOut(id,stationName,t);
54 * double param_3 = obj.getAverageTime(startStation,endStation);
55 */