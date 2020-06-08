package com.dev.practice;

import java.util.Scanner;

/**
 * @author aruns
 * https://www.hackerrank.com/challenges/java-static-initializer-block/problem
 *
 */
public class JavaStaticInitializer {

	static boolean flag = true; static int B,H;
	static {
		Scanner scan = new Scanner(System.in); 
		B = scan.nextInt(); 
		scan.nextLine(); 
		H = scan.nextInt(); 
		scan.close(); 
		flag = B >0 && H >0;
		if(!flag) {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
	}
	
	public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main



}
