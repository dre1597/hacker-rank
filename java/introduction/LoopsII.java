// https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true

import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int q = scanner.nextInt();
    
    for (int i = 0; i < q; i++) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      int n = scanner.nextInt();
      
      int series = a;
      
      for(int j = 0; j < n; j++) {
        series += Math.pow(2, j) * b;
        System.out.printf("%s ", series);
      }
      
      System.out.println();
    }
    
    scanner.close(); 
  }
}