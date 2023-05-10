package com.example.datastructure.graph;

import java.util.*;
import java.util.stream.Collectors;

public class BJ14567 {

    static class Pair{
        final Integer subject;
        final Integer semester;

        public Pair(Integer subject, Integer semester){
            this.subject = subject;
            this.semester = semester;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int N = Integer.valueOf(s.split(" ")[0]);
        int M = Integer.valueOf(s.split(" ")[1]);

        //idx => 과목번호
        int[] indegree = new int[N];
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for(int i = 0; i < M; i++){
            s = sc.nextLine();
            int A = Integer.valueOf(s.split(" ")[0]); //from
            int B = Integer.valueOf(s.split(" ")[1]); //to
            indegree[B-1] += 1;
            List<Integer> l = graph.getOrDefault(A, new ArrayList<>());
            l.add(B);
            graph.put(A, l);
        }

        Queue<Pair> queue = new LinkedList<>();
        for (int i = 1; i <= indegree.length; i++){
            if (indegree[i-1] == 0) {
                queue.add(new Pair(i, 1));
            }
        }
        Integer[] result = new Integer[N];
        while (!queue.isEmpty()){
            Pair p = queue.poll();
            result[p.subject-1] = p.semester;

            if (graph.containsKey(p.subject)){
                for (Integer node : graph.get(p.subject)){
                    indegree[node - 1] -= 1;
                    if (indegree[node-1] == 0){
                        queue.add(new Pair(node, p.semester+1));
                    }
                }
            }
        }
        System.out.println(
                Arrays.asList(result).stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining(" "))
        );





    }


}
