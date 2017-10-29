package com.company;

public class Solution {
    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }

    public static int getHeight(Node root){

        if ( root == null){
            return -1;
        }
        return  1 + Math.max(getHeight(root.left), getHeight(root.right));
    }
}
