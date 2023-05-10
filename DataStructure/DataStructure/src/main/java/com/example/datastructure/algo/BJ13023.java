package com.example.datastructure.algo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BJ13023 {
    static boolean found = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int N = Integer.valueOf(s.split(" ")[0]);
        int M = Integer.valueOf(s.split(" ")[1]);

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i< N; i++){
            graph.add(i, new ArrayList<>());
        }

        for (int i = 0; i < M; i++){
            s = scanner.nextLine();

            int a = Integer.valueOf(s.split(" ")[0]);
            int b = Integer.valueOf(s.split(" ")[1]);

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        boolean[] visited = new boolean[N];
        for (int i = 0; i < N; i++){
            dfs(graph, visited, i, 1);
        }
    }

    static void dfs(List<List<Integer>> graph, boolean[] visited, int v, int depth){
        if (depth == 5){
            found = true;
            return;
        }

        visited[v] = true;

        for (int vertex : graph.get(v)){
            if (!visited[vertex]){
                dfs(graph, visited, vertex, depth+1);
            }
        }
        visited[v] = false;
    }

}
