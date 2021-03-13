package com.datos;

import java.util.Scanner;

public class Caso_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float n1 = 0, n2 = 0;
		
		System.out.print("Primer número: ");
		n1 = sc.nextFloat();
		
		System.out.print("Segundo número: ");
		n2 = sc.nextFloat();
		
		float promedio = (n1 + n2) / 2;
		float aumento = (n1 + n1 * 20/100);
		float disminusion = (n2 - n2 * 30/100);
		
		System.out.println("\n--- R E S U L T A D O S ---");
		System.out.println("Suma: " + promedio);
		System.out.println("Resta: " + aumento);
		System.out.println("Producto: " + disminusion);
	}
}