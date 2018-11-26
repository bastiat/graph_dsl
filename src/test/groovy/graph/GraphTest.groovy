package graph

import spock.lang.Specification

import static graph.GraphBuilder.Graph


class GraphTest extends Specification {


    def "should create empty graph builder"() {

        when:
        def graph = Graph()

        then:
        graph != null

    }

    def "should create empty edge builder" () {

        when:
        def edge = Graph().edge()

        then:
        edge != null

    }

    def "should allow to call from to weight" () {
        when:
        def edge = Graph()
                .edge()
                .from("a")
                .to("b")
                .weight(12.3)

        then:
        edge != null
    }

    def "should vertex equal" () {
        given:
        def v1 = new Vertex("a")
        def v2 = new Vertex("a")

        expect:
        v1.equals(v2)
        v1.compareTo(v2) == 0

    }

    def "should build one edge graph" () {
        when:
        def graph = Graph()
                .edge()
                .from("a")
                .to("b")
                .weight(12.3)
        .build()

        then:
        graph != null
        graph.getEdges().size() == 1
        graph.getVertices().size() == 2
        def edge = graph.getEdges().get(0)
        edge.getWeight() == 12.3
        edge.getFromVertex() == new Vertex("a")
        edge.getToVertex() == new Vertex("b")
    }

    def "should build two edge graph" () {
        when:
        def graph = Graph()
                .edge()
                  .from("a")
                  .to("b")
                  .weight(12.3)
                .edge()
                  .from("a")
                  .to("c")
                  .weight(15)
                .build()

        then:
        graph != null
        graph.getEdges().size() == 2
        graph.getVertices().size() == 3
        graph.getEdges().contains(new Edge(new Vertex("a"), new Vertex("b"), 12.3))
        graph.getEdges().contains(new Edge(new Vertex("a"), new Vertex("c"), 15))
        graph.getVertices().containsAll(new Vertex("a"), new Vertex("b"), new Vertex("c"))
        println graph.toString()
    }


}
