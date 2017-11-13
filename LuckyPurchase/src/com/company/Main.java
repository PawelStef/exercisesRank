package com.company;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Main {
        public static void main(String[] args) {
            int p = 0;
            String m = null;

            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            for(int a0 = 0; a0 < n; a0++){
                String s = in.next();
                int num = in.nextInt();
                if (p==0){
                    int cztery = 0;
                    int siedem = 0;
                    String l = Integer.toString(num);
                    for( int i =0; i<l.length(); i++){
                        char current = l.charAt(i);
                        if (current == '4'){
                            cztery++;
                        }else if(current == '7'){
                            siedem++;
                        }else{
                            cztery=0;
                            break;
                        }

                    }
                    if(cztery == siedem && cztery!=0){
                        p=num;
                        m=s;
                    }
                }else if (num<p){
                    int cztery = 0;
                    int siedem = 0;
                    String l = Integer.toString(num);
                    for( int i =0; i<l.length(); i++){
                        char current = l.charAt(i);
                        if (current == '4'){
                            cztery++;
                        }else if(current == '7'){
                            siedem++;
                        }else{
                            cztery=0;
                            break;
                        }

                    }
                    if(cztery == siedem && cztery!=0){
                        p=num;
                        m=s;
                    }
                }

                //in.close();
            }
            if(p!=0){
                System.out.println(m);
            }
            else{
                System.out.println("-1");
            }
        }
    }