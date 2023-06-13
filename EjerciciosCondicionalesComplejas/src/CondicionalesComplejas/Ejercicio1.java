package CondicionalesComplejas;

public class Ejercicio1 {

	public static void main(String[] args) {

		int edad = 16;

		if (edad >= 0 && edad <= 5) {

			System.out.println("infante");
		} else if (edad >= 6 && edad <= 10) {
			System.out.println("Niño");
		} else if (edad >= 11 && edad <= 15) {
			System.out.println("Pre adolecente");
		} else if (edad >= 16 && edad <= 18) {
			System.out.println("Adolecente");
		} else if (edad >= 19 && edad <= 25) {
			System.out.println("PreAdulto");
		} else if (edad >= 26 && edad <= 40) {
			System.out.println("Adulto");
		} else if (edad >= 41 && edad <= 55) {
			System.out.println("Pre anciano");
		} else if (edad >= 56) {
			System.out.println("Anciano");
		}

	}
}