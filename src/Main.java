public class Main {
    public static void main(String[] args) {
        WeightedGraph<String> graph = new WeightedGraph<>();

        // Adding vertices
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");

        // Adding edges
        graph.addEdge("A", "B", 1);
        graph.addEdge("A", "C", 4);
        graph.addEdge("B", "C", 2);
        graph.addEdge("B", "D", 5);
        graph.addEdge("C", "D", 1);

        // BFS
        System.out.println("BFS starting from A:");
        BreadthFirstSearch<String> bfs = new BreadthFirstSearch<>(graph);
        bfs.search("A");

        // Dijkstra's
        System.out.println("\nDijkstra's starting from A:");
        DijkstraSearch<String> dijkstra = new DijkstraSearch<>(graph);
        dijkstra.search("A");
    }
}