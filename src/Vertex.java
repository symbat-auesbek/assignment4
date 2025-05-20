import java.util.HashMap;
import java.util.Map;

public class Vertex<V> implements Comparable<Vertex<V>> {
    private V data;
    private Map<Vertex<V>, Double> adjacentVertices;
    private double distance = Double.MAX_VALUE; // Dijkstra үшін

    public Vertex(V data) {
        this.data = data;
        this.adjacentVertices = new HashMap<>();
    }

    public V getData() {
        return data;
    }

    public Map<Vertex<V>, Double> getAdjacentVertices() {
        return adjacentVertices;
    }

    public void addAdjacentVertex(Vertex<V> destination, double weight) {
        adjacentVertices.put(destination, weight);
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public int compareTo(Vertex<V> other) {
        return Double.compare(this.distance, other.distance);
    }
}