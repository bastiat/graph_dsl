package graph;

import java.util.List;
import java.util.Set;

public class Graph {

    private final List<Edge> edges;
    private final Set<Vertex> vertices;

    public Graph(List<Edge>edges, Set<Vertex> vertices) {
        this.edges = edges;
        this.vertices = vertices;
    }

    public static GraphBuilder Graph() {

        return new GraphBuilder();
    }

    public void addEdge(Edge edge){
        getEdges().add(edge);
    }

    public void addVertice(Vertex v){
        getVertices().add(v);
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public Set<Vertex> getVertices() {
        return vertices;
    }

    public static void printGraph(Graph g){
        System.out.println("Vertices...");
        for (Vertex v : g.getVertices()) {
            System.out.print(v.getLabel() + " ");
        }
        System.out.println("");
        System.out.println("Edges...");
        for (Edge e : g.getEdges()) {
            System.out.println(e);
        }
    }

    @Override
    public String toString() {
        return "Graph{\n" +
                " edges=" + edges +
                ",\n vertices=" + vertices +
                "\n}";
    }
}