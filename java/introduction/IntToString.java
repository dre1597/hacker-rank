// https://www.hackerrank.com/challenges/java-int-to-string/problem

import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    
    if(n >= -100 && n <= 100) {
      String s = Integer.toString(n);
      System.out.println("Good job");
    } else {
      System.out.println("Wrong answer");
    }

    scanner.close();
  }
}