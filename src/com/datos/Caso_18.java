package com.datos;

import java.util.Scanner;

public class Caso_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inrese altura del triangulo: ");
		int altura = sc.nextInt();
		
		System.out.print("Inrese base de triangulo: ");
		int base = sc.nextInt();
		
		float area = (altura * base) / 2;
		
		System.out.println("\n--- R E S U L T A D O ---");
		System.out.println("Área del triangulo: " + area);
	}
}