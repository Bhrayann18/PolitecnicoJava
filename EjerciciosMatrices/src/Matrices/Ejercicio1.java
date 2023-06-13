package Matrices;

public class Ejercicio1 {

	public static void main(String[] args) {

		int filas = 4;

		int columnas = 3;

		int aux = 0;

		int matrizUno[][] = new int[filas][columnas];
		int matrizDos[][] = new int[filas][columnas];
		int matrizTres[][] = new int[filas][columnas];

		for (int i = 0; i < filas; i++) {

			for (int j = 0; j < columnas; j++) {

				aux = (int) (Math.random() * 100);
				if (aux % 2 == 0) {

					matrizUno[i][j] = aux;
				} else {
					j--;
				}

			}
		}
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				aux = (int) (Math.random() * 50);
				if (aux % 2 != 0) {
					matrizDos[i][j] = aux;
				} else {
					j--;
				}
			}
		}
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				matrizTres[i][j] = matrizUno[i][j] + matrizDos[i][j];
			}
		}
		System.out.println("Matriz A:");
		System.out.println();

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print(matrizUno[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Matriz B");
		System.out.println();
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print(matrizDos[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Suma");
		System.out.println();
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print(matrizTres[i][0] + " ");
			}
			System.out.println();
		}
	}

}
