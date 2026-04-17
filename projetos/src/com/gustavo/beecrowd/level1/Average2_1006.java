package com.gustavo.beecrowd.level1;

import java.util.Locale;
import java.util.Scanner;

public class Average2_1006 {
	// Problema: calcular a média de três notas, com peso
	// nota1 (A) - peso 2
	// nota2 (B) - peso 3
	// nota3 (C) - peso 5
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int p1 = 2;
		int p2 = 3;
		int p3 = 5;

		double a = sc.nextDouble() * p1;
		double b = sc.nextDouble() * p2;
		double c = sc.nextDouble() * p3;

		double average = (a + b + c) / (p1 + p2 + p3);

		System.out.println("MEDIA = " + String.format("%.1f", average));

		sc.close();
	}

}
