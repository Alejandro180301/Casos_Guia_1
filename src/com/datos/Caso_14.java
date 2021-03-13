package com.datos;

import java.util.Scanner;

public class Caso_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese número: ");
		int n = sc.nextInt();
		
		int sumatoria = (n * (n + 1)) / 2;
		
		System.out.println("\n--- R E S U L T A D O S ---");
		System.out.println("Sumatoria: " + sumatoria);
	}
}