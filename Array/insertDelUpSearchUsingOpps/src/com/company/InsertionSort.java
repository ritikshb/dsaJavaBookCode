package com.company;

public class InsertionSort {
    public long[] sortingMethod(long[] arr,int size){
        for(int i = 1;i<size;i++){
            long key = arr[i];
            int j = i -1;
            while(j>= 0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }
}
