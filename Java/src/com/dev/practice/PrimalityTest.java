package com.dev.practice;

import java.math.BigInteger;
import java.util.Scanner;


/**
 * @author aruns
 * 
 * Primality Test
 * https://www.hackerrank.com/challenges/java-primality-test/problem
 *
 */
public class PrimalityTest {
	
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        BigInteger input = new BigInteger(n);
        

        System.out.println(input.isProbablePrime(10)?"prime":"not prime");
        scanner.close();
    }

}
