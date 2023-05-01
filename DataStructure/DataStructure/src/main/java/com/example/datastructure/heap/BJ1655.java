package com.example.datastructure.heap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BJ1655 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>(Comparator.reverseOrder());

        StringBuilder result = new StringBuilder();
        for (int i = 0; i<N; i++){
            int x = sc.nextInt();

            if (max.size() == min.size()) {
                max.offer(x);
            } else {
                min.offer(x);
            }

            if (!min.isEmpty() && max.peek() > min.peek()){
                min.offer(max.poll());
                max.offer(min.poll());
            }

            result.append(max.peek() + "\n");
        }
        System.out.println(result.toString());
    }
}
