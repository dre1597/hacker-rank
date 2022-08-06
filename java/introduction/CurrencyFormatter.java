// https://www.hackerrank.com/challenges/java-currency-formatter/problem?isFullScreen=true

import java.io.*;
import java.text.*; 
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    double payment = scanner.nextDouble();
    
    NumberFormat usPayment = NumberFormat.getCurrencyInstance(Locale.US);
    System.out.println("US: " + usPayment.format(payment));

    NumberFormat indiaPayment = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
    System.out.println("India: " + indiaPayment.format(payment));
    
    NumberFormat chinaPayment = NumberFormat.getCurrencyInstance(Locale.CHINA);
    System.out.println("China: " + chinaPayment.format(payment));
    
    NumberFormat francePayment = NumberFormat.getCurrencyInstance(Locale.FRANCE);
    System.out.println("France: " + francePayment.format(payment));
    
    scanner.close();
  }
}