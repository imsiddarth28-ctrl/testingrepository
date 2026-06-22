import java.util.*;

public class DFS {

    public static void dfs(int node, List<List<Integer>> graph, boolean[] visited) {
        visited[node] " ");

        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, graph, visited);
            }
        }
    }
}