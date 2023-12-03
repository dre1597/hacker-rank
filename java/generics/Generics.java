// https://www.hackerrank.com/challenges/java-generics/problem

import java.io.*;
import java.util.*;

public class Solution {
    public static <T> void printArray(T[] array) {
        for (T element: array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer numbers[] = { 1, 2, 3 };
        String strings[] = { "Hello", "World" };

        printArray(numbers);
        printArray(strings);
    }
}
