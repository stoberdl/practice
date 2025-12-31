// Last updated: 12/31/2025, 2:33:12 PM
1class UndergroundSystem {
2
3    Map<Integer, CheckData> idToCheckInData = new HashMap<>();
4    Map<String, StationAverages> stationStEndIdToAverage = new HashMap<>();
5
6    private record CheckData(String stationName, int time) {
7    }
8
9    //ideally i should call the map for a check in station and get a list of id and times? or map<station check in, map<id, time>
10    public UndergroundSystem() {
11
12    }
13
14    public void checkIn(int id, String stationName, int time) {
15        idToCheckInData.put(id, new CheckData(stationName, time));
16    }
17
18    public void checkOut(int id, String stationName, int time) {
19        CheckData checkData = idToCheckInData.get(id);//hmm
20        String stationStEndId = stationStEndId(checkData.stationName, stationName);
21        StationAverages stationAverages = stationStEndIdToAverage
22                .getOrDefault(stationStEndId, new StationAverages());
23        stationAverages.addTrip(time - checkData.time);
24        stationStEndIdToAverage.put(stationStEndId, stationAverages);
25        idToCheckInData.remove(id);
26    }
27
28    public double getAverageTime(String startStation, String endStation) {
29        // search map of start station check ins, get station, and list/map of id plus time
30        //iterate through second checkout map(identical) getting id calcing time, so probably map of maps
31        //make list of time calc's, no map of station to time calcs list in class?
32        //add to list, sum all 
33        return stationStEndIdToAverage.get(stationStEndId(startStation, endStation)).getAverage();//hmm
34    }
35
36    private String stationStEndId(String startStation, String endStation) {
37        return startStation + ":" + endStation;
38    }
39
40    private static class StationAverages {
41        double totalTime = 0;
42        int tripCount = 0;
43
44        void addTrip(int travelTime) {
45            totalTime += travelTime;
46            tripCount++;
47        }
48
49        double getAverage() {
50            return totalTime / tripCount;
51        }
52    }
53}
54
55/**
56 * Your UndergroundSystem object will be instantiated and called as such:
57 * UndergroundSystem obj = new UndergroundSystem();
58 * obj.checkIn(id,stationName,t);
59 * obj.checkOut(id,stationName,t);
60 * double param_3 = obj.getAverageTime(startStation,endStation);
61 */