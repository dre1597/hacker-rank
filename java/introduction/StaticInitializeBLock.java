// https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true

import java.io.*;
import java.util.*;

public class Solution {

  static Scanner scan = new Scanner(System.in);
  static int B = scan.nextInt();
  static int H = scan.nextInt();
  static boolean isValid = true;
    
  static {
    try {
      if(B <= 0 || H <= 0) {
        isValid = false;
        throw new Exception("Breadth and height must be positive");
      }
    } catch(Exception e) {
      System.out.println(e);
    }
  }
    
  public static void main(String[] args) {
    if(isValid) {
      System.out.print(B * H);
    }
    
  }
}