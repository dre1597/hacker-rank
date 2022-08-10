// https://www.hackerrank.com/challenges/java-2d-array/problem?isFullScreen=true

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int arr[][] = new int[6][6];
    
    for(int row = 0; row < 6; row++) {
      for(int col = 0; col < 6; col++) {
        arr[row][col] = scanner.nextInt();
      }
    }
    
    scanner.close();
    
    System.out.println(findLargestHourglassSum(arr));
  }
  private static int findLargestHourglassSum(int [][] arr) {
    int max = Integer.MIN_VALUE;
    
    for(int row = 0; row < 4; row++) {
      for(int col = 0; col < 4; col++) {
        int sum = findHourglassSum(arr, row, col);
        max = Math.max(max,sum);
      }
    }
    
    return max;
  }
  
  private static int findHourglassSum(int [][]arr, int row, int col) {  
  
    int sum = arr[row+0][col+0] + arr[row+0][col+1] + arr[row+0][col+2]
                                + arr[row+1][col+1] + 
              arr[row+2][col+0] + arr[row+2][col+1] + arr[row+2][col+2];
    return sum;
  }
}
