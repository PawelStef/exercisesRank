package com.company;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of numbers:");
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            System.out.println("Give a number");
            a[a_i] = in.nextInt();
        }
        Solution sol = new Solution();
        a = sol.bubbleSort(n, a);
        sol.print(a, n);
    }
}
