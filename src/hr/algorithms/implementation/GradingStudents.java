package hr.algorithms.implementation;

import java.util.Scanner;

/**
 * Sam is a professor at the university and likes to round each student's
 * according to these rules:
 * 
 * - If the difference between the grade and the next multiple of 5 is less than
 * 3, round grade up to the next multiple of 5;
 * 
 * - If the value of grade is less than 38, no rounding occurs as the result
 * will still be a failing grade.
 * 
 * Sample Input: 4 73 67 38 33
 * 
 * Sample Output: 75 67 40 33
 * 
 * 
 * @author Joabe
 * @see https://www.hackerrank.com/challenges/grading
 *
 */
public class GradingStudents {

	public static void main(String[] args) {

		try (Scanner in = new Scanner(System.in)) {

			int n = in.nextInt();

			for (int i = 0; i < n; i++) {
				int grade = in.nextInt();

				System.out.println(grade < 38 || grade % 5 < 3 ? grade : grade + (5 - (grade % 5)));
			}

		}

	}

}
