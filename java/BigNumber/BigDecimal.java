// https://www.hackerrank.com/challenges/java-bigdecimal/problem?isFullScreen=true

import java.math.BigDecimal;
import java.util.*;

class Solution {
  public static void main(String []args ){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String []s = new String[n + 2];

    for(int i = 0; i < n; i++){
        s[i] = sc.next();
    }

    sc.close();
    
    Comparator<String> cmp = new Comparator<String>() {
      @Override
      public int compare(String s1, String s2) {
        if (s1 == null || s2 == null) {
          return 0;
        }
        
        BigDecimal bd1 = new BigDecimal(s1);
        BigDecimal bd2 = new BigDecimal(s2);
        
        return bd1.compareTo(bd2);
      }
    };

    Arrays.sort(s, Collections.reverseOrder(cmp));

    //Output
    for(int i = 0; i < n; i++)
    {
      System.out.println(s[i]);
    }
  }
}