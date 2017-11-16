package com.company;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static int getMaxValue(int[][] numbers) {
        int maxValue = numbers[0][0];
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers[j].length; i++) {
                if (numbers[j][i] > maxValue) {
                    maxValue = numbers[j][i];
                }
            }
        }
        return maxValue;
    }

    static int surfaceArea(int[][] A) {
        int row = A.length;
        int col = A[0].length;
        int max = getMaxValue(A);

        int a = col * row *2;
        int b = 0;


        for(int h = 1; h<=max; h++){
            for(int i =0; i<row; i++){
                for(int j = 0; j<col; j++){
                    if (A[i][j]>=h){
                        if (j == 0){
                            b++;
                        }else if(A[i][j]>A[i][j-1] && A[i][j-1]<h){
                            b++;
                        }
                        if (j == col-1){
                            b++;
                        }else if(A[i][j]>A[i][j+1] && A[i][j+1]<h){
                            b++;
                        }
                        if (i == 0){
                            b++;
                        }else if(A[i][j]>A[i-1][j] && A[i-1][j]<h){
                            b++;
                        }
                        if (i == row-1){
                            b++;
                        }else if(A[i][j]>A[i+1][j] && A[i+1][j]<h){
                            b++;
                        }
                    }

                }

            }
        }
        int c=a+b;
        return c;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int H = in.nextInt();
        int W = in.nextInt();
        int[][] A = new int[H][W];
        for(int A_i = 0; A_i < H; A_i++){
            for(int A_j = 0; A_j < W; A_j++){
                A[A_i][A_j] = in.nextInt();
            }
        }
        int result = surfaceArea(A);
        System.out.println(result);
        in.close();
    }
}