// Last updated: 12/31/2025, 3:01:29 PM
1class UndergroundSystem {
2
3    Map<Integer, CheckInData> idToCheckInData = new HashMap<>();
4    Map<String, StationAverages> stationStEndIdToAverage = new HashMap<>();
5
6    private record CheckInData(String stationName, int time) {
7    }
8
9    public UndergroundSystem() {
10
11    }
12
13    public void checkIn(int id, String stationName, int time) {
14        idToCheckInData.put(id, new CheckInData(stationName, time));
15    }
16
17    public void checkOut(int id, String stationName, int time) {
18        CheckInData checkData = idToCheckInData.get(id);//hmm
19         String stationStEndId = stationStEndId(checkData.stationName, stationName);
20        StationAverages stationAverages = stationStEndIdToAverage
21                .getOrDefault(stationStEndId, new StationAverages());
22        stationAverages.addTrip(time - checkData.time);
23        stationStEndIdToAverage.put(stationStEndId,stationAverages);
24        idToCheckInData.remove(id);
25    }
26
27    public double getAverageTime(String startStation, String endStation) {
28        return stationStEndIdToAverage.get(stationStEndId(startStation, endStation)).getAverage();
29    }
30
31    private String stationStEndId(String startStation, String endStation) {
32        return startStation + ":" + endStation;
33    }
34
35    private static class StationAverages {
36        double totalTime = 0;
37        int tripCount = 0;
38
39        void addTrip(int travelTime) {
40            totalTime += travelTime;
41            tripCount++;
42        }
43
44        double getAverage() {
45            return totalTime / tripCount;
46        }
47    }
48}