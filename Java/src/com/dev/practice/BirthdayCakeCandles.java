package com.dev.practice;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author aruns
 * https://www.hackerrank.com/challenges/birthday-cake-candles/problem
 *
 */
public class BirthdayCakeCandles {

	    /**
	     * Sort ascending and take the last value as maxValue
	     * @param ar
	     * @return
	     */
	    static int birthdayCakeCandles(int[] ar) {
	    	Arrays.sort(ar);
	    	int count = 0;
	    	int maxValue = ar[ar.length-1];
	    	for(int val:ar) {
	    		if(maxValue == val)
	    			++count;
	    	}
	    	return count;

	    }
	    
	    /**
	     * Sort descending and take the first value as maxValue
	     * @param ar
	     * @return
	     */
	    static int birthdayCakeCandlesSol2(int[] ar) {
	    	int[] arrDesc = Arrays.stream(ar).boxed()
	    		    .sorted(Collections.reverseOrder())
	    		    .mapToInt(Integer::intValue)
	    		    .toArray();
	    	int count = 0;
	    	int maxValue = arrDesc[0];
	    	for(int val:arrDesc) {
	    		if(maxValue == val)
	    			++count;
	    	}
	    	return count;

	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {

	        int arCount = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[] ar = new int[arCount];

	        String[] arItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < arCount; i++) {
	            int arItem = Integer.parseInt(arItems[i]);
	            ar[i] = arItem;
	        }

	        int result = birthdayCakeCandlesSol2(ar);
	        System.out.println(String.valueOf(result));

	        scanner.close();
	    }


}
