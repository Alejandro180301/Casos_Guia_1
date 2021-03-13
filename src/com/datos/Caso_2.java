package com.datos;

import java.util.Scanner;

public class Caso_2 {

	public static void main(String[] args) {
		// Crear la instancia para el objeto scanner
		Scanner sc = new Scanner(System.in);
		
		// Declarar y asignar un valor a una variable
		int n = 0;
		
		// Lectura de la variable
		System.out.print("Ingrese número: ");
		n = sc.nextInt();
		
		// Impresión del valor de la variable
		System.out.println("--- Valor ingresado ---");
		System.out.println("Número: " + n);
	}
}