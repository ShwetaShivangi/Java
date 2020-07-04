package com.practice.java;

import java.io.*;
import java.util.*;
interface PerformOperation {
 boolean check(int a);
}

//Lambda expression
class MyMath {
 public static boolean checker(PerformOperation p, int num) {
  return p.check(num);
 }
    // Write your code here

public PerformOperation isOdd(){
    return(a) -> {if (a % 2 != 0)
                return true;
            else
                return false; };
}

public PerformOperation isPrime(){
    return(a) -> {  
        if (a<=1)
    return false;

    for (int i = 2; i < a; i++) 
            if (a % i == 0) 
                return false; 
  
        return true;  };
}

public PerformOperation isPalindrome(){
    return(a) -> { String s = String.valueOf(a);
            String r = (new StringBuffer(s).reverse()).toString();
            return s.equals(r); };
}

    
//}
//public class Solution {

 public static void main(String[] args) throws IOException {
  MyMath ob = new MyMath();
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int T = Integer.parseInt(br.readLine());
  PerformOperation op;
  boolean ret = false;
  String ans = null;
  while (T--> 0) {
   String s = br.readLine().trim();
   StringTokenizer st = new StringTokenizer(s);
   int ch = Integer.parseInt(st.nextToken());
   int num = Integer.parseInt(st.nextToken());
   if (ch == 1) {
    op = ob.isOdd();
    ret = ob.checker(op, num);
    ans = (ret) ? "ODD" : "EVEN";
   } else if (ch == 2) {
    op = ob.isPrime();
    ret = ob.checker(op, num);
    ans = (ret) ? "PRIME" : "COMPOSITE";
   } else if (ch == 3) {
    op = ob.isPalindrome();
    ret = ob.checker(op, num);
    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

   }
   System.out.println(ans);
  }
 }
 
}
