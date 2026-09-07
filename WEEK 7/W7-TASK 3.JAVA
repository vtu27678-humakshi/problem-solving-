import java.util.*;

class UndergroundSystem {

    // Stores passenger check-in information
    HashMap<Integer, String> station = new HashMap<>();
    HashMap<Integer, Integer> time = new HashMap<>();

    // Stores total time and number of trips for each route
    HashMap<String, int[]> routes = new HashMap<>();

    public UndergroundSystem() {
    }

    public void checkIn(int id, String stationName, int t) {
        station.put(id, stationName);
        time.put(id, t);
    }

    public void checkOut(int id, String stationName, int t) {

        String start = station.get(id);
        int startTime = time.get(id);

        int travelTime = t - startTime;

        String route = start + "->" + stationName;

        if (!routes.containsKey(route)) {
            routes.put(route, new int[]{0, 0});
        }

        routes.get(route)[0] += travelTime;
        routes.get(route)[1]++;
    }

    public double getAverageTime(String startStation, String endStation) {

        String route = startStation + "->" + endStation;

        int[] data = routes.get(route);

        return (double) data[0] / data[1];
    }
}


INPUT:
["UndergroundSystem",
 "checkIn",
 "checkIn",
 "checkOut",
 "checkOut",
 "getAverageTime"]

Arguments:
[[],
 [1, "A", 3],
 [2, "A", 8],
 [1, "B", 15],
 [2, "B", 18],
 ["A", "B"]]

Travel times:

Passenger 1: 15 - 3 = 12
Passenger 2: 18 - 8 = 10

Average:

(12 + 10) / 2 = 11.0

OUTPUT

[null, null, null, null, null, 11.0]
Easy way to remember
checkIn  → SAVE starting station + time
checkOut → CALCULATE travel time
average  → TOTAL TIME / NUMBER OF TRIPS