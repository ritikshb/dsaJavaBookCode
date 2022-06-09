package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 12;
        arr[4] = 11;
        arr[5] = 8;
        arr[6] = 53;
        arr[7] = 17;
        arr[8] = 15;
        arr[9] = 5;
        int nElems = arr.length;
        for (int i = 0; i < nElems; i++) {
            System.out.print(arr[i] + " ");
        }
        int searchKey = 53;
        int j;
        for (j = 0; j < nElems; j++) {
            if (arr[j] == searchKey) {
                break;
            }
        }
        System.out.println();
        if (j == nElems) {
            System.out.println("not Found");
        } else {
            System.out.println("Found " + searchKey + " index " + j);
        }
        int delete = 17;
        for(j = 0;j<nElems;j++) {
            if (arr[j] == delete) {
                break;
            }
        }
        for(int k = j;k<nElems-1;k++){
            arr[k] = arr[k+1];
        }
        nElems--;
        System.out.print("After Deletion ");
        for (int i = 0; i < nElems; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
