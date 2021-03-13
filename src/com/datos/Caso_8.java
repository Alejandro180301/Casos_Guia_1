package com.datos;

import java.util.Scanner;

public class Caso_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inrese lado: ");
		int lado = sc.nextInt();

		int area = (int) Math.pow(lado, 2);
		int perimetro = lado * 4;
		
		System.out.println("\n--- R E S U L T A D O S ---");
		System.out.println("Área del cuadrado: " + area);
		System.out.println("Perímetro del cuadrado: " + perimetro);
	}
}