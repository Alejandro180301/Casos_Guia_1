package com.datos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese horas trabajadas: ");
		int horas = sc.nextInt();
		
		System.out.print("Ingrese tarifa por hora: ");
		float tarifa = sc.nextFloat();
		
		float sueldo = horas * tarifa;
		float bono = (float) (sueldo * 0.05);
		float total = sueldo + bono;
		float dolar = (float) (total / 3.24);
		
		System.out.println("\n--- R E S U L T A D O S ---");
		System.out.println("Sueldo: " + df.format(sueldo));
		System.out.println("Bono: " + df.format(bono));
		System.out.println("Total: " + df.format(total));
		System.out.println("Total en dolares: " + df.format(dolar));
	}
}