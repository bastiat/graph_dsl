package graph;

import java.math.BigDecimal;

public class EdgeBuilder {

    private GraphBuilder graphBuilder;
    private String from;
    private String to;
    private BigDecimal weight;

    EdgeBuilder(GraphBuilder graphBuilder) {
        this.graphBuilder = graphBuilder;
    }

    public EdgeBuilder from(String vertex) {
        this.from = vertex;
        return this;
    }

    public EdgeBuilder to(String vertex) {
        this.to = vertex;
        return this;
    }

    public EdgeBuilder weight(BigDecimal weight) {
        this.weight = weight;
        return this;
    }

    public EdgeBuilder edge() {
        buildEdge();
        return new EdgeBuilder(graphBuilder);
    }

    public Graph build() {
        buildEdge();
        return graphBuilder.build();
    }

    private void buildEdge() {
        graphBuilder.addEdge(new Edge(new Vertex(from), new Vertex(to), weight.doubleValue()));
    }
}
