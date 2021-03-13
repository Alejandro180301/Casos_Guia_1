package com.datos;

import java.util.Scanner;

public class Caso_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inrese lado 1: ");
		int lado1 = sc.nextInt();
		
		System.out.print("Inrese lado 2: ");
		int lado2 = sc.nextInt();

		int area = lado1 * lado2;
		int perimetro = (lado1 * 2) + (lado2 * 2);
		
		System.out.println("\n--- R E S U L T A D O S ---");
		System.out.println("Área del rectangulo: " + area);
		System.out.println("Perímetro del rectangulo: " + perimetro);
	}
}