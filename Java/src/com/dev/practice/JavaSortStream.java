package com.dev.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author aruns
 * https://www.hackerrank.com/challenges/java-sort/problem
 *
 */
public class JavaSortStream {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
        in.close();
        studentList = studentList.stream().sorted(Comparator.comparing(Student::getCgpa).reversed().thenComparing(Student::getFname)
				.thenComparing(Student::getId)).collect(Collectors.toList());
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}

