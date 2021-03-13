package com.datos;

import java.util.Scanner;

public class Caso_19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inrese lado 1: ");
		int lado1 = sc.nextInt();
		
		System.out.print("Inrese lado 2: ");
		int lado2 = sc.nextInt();
		
		System.out.print("Inrese lado 2: ");
		int lado3 = sc.nextInt();
		
		int perimetro = lado1 + lado2 + lado3;
		
		System.out.println("\n--- R E S U L T A D O ---");
		System.out.println("Perímetro del triangulo: " + perimetro);
	}
}