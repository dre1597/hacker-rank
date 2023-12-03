// https://www.hackerrank.com/challenges/java-hashset/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalElements = scan.nextInt();
        scan.nextLine();
        Set<String> elements = new HashSet<String>();

        for(int i = 0; i < totalElements; i++) {
            String element = scan.nextLine();

            if(!elements.contains(element)) {
                elements.add(element);
            }

            System.out.println(elements.size());
        }
    }
}
