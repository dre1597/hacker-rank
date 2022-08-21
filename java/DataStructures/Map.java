// https://www.hackerrank.com/challenges/phone-book/problem?isFullScreen=true

import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		int entries = scanner.nextInt();
		scanner.nextLine();
    
    HashMap<String, Integer> phoneBook = new HashMap<>();
    
		for(int i = 0; i < entries; i++) {
			String name = scanner.nextLine();
			int phone = scanner.nextInt();
			scanner.nextLine();
      
      phoneBook.put(name, phone);
		}
    
		while(scanner.hasNext()) {
			String name = scanner.nextLine();
      
      if(phoneBook.containsKey(name)) {
        System.out.println(name + "=" + phoneBook.get(name));
      } else {
        System.out.println("Not found");
      }
		}
    
    scanner.close();
	}
}



