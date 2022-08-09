// https://www.hackerrank.com/challenges/java-biginteger/problem?isFullScreen=true

import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    BigInteger bi1 = new BigInteger(scanner.next());
    BigInteger bi2 = new BigInteger(scanner.next());
    
    scanner.close();
    
    BigInteger add = bi1.add(bi2);
    BigInteger multiply = bi1.multiply(bi2);
    
    System.out.println(add);
    System.out.println(multiply);
  }
}