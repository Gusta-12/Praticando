package com.gustavo.studies.arrays;

import java.util.Arrays;

public class Lesson03_linearSearch {
	public static void main(String[] args) {
		exampleInt();
		exerciseWithPrices();
	}

	public static void exampleInt() {
		try {
			int[] numbers = { 15, 42, 8, 73, 29, 6, 51 };
			int target = 29;

			System.out.println("Array (numbers): " + Arrays.toString(numbers));
			System.out.println("Target: " + target);

			int result = linearSearch(numbers, target);

			if (result >= 0) {
				System.out.println("Target found at index " + result);
			} else {
				System.out.println("Target not found");
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void exerciseWithPrices() {
		System.out.println("Exercise with prices");

		int target = 200;
		System.out.printf("Objective: Count the occurrences of the value '%d' in the array. %n", target);

		int[] values = { 120, 85, 200, 95, 200, 150 };

		System.out.println("Array (values): " + Arrays.toString(values));
		System.out.println();

		int occurrences = countOccurrences(values, target);

		System.out.println("Number of occurrences: " + occurrences);
	}

	public static boolean isNullOrEmpty(int[] arr) {
		return arr == null || arr.length == 0;
	}

	public static void validateArray(int[] arr) {
		if (isNullOrEmpty(arr)) {
			throw new IllegalArgumentException(
					"Array must not be null or empty, but received: " + (arr == null ? "null" : "empty array"));
		}
	}

	public static int linearSearch(int[] arr, int target) {
		validateArray(arr);

		for (int i = 0; i < arr.length; i++) {
			boolean isMatch = arr[i] == target;

			System.out.printf("array[%d]; %d == %d? %b %n", i, arr[i], target, isMatch);
			if (isMatch) {
				return i;
			}
		}
		return -1;
	}

	public static int countOccurrences(int[] arr, int target) {
		validateArray(arr);

		int count = 0;
		System.out.println("Count = " + count);
		for (int value : arr) {
			boolean isMatch = value == target;
			System.out.printf("%d == %d? %b %n", value, target, isMatch);

			if (isMatch) {
				count++;
				System.out.printf("Count = %d %n", count);
			}
		}

		return count;
	}
}
