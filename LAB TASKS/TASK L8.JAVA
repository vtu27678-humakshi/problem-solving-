import java.util.*;

class Main {

    static int dijkstra(int[][] graph, int source, int destination) {

        int n = graph.length;
        int[] dist = new int[n];
        boolean[] visited = new boolean[n];

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;

        for (int i = 0; i < n; i++) {

            int u = -1;

            for (int j = 0; j < n; j++) {
                if (!visited[j] &&
                    (u == -1 || dist[j] < dist[u])) {
                    u = j;
                }
            }

            visited[u] = true;

            for (int v = 0; v < n; v++) {

                if (graph[u][v] > 0 &&
                    dist[u] != Integer.MAX_VALUE &&
                    dist[u] + graph[u][v] < dist[v]) {

                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        return dist[destination];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] graph = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j] = sc.nextInt();
            }
        }

        int source = sc.nextInt();
        int destination = sc.nextInt();

        int result = dijkstra(graph, source, destination);

        System.out.println("Shortest Distance: " + result);

        sc.close();
    }
}

INPUT
4
0 10 15 0
10 0 5 20
15 5 0 10
0 20 10 0
0 3

OUTPUT
Shortest Distance: 20

CONCEPT
Start
  ↓
Find nearest location
  ↓
Update distances
  ↓
Repeat
  ↓
Reach destination
  ↓
Shortest distance