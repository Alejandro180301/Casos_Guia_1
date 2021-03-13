package com.datos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese Cantidad: ");
		int cantidad = sc.nextInt();
		
		System.out.print("Ingrese precio: ");
		float precio = sc.nextFloat();
		
		float importe1 = cantidad * precio;
		float importe2 = (float) (importe1 / 3.24);
		float importe3 = (float) (importe1 / 3.75);
		
		System.out.println("\n--- R E S U L T A D O S ---");
		System.out.println("Importe: " + df.format(importe1));
		System.out.println("En dolares: " + df.format(importe2));
		System.out.println("En Euros: " + df.format(importe3));
	}
}