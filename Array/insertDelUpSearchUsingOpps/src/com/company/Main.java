package com.company;

public class Main {

    public static void main(String[] args) {
        ArrayFunctionalities ary = new ArrayFunctionalities(100);
        int insertSize = 0;

        ary.insert(0,4);
        ary.insert(1,1);
        ary.insert(2,6);
        ary.insert(3,3);
        ary.insert(4,2);
        ary.insert(5,7);
        ary.insert(6,12);
        ary.insert(7,45);
        ary.insert(8,11);
        ary.insert(9,49);
        insertSize = 10;
        for(int i = 0;i<insertSize;i++){
            System.out.print(ary.getA(i) + " ");
        }
        System.out.println();

        //insertion
        int j;
        int searchElement = 12;
        for(j = 0;j<insertSize;j++){
            if(ary.getA(j) == searchElement)
                break;
        }
        if(j == insertSize)
            System.out.println("Element not found");
        else
            System.out.println("Element found and index is " +j +" value is " +searchElement);

        //deletion
        int deleteElement = 12;
        for(j= 0;j<insertSize;j++){
            if(ary.getA(j) == 12)
                break;
        }
        for(int k = j;k<insertSize;k++)
            ary.setA(k,ary.getA(k+1));
        insertSize--;

        for(int i = 0;i<insertSize;i++){
            System.out.print(ary.getA(i) + " ");
        }
        System.out.println();
        //sorting
        System.out.println("after sorting method");
        ary.sorting(insertSize);
        for(int i = 0;i<insertSize;i++){
            System.out.print(ary.getA(i) + " ");
        }

    }
}
