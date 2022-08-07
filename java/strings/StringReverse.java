// https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true

import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    
    sc.close();
    
    if(A.length() == 1) {
      System.out.println("Yes");
      return;
    }
    
    int i = 0, j = A.length() - 1;
    
    while(A.charAt(i) == A.charAt(j) && (i++) <= (j--));
    
    System.out.println( i >= j ? "Yes" : "No");
  }
}



