import java.util.HashMap;
import java.util.Map;

public class WeightedGraph<V> {
    private Map<V, Vertex<V>> vertexMap;

    public WeightedGraph() {
        vertexMap = new HashMap<>();
    }

    public void addVertex(V data) {
        vertexMap.put(data, new Vertex<>(data));
    }

    public void addEdge(V source, V destination, double weight) {
        Vertex<V> srcVertex = vertexMap.get(source);
        Vertex<V> destVertex = vertexMap.get(destination);
        if (srcVertex != null && destVertex != null) {
            srcVertex.addAdjacentVertex(destVertex, weight);
        }
    }

    public Map<V, Vertex<V>> getVertexMap() {
        return vertexMap;
    }
}