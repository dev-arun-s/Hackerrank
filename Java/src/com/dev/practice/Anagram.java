package com.dev.practice;

import java.util.Scanner;

public class Anagram {

	static boolean isAnagram(String a, String b) {
		
		if(a == null || a=="" || b==null || b=="" || a.length() != b.length()) {
			return false;
		}
		
        char[] first = a.toLowerCase().toCharArray();
        char[] second = b.toLowerCase().toCharArray();
        java.util.HashMap<Character,Integer> aMap = new java.util.HashMap<>();
        java.util.HashMap<Character,Integer> bMap = new java.util.HashMap<>();
        
        for(Character ch:first) {
        	//Store the number of occurrences of each character in the String a
        	//in Map with character as key and number of occurrences as map
        	aMap.put(ch, aMap.containsKey(ch)? aMap.get(ch)+1 : 1);
        }
        
        for(Character ch:second) {
        	//Store the number of occurrences of each character in the String a
        	//in Map with character as key and number of occurrences as map
        	bMap.put(ch, bMap.containsKey(ch)? bMap.get(ch)+1 : 1);
        }
        return aMap.equals(bMap);
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
