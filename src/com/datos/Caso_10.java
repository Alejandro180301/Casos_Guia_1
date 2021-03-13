package com.datos;

import java.util.Scanner;

public class Caso_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inrese el radio: ");
		int radio = sc.nextInt();
		
		float pi = (float) 3.1416;

		float area = (float) (pi * Math.pow(radio, 2));
		float perimetro = (float) 2 * radio * pi;
		
		System.out.println("\n--- R E S U L T A D O S ---");
		System.out.println("Área del circulo: " + area);
		System.out.println("Perímetro del circulo: " + perimetro);
	}
}