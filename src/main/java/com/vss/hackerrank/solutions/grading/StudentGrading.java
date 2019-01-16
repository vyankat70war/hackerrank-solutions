package com.vss.hackerrank.solutions.grading;

import java.io.IOException;
import java.util.Scanner;

public class StudentGrading {

	/*
	 * Complete the gradingStudents function below.
	 */
	static int[] gradingStudents(int[] grades) {
		/*
		 * Write your code here.
		 */
		int res[] = new int[grades.length];
		int i = 0;
		int nextVal =0;
		for (int grade : grades) {
			if(grade == 38) {
				grade = 40;
			}else if(grade > 38) {
				nextVal = (grade/5 +1) * 5;
				grade = (nextVal - grade) < 3 ? nextVal : grade;
			}
			res[i++] = grade;
		}
		return res;

	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int[] grades = { 4, 73, 67, 38, 33 };
		int[] result = gradingStudents(grades);
		for (int i : result) {
			System.out.println(i);
		}

	}
}
