package com.gustavo.studies.arrays;

import java.util.Arrays;
import java.util.Locale;

public class Lesson02_traversingArrays {
	public static final String ARRAY_NULL_OR_EMPTY = "Array cannot be null or empty";
	public final static int LINE_LENGTH = 25;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		testingForStructures();
		printLine(LINE_LENGTH);

		exerciseWithTemperatures();
		printLine(LINE_LENGTH);

		exerciseWithAges();
	}

	public static void printLine(int amount) {
		for (int i = 0; i < amount; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

	public static void testingForStructures() {
		double[] grades = { 7.0, 8.0, 6.0, 9.0, 5.0 };
		System.out.println("classic for: useful when you need the index");

		for (int i = 0; i < grades.length; i++) {
			System.out.printf("Array[%d] = %.1f \n", i, grades[i]);
		}
		System.out.println("Advantages: manageable order and exchange of values;");

		printLine(LINE_LENGTH);

		System.out.println("for-each: useful when you only need the values");
		for (double x : grades) {
			System.out.println(x);
		}
		System.out.println("Advantage: easier reading");
	}

	public static boolean isNullOrEmpty(double[] arr) {
		return arr == null || arr.length == 0;
	}

	public static boolean isNullOrEmpty(int[] arr) {
		return arr == null || arr.length == 0;
	}

	public static void validateArray(double[] arr) {
		if (isNullOrEmpty(arr)) {
			throw new IllegalArgumentException(ARRAY_NULL_OR_EMPTY);
		}
	}

	public static void validateArray(int[] arr) {
		if (isNullOrEmpty(arr)) {
			throw new IllegalArgumentException(ARRAY_NULL_OR_EMPTY);
		}
	}

	public static double sum(double[] arr) {
		validateArray(arr);

		double sum = 0.0;
		for (double x : arr) {
			sum += x;
		}

		return sum;
	}

	public static double getAverage(double[] arr) {
		validateArray(arr);

		return sum(arr) / arr.length;
	}

	public static int getMaxIndex(double[] arr) {
		validateArray(arr);

		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > arr[max]) {
				max = i;
			}
		}

		return max;
	}

	public static void exerciseWithTemperatures() {
		System.out.println("Exercise with temperatures");
		System.out.println("Objective: Calculate the average of the given temperatures AND find the hottest day");
		try {
			double[] temps = { 28.5, 31.0, 29.2, 33.7, 27.8, 30.1, 32.4 };

			double average = getAverage(temps);

			int hottestDayIndex = getMaxIndex(temps);

			System.out.println("Temperatures: " + Arrays.toString(temps));
			System.out.printf("Average of the week: %.2fC° \n", average);
			System.out.printf("Hottest day: %.1f (day %d) \n", temps[hottestDayIndex], hottestDayIndex + 1);

		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	public static int countAdults(int[] arr) {
		validateArray(arr);

		int adultCount = 0;

		for (int age : arr) {
			if (age >= 18) {
				adultCount++;
			}
		}

		return adultCount;
	}

	public static void exerciseWithAges() {
		System.out.println("Exercise with ages");
		int[] ages = { 15, 22, 17, 30, 14, 25 };

		try {
			int adultCount = countAdults(ages);

			System.out.println("Ages: " + Arrays.toString(ages));
			System.out.println("Number of adults (>=18): " + adultCount);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
