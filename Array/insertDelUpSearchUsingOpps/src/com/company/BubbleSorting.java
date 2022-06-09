package com.company;

public class BubbleSorting {
//    private long[] arr;
//    public BubbleSorting(long[] arr){
//        this.arr = arr;
//    }
    public long[] sortingMethod(long[] arr,int size){
        for(int le = size-1;le>1;le--){
            for(int i = 1; i<size-1;i++){
                if(arr[i-1]>arr[i]){
                    long temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                }
            }
        }
        return arr;
    }
}
