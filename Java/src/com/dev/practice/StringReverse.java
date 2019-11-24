package com.dev.practice;

import java.util.Scanner;

/**
 * @author aruns
 * https://www.hackerrank.com/challenges/java-string-reverse/problem
 *
 */
public class StringReverse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		sc.close();
		String reversedStr = new StringBuilder(A).reverse().toString();
		if (A.equalsIgnoreCase(reversedStr))
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
