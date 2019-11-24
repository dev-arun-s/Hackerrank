package com.dev.practice;

import java.util.Scanner;

/**
 * @author aruns
 * https://www.hackerrank.com/challenges/java-substring/problem	
 *
 */
public class SubString {

	public static void main (String args[]) {
	Scanner in = new Scanner(System.in);
    String S = in.next();
    int start = in.nextInt();
    int end = in.nextInt();
    in.close();
    System.out.println(S.substring(start, end));
}
}
