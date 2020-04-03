package com.dev.practice;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int N = Integer.parseInt(in.nextLine());
		System.out.println(N);
		long diff = 0;
		for(int i=0; i < N; i++) {
			String[] row = in.nextLine().split(" ");
			diff += (Integer.parseInt(row[i]) - Integer.parseInt(row[N - 1 - i]));
		}
		
		System.out.println(Math.abs(diff));
		
		in.close();
	}

}
