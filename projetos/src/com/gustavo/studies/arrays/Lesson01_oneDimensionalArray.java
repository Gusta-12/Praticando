package com.gustavo.studies.arrays;

import java.util.Arrays;
import java.util.Locale;

public class Lesson01_oneDimensionalArray {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

//		syntax();
		System.out.println();
		example();
	}

	public static void syntax() {
		System.out.println("Syntax: <type>[] name = new <type>[size];");
		System.out.println("example: int[] numbers = new int[6]");

		System.out.println();

		System.out.println("Syntax (with values) <type>[] <names> = {<values>}; - useful when values are known beforehand");
		System.out.println("example: int[] numbers = {7, 8, 6, 9, 5};");

		System.out.println();

		System.out.println("Access elements: array[<position/index>];");
		System.out.println("See elements: Arrays.toString(array)");
		System.out.println("Copy arrays: int[] copy = Arrays.copyOf(original, original.length);");

	}

	public static void example() {
		System.out.println("Example with grades:");

		double[] grades = { 7.0, 8.0, 6.0, 9.0, 5.0 };
		int gradesCount = grades.length;

		System.out.println("Array (grades): " + Arrays.toString(grades));
		System.out.println("Length: " + gradesCount);

		double sum = 0.0;
		for (int i = 0; i < gradesCount; i++) {
			double previous = sum;
			sum += grades[i];
			System.out.printf("i = %d; sum = %.1f + %.1f = %.1f; \n", i, previous, grades[i], sum);

		}
		System.out.println();
		double average = sum / gradesCount;

		System.out.printf("Average: %.1f / %d = %.1f \n", sum, gradesCount, average);
		System.out.println();
	}

}
