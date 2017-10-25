package com.company;

public class Solution {

        static int s = 0;

    public int[] bubbleSort(int n, int[] b){
        int endPosition = n-1;
        int swapPosition;

        while(endPosition >0){
            swapPosition =0;
            for(int i =0; i< endPosition; i++){
                if(b[i] > b[i+1]){
                    int temp = b[i];
                    b[i] = b[i+1];
                    b[i+1] = temp;
                    swapPosition = i;
                    s++;
                }
            }
            endPosition = swapPosition;
        }
        return b;
    }

    public void print(int[] b, int n){
        System.out.println("Array is sorted in "+s+" swaps.");
        System.out.println("First Element: "+b[0]);
        System.out.println("Last Element: "+b[n-1]);
    }
}
