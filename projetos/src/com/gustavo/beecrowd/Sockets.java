package com.gustavo.beecrowd;

import java.util.Scanner;

public class Sockets {

	// Problem: A room has only a single power outlet. A group of individuals
	// decided to connect multiple power strips together in series to increase the
	// number of available sockets. Based on the number of sockets per power strip
	// provided by the user, calculate the total number of available outlets in the
	// end. x >= 2 && x <= 6 (x = sockets per power strip)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] sockets = new int[4];
		System.out.println("Inform the number of sockets per power strip: (>= 2; <= 6)");
		for (int i = 0; i < sockets.length; i++) {
			sockets[i] = sc.nextInt();
		}

		int total = calculateSockets(sockets);
		System.out.println(total);

		sc.close();

	}

	public static int calculateSockets(int[] arr) {
		int amount = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			amount += arr[i] - 1;
		}

		return amount += arr[arr.length - 1];
	}

}
