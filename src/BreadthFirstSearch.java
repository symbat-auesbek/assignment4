import java.util.*;

public class BreadthFirstSearch<V> implements Search<V> {
    private WeightedGraph<V> graph;

    public BreadthFirstSearch(WeightedGraph<V> graph) {
        this.graph = graph;
    }

    @Override
    public void search(V start) {
        Queue<Vertex<V>> queue = new LinkedList<>();
        Set<V> visited = new HashSet<>();

        Vertex<V> startVertex = graph.getVertexMap().get(start);
        if (startVertex == null) return;

        queue.add(startVertex);
        visited.add(start);

        while (!queue.isEmpty()) {
            Vertex<V> current = queue.poll();
            System.out.print(current.getData() + " ");

            for (Vertex<V> neighbor : current.getAdjacentVertices().keySet()) {
                if (!visited.contains(neighbor.getData())) {
                    visited.add(neighbor.getData());
                    queue.add(neighbor);
                }
            }
        }
    }
}