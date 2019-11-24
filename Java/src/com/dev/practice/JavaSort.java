package com.dev.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @author aruns
 * https://www.hackerrank.com/challenges/java-sort/problem
 *
 */
public class JavaSort implements Comparator<Student> {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student> studentList = new ArrayList<Student>();
		while (testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student st = new Student(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}
		in.close();
		Collections.sort(studentList, new JavaSort());
		for (Student st : studentList) {
			System.out.println(st.getFname());
		}
	}

	@Override
	public int compare(Student o1, Student o2) {
		// for comparison
		int cgpaCompare = Double.valueOf(o2.getCgpa()).compareTo(Double.valueOf(o1.getCgpa()));
		int NameCompare = o1.getFname().compareTo(o2.getFname());
		int idCompare = Integer.valueOf(o1.getId()).compareTo(Integer.valueOf(o2.getId()));

		// 2-level comparison using if-else block
		if (cgpaCompare == 0) {
			return ((NameCompare == 0) ? idCompare : NameCompare);
		} else {
			return cgpaCompare;
		}

	}

}

