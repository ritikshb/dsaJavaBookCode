package com.company;

public class ArrayFunctionalities {
    private long[] a;

    public ArrayFunctionalities(int size){
        a = new long[size];
    }
    public void insert(int index,long value){
        if(index>a.length){
            System.out.println("out of size index");
        }
        else
            a[index] = value;
    }

    public void setA(int index,long value){
        a[index] = value;
    }
    public long getA(int index) {
        return a[index];
    }
    public void sorting(int insertSize){
//        BubbleSorting sorting = new BubbleSorting();
//        SelectionSort sorting = new SelectionSort();
        InsertionSort sorting = new InsertionSort();
        a = sorting.sortingMethod(a,insertSize);
    }
}
