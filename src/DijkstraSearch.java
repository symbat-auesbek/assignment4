import java.util.*;

public class DijkstraSearch<V> implements Search<V> {
    private WeightedGraph<V> graph;

    public DijkstraSearch(WeightedGraph<V> graph) {
        this.graph = graph;
    }

    @Override
    public void search(V start) {
        Map<V, Double> distances = new HashMap<>();
        PriorityQueue<Vertex<V>> priorityQueue = new PriorityQueue<>();
        Map<V, Vertex<V>> previous = new HashMap<>();

        for (Vertex<V> vertex : graph.getVertexMap().values()) {
            vertex.setDistance(Double.MAX_VALUE); // барлығына шексіздік
            distances.put(vertex.getData(), Double.MAX_VALUE);
            previous.put(vertex.getData(), null);
        }

        Vertex<V> startVertex = graph.getVertexMap().get(start);
        startVertex.setDistance(0.0);
        distances.put(start, 0.0);
        priorityQueue.add(startVertex);

        while (!priorityQueue.isEmpty()) {
            Vertex<V> current = priorityQueue.poll();

            for (Map.Entry<Vertex<V>, Double> entry : current.getAdjacentVertices().entrySet()) {
                Vertex<V> neighbor = entry.getKey();
                double weight = entry.getValue();
                double newDist = distances.get(current.getData()) + weight;

                if (newDist < distances.get(neighbor.getData())) {
                    distances.put(neighbor.getData(), newDist);
                    neighbor.setDistance(newDist); // Жаңарту маңызды!
                    previous.put(neighbor.getData(), current);
                    priorityQueue.add(neighbor);
                }
            }
        }

        // Қысқа жолдарды шығару
        for (Map.Entry<V, Double> entry : distances.entrySet()) {
            System.out.println("Distance from " + start + " to " + entry.getKey() + " is " + entry.getValue());
        }
    }
}