// Last updated: 12/31/2025, 3:02:26 PM
1class UndergroundSystem {
2
3    Map<Integer, CheckData> idToCheckInData = new HashMap<>();
4    Map<String, StationAverages> stationStEndIdToAverage = new HashMap<>();
5
6    private record CheckData(String stationName, int time) {
7    }
8    public UndergroundSystem() {
9
10    }
11
12    public void checkIn(int id, String stationName, int time) {
13        idToCheckInData.put(id, new CheckData(stationName, time));
14    }
15
16    public void checkOut(int id, String stationName, int time) {
17        CheckData checkData = idToCheckInData.get(id);//hmm
18        String stationStEndId = stationStEndId(checkData.stationName, stationName);
19        StationAverages stationAverages = stationStEndIdToAverage
20                .getOrDefault(stationStEndId, new StationAverages());
21        stationAverages.addTrip(time - checkData.time);
22        stationStEndIdToAverage.put(stationStEndId, stationAverages);
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