package com.dev.practice;

import java.math.BigInteger;
import java.util.Scanner;

/*
 * A prime number is a natural number greater than  whose only positive divisors are  and itself. For example, the first six prime numbers are , , , , , and .

Given a large integer, , use the Java BigInteger class' isProbablePrime method to determine and print whether it's prime or not prime.

Input Format

A single line containing an integer,  (the number to be checked).

Constraints

 contains at most  digits.
Output Format

If  is a prime number, print prime; otherwise, print not prime.

Sample Input

13
Sample Output

prime
Explanation

The only positive divisors of  are  and , so we print prime.


 */
public class PrimalityTest {
	
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        BigInteger l = new BigInteger(n);
        

        System.out.println(l.isProbablePrime(1)?"prime":"not prime");
        scanner.close();
    }

}
