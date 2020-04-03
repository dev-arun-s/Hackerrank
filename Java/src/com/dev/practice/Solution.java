package com.dev.practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the hackerrankInString function below.
    static void hackerrankInString(String s) {
    	String toTest="hackerrank";
    	char[] testArray = toTest.toCharArray();
    	System.out.println(testArray);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            hackerrankInString(s);

			/*
			 * bufferedWriter.write(result); bufferedWriter.newLine();
			 */
        }

        //bufferedWriter.close();

        scanner.close();
    }
}

