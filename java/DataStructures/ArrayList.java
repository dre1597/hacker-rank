// https://www.hackerrank.com/challenges/java-arraylist/problem?isFullScreen=true

import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    
    int d, q, x, y;
    
    ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    
    for(int i = 0; i < n; i++) {
      d = scanner.nextInt();
      arr.add(i, new ArrayList<Integer>());
      for(int j =0; j <d; j++) {
        arr.get(i).add(scanner.nextInt());
      }
    }
    
    q = scanner.nextInt();
    
    for(int i = 0; i < q; i++) {
      x = scanner.nextInt();
      y = scanner.nextInt();
      
      try {
        System.out.println(arr.get(x - 1).get(y - 1));
      } catch (Exception e) {
        System.out.println("ERROR!");
      }
    }
    
    scanner.close();
  }
}