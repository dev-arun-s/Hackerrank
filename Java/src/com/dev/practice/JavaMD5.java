package com.dev.practice;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
 * @author aruns
 *
 */
public class JavaMD5 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        scan.close();
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(input.getBytes());
            byte[] digest = md.digest();
            for (byte b : digest) {
                System.out.printf("%02x", b);
            }
 
			
		} catch (NoSuchAlgorithmException e) {
			
			e.printStackTrace();
		}
        
        
    }
}
