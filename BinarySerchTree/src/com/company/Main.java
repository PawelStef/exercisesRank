package com.company;
import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {

        Solution sol = new Solution();
            Scanner sc=new Scanner(System.in);
            System.out.print("Give numbers of nodes:");
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                System.out.print("Node number:");
                int data=sc.nextInt();
                root=sol.insert(root,data);
            }
            int height=sol.getHeight(root);
            System.out.println(height);
        }

    }

