package com.example.datastructure.graph;

import java.util.*;


public class DFS {
     public static List<Integer> dfs(IGraph graph, int from) {
         List<Integer> result = new ArrayList<>();
         Set<Integer> visited = new HashSet<>();

         Stack<Integer> stack = new Stack<>();

         stack.push(from);
         visited.add(from);

         while (stack.size() > 0) {
             Integer next = stack.pop();
             result.add(next);

             for (Integer n : graph.getNodes(next)){
                 if (!visited.contains(n)) {
                     stack.push(n);
                     visited.add(n);
                 }
             }
         }
         return result;

     }

}
