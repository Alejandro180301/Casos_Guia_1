package com.datos;

import java.util.Scanner;

public class Caso_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float n1 = 0, n2 = 0;
		
		System.out.print("Primer número: ");
		n1 = sc.nextFloat();
		
		System.out.print("Segundo número: ");
		n2 = sc.nextFloat();
		
		System.out.println("--- Valores ingresados ---");
		System.out.println("Número 1: " + n1);
		System.out.println("Número 2: " + n2);
	}
}