package graph;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GraphBuilder {


    private final List<Edge> edges = new ArrayList<>();
    private final Set<Vertex> vertices = new HashSet<>();

    GraphBuilder() {

    }

    public static GraphBuilder Graph() {
        return new GraphBuilder();
    }

    public EdgeBuilder edge() {
        return new EdgeBuilder(this);
    }

    public Graph build() {
        return new Graph(ImmutableList.copyOf(edges), ImmutableSet.copyOf(vertices));
    }

    public void addEdge(Edge edge) {
        edges.add(edge);
        vertices.add(edge.getFromVertex());
        vertices.add(edge.getToVertex());
    }
}
