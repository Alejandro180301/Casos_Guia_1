package com.datos;

public class Caso_12 {

	public static void main(String[] args) {
		String frase = "ESCUELA DE TECNOLIGÍA E INFORMÁTICA";
		String pl1 = frase.substring(0, 7);
		String pl2 = frase.substring(11, 21);
		String pl3 = frase.substring(24, 35);
		
		System.out.println("\n--- R E S U L T A D O S ---");
		System.out.println("Plabra 1: " + pl1);
		System.out.println("Plabra 2: " + pl2);
		System.out.println("Plabra 3: " + pl3);
	}
}