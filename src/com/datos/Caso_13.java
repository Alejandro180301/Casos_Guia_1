package com.datos;

import java.util.Scanner;

public class Caso_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese nomre: ");
		String nombre = sc.nextLine();
		
		System.out.print("Ingrese apellido: ");
		String apellido = sc.nextLine();
		
		System.out.println("\n--- R E S U L T A D O S ---");
		System.out.println("Alumno(a): " + nombre + " " + apellido);
	}
}