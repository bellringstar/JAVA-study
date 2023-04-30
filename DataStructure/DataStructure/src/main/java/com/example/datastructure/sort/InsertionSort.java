package com.example.datastructure.sort;

public class InsertionSort {
    // 안정정렬, 데이터가 대부분 정렬돼있다면 O(n)
    public void sort(int[] arr) {
        for (int i = 1; i<arr.length; i++) {
            int key = arr[i]; // 삽입 할 데이터
            int j = i - 1; // 0~j까지 정렬된 상태로 본다.
            while (j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j] ; //1칸씩 오른쪽으로 이동
                j = j - 1;
            }
            arr[j + 1] = key;

        }
    }
}
