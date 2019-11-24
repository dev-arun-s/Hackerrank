package com.dev.practice;

import java.util.Scanner;

/**
 * @author aruns
 * https://www.hackerrank.com/challenges/java-string-compare/problem
 *
 */
public class SubStringComparison {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";
		smallest = s.substring(0, k);
		for (int i = 0; i < s.length() - k + 1; i++) {
			String temp = s.substring(i, i + k);
			if (temp.compareTo(smallest) < 0)
				smallest = temp;
			if (temp.compareTo(largest) > 0)
				largest = temp;
		}

		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}

}
