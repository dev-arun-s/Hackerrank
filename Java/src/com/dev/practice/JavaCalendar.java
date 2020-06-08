package com.dev.practice;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class JavaCalendar {
	
	/*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
    	Calendar cal = new GregorianCalendar();
    	cal.set(year, month, day);
    	String result ="";
    	System.out.println(cal.get(cal.DAY_OF_WEEK));
    	String dayOfWeek = cal.getDisplayName( Calendar.DAY_OF_WEEK ,Calendar.LONG, Locale.getDefault());
    	System.out.println(dayOfWeek);
    	return dayOfWeek;
    	
    }

    public static void main(String[] args) throws IOException {
		/*
		 * BufferedReader bufferedReader = new BufferedReader(new
		 * InputStreamReader(System.in)); BufferedWriter bufferedWriter = new
		 * BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		 */
    	Scanner scan = new Scanner(System.in); 
    	String input = scan.next();
    	scan.close();
        String[] firstMultipleInput = input.replaceAll("\\s+$", "").split(" ");
       
        int month = 7;

        int day = 5;

        int year = 2015;

        String res = JavaCalendar.findDay(month, day, year);
        System.out.println(res);

		/*
		 * bufferedWriter.write(res); bufferedWriter.newLine();
		 * 
		 * bufferedReader.close(); bufferedWriter.close();
		 */
    }

}
