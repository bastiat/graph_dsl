package graph;


import java.util.Objects;

import static com.google.common.base.Preconditions.checkNotNull;

public class Edge {
    private final Vertex fromVertex;
    private final Vertex toVertex;
    private final Double weight;

    public Edge(Vertex fromVertex, Vertex toVertex, Double weight) {
        checkNotNull(fromVertex);
        checkNotNull(toVertex);
        checkNotNull(weight);
        this.fromVertex = fromVertex;
        this.toVertex = toVertex;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return fromVertex.getLabel() + " to " +
                toVertex.getLabel() + " with weight " +
                getWeight();
    }

    public Vertex getFromVertex() {
        return fromVertex;
    }

    public Vertex getToVertex() {
        return toVertex;
    }

    public Double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edge edge = (Edge) o;
        return Objects.equals(fromVertex, edge.fromVertex) &&
                Objects.equals(toVertex, edge.toVertex) &&
                Objects.equals(weight, edge.weight);
    }

    @Override
    public int hashCode() {

        return Objects.hash(fromVertex, toVertex, weight);
    }


}
