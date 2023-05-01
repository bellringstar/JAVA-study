package com.example.datastructure.graph;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface IGraph {
    void add(int from, int to);
    void add(int from, int to, Integer distance);
    Integer getDistance(int from, int to);
    Map<Integer, Integer> getIndegrees();
    Set<Integer> getVertexes();
    List<Integer> getNodes(int vertex);
}
