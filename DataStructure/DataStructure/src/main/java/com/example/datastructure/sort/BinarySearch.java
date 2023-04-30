package com.example.datastructure.sort;

public class BinarySearch {

    public int search(int[] arr, int target) {
        // 0. arr는 정렬이 된 상태를 가정
        // 1. 데이터 중간의 인덱스 값을 찾는다.
        // 2. 중간 인덱스의 위치를 기준으로 arr을 절반으로 나눈다.
        // 3. 나눠진 절반의 리스트에서 target 값을 찾는다

        int l = 0;
        int r = arr.length - 1;

        int m;
        while (l <= r){
//          m = (l + r) / 2; int는 4byte이기 떄문에 만약 l+r이 범위를 벗어나면 에러
            m = l + ((r-l)/2);

            if (arr[m] == target) {
                return m;
            }

            if (arr[m] < target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }


        return -1;
    }
}
