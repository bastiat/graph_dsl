package graph;

import java.util.Objects;

import static com.google.common.base.Preconditions.checkNotNull;

public class Vertex implements Comparable<Vertex> {
    private final String label;

    public Vertex(String label) {
        checkNotNull(label);
        this.label = label.toUpperCase();
    }

    public int compareTo(Vertex o) {
        return (this.getLabel().compareTo(o.getLabel()));
    }

    public String getLabel() {
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertex vertex = (Vertex) o;
        return Objects.equals(label, vertex.label);
    }

    @Override
    public int hashCode() {

        return Objects.hash(label);
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "label='" + label + '\'' +
                '}';
    }
}