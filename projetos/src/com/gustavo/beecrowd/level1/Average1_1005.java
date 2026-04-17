package com.gustavo.beecrowd.level1;

import java.util.Locale;
import java.util.Scanner;

public class Average1_1005 {
	// Problema: calcular a média de duas notas (A e B) com peso 3.5 (A) e 7.5 (B)
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();

		double p1 = 3.5;
		double p2 = 7.5;

		double average = ((a * p1) + (b * p2)) / (p1 + p2);

		System.out.println("MEDIA = " + String.format("%.5f", average));

		sc.close();

	}

}
