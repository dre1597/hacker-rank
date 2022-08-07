// https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true

import java.util.Scanner;

public class Solution {

  static boolean isAnagram(String a, String b) {
    if(a == null || b == null || a.equals("") || b.equals("") || a.length() != b.length()) {
      return false;
    }
    
    char arrayOfA[] = a.toLowerCase().toCharArray();
    char arrayOfB[] = b.toLowerCase().toCharArray();
    
    java.util.Arrays.sort(arrayOfA);
    java.util.Arrays.sort(arrayOfB);
    
    return java.util.Arrays.equals(arrayOfA, arrayOfB);
  }

  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    String b = scan.next();
    scan.close();
    boolean ret = isAnagram(a, b);
    System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
  }
}
