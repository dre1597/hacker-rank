// https://www.hackerrank.com/challenges/java-1d-array/problem?isFullScreen=true

import java.util.*;

public class Solution {
  
  private static boolean checkIfCanMove(int leap, int[] game, int i) {
    if(i >= game.length) {
      return true;
    } else if(i < 0 || game[i] == 1) {
      return false;
    }
    
    game[i] = 1;
    
    return checkIfCanMove(leap, game, i + leap) || 
      checkIfCanMove(leap, game, i + 1) || 
      checkIfCanMove(leap, game, i - 1);
  }

  public static boolean canWin(int leap, int[] game) {
    return checkIfCanMove(leap, game, 0);
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int q = scan.nextInt();
    while (q-- > 0) {
      int n = scan.nextInt();
      int leap = scan.nextInt();
      
      int[] game = new int[n];
      for (int i = 0; i < n; i++) {
        game[i] = scan.nextInt();
      }

      System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
    }
    scan.close();
  }
}