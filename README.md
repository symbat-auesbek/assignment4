# Weighted Graph Implementation in Java

This project implements a weighted graph using a vertex-based approach in Java. It includes classes for vertices, the graph itself, and algorithms for searching the graph, specifically Breadth-First Search (BFS) and Dijkstra's algorithm for finding the shortest paths.

## Classes

### Vertex<V>
- Represents a vertex in the graph.
- Contains:
  - data: The value stored in the vertex.
  - adjacentVertices: A map of adjacent vertices and their corresponding edge weights.
- Methods:
  - addAdjacentVertex(Vertex<V> destination, double weight): Adds an adjacent vertex with a specified weight.

### WeightedGraph<V>
- Represents the weighted graph.
- Contains:
  - vertexMap: A map of vertices in the graph.
- Methods:
  - addVertex(V data): Adds a vertex to the graph.
  - addEdge(V source, V destination, double weight): Adds a directed edge between two vertices with a specified weight.

### Search<V>
- An interface for search algorithms in the graph.
- Method:
  - search(V start): Searches the graph starting from the specified vertex.

### BreadthFirstSearch<V>
- Implements the BFS algorithm.
- Constructor:
  - BreadthFirstSearch(WeightedGraph<V> graph): Initializes with a graph.
- Method:
  - search(V start): Performs BFS starting from the specified vertex and prints the order of visited vertices.

### DijkstraSearch<V>
- Implements Dijkstra's algorithm for finding the shortest paths.
- Constructor:
  - DijkstraSearch(WeightedGraph<V> graph): Initializes with a graph.
- Method:
  - search(V start): Performs Dijkstra's algorithm starting from the specified vertex and prints the shortest distances to all vertices.

### Main
- Contains the main method to demonstrate the functionality of the graph implementation.
- Example usage includes adding vertices and edges, and performing BFS and Dijkstra's search.

## Conclusion
This implementation provides a clear and efficient way to represent and manipulate weighted graphs in Java, with the ability to perform common graph search algorithms.
