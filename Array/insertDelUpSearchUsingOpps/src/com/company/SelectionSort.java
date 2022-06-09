package com.company;

public class SelectionSort {
    public long[] sortingMethod(long[] arr,int insertSize){
        int out;
        for(out = 0;out<insertSize-1;out++){
            int min = out;
            for(int i = out+1;i<insertSize;i++){
                if(arr[i] < arr[min]){
                    min = i;
                }
            }
            long temp = arr[min];
            arr[min] = arr[out];
            arr[out] = temp;
        }
        return arr;
    }
}
