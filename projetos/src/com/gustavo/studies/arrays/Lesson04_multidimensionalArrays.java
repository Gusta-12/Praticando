package com.gustavo.studies.arrays;

import java.util.Arrays;
import java.util.Locale;

public class Lesson04_multidimensionalArrays {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		syntax();
//		exampleClass();
	}

	public static void syntax() {
		System.out.println("Syntax: <type>[][] name = new <type>[rows][columns]");
		System.out.println("Example: int[][] matrix = new int[3][4] // 3 rows, 4 columns (3x4)");
		System.out.println();
		System.out.println("Syntax with values: <type>[][] name = {{<r1/c1>, <r1/c2>}, {<r2/c1>, <r2/c2>}};");
		System.out.println("Example: int[][] matrix = {{1, 2, 3}, {4, 5, 6}};");
		System.out.println();
		System.out.println("Accessing elements (using the array above): ");

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };

		System.out.printf("matrix[%d][%d] = %d %n", 0, 2, matrix[0][2]);
		System.out.printf("matrix[%d][%d] = %d %n", 1, 1, matrix[1][1]);

		System.out.println();
		System.out.println("Getting size:");
		System.out.println("matrix.length = rows");
		System.out.println("matrix[<row>].length = columns");
		System.out.println();
		System.out.println("Using classic-for:");
		System.out.println("for(int rows = 0; rows < matrix.length; row++){");
		System.out.println("	for(int columns = 0; columns < matrix[rows].length; columns++){...}");
		System.out.println("}");
		System.out.println();
		System.out.println("Using for-each:");
		System.out.println("for(int[] row : matrix){");
		System.out.println("	for(int column : row){...}");
		System.out.println("}");

		System.out.println();
		System.out.println("See elements: Arrays.deepToString(matrix)");
		System.out.println("Copy matrices: using Arrays.copy(original[i], original[i].length; on each row");
	}

	public static void exampleClass() {
		System.out.println("Problem: A class has three students and four subjects.");
		System.out.println("Calculate the average of each student and the overall class average");

		double[][] grades = { { 7.0, 8.5, 6.0, 9.0 }, // Aluno 0
				{ 5.5, 7.0, 8.0, 6.5 }, // Aluno 1
				{ 9.0, 9.5, 8.5, 10.0 } // Aluno 2
		};

		System.out.println("Grades: " + Arrays.deepToString(grades));
		System.out.println();

		double sumOfAverages = 0;
		int totalStudents = grades.length;

		for (int i = 0; i < totalStudents; i++) {
			double studentSum = 0;

			for (double subjectGrade : grades[i]) {
				studentSum += subjectGrade;
			}
			int subjects = grades[i].length;
			double average = studentSum / subjects;
			System.out.printf("Average of student %d: %.2f %n", i + 1, average);

			sumOfAverages += average;
		}
		System.out.println();
		double classAverage = sumOfAverages / totalStudents;

		System.out.printf("Class average: %.2f %n", classAverage);
	}
}
