package com.dev.practice;

import java.util.Scanner;

public class StringToken {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		if (s !=null && s.trim().length() > 0) {
			String[] tokens = s.trim().split("[ .,_?!'@]+");
			if (tokens.length <= 400000) {
				System.out.println(tokens.length);
				for (String str : tokens) {
					System.out.println(str);
				}
			}
		} else {
			System.out.println(0);
		}
		scan.close();
	}

}
