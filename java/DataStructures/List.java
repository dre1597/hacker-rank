// https://www.hackerrank.com/challenges/java-list/problem?isFullScreen=true

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int initialLength = scanner.nextInt();
    List<Integer> list = new ArrayList<>(initialLength);
    
    for (int i = 0; i < initialLength; i++) {
      list.add(scanner.nextInt());
    }
    
    int numberOfQueries = scanner.nextInt();
    
    for(int i = 0; i < numberOfQueries; i++) {
      String query = scanner.next();
      
      if(query.equals("Insert")) {
        int index = scanner.nextInt();
        int element = scanner.nextInt();
        
        list.add(index, element);
      } else if (query.equals("Delete")) {
        int index = scanner.nextInt();
        
        list.remove(index);
      }
    }
    
    scanner.close();
    
    for(Integer elem : list) {
      System.out.print(elem + " ");
    }
  }
}