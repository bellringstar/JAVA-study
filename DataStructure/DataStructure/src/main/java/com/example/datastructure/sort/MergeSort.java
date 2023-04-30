package com.example.datastructure.sort;
/*
divide - conquer
 */
public class MergeSort implements Isort{
    @Override
    public void sort(int[] arr) {
        mergeSort(arr, 0, arr.length-1);
    }

    private void mergeSort(int[] arr, int low, int high){
        if (low>=high){
            return;
        }
        int mid = low + ((high - low)/2);

        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);

        merge(arr, low, mid, high);
    }

    private void merge(int[] arr, int low, int mid, int high){
        int[] tmp = new int[high - low + 1];
        int idx = 0;

        int left = low;
        int right = mid + 1;
        while (left <= mid && right <=high) {
            if (arr[left] <= arr[right]){
                tmp[idx] = arr[left];
                left++;
            } else {
                tmp[idx] = arr[right];
                right++;
            }
            idx++;
        }

        while (left <= mid) {
            tmp[idx] = arr[left];
            idx++;
            left++;
        }

        while (right <= high) {
            tmp[idx] = arr[right];
            idx++;
            right++;
        }

        for (int i = low; i <= high; i++){
            arr[i] = tmp[i - low];
        }
    }



}
