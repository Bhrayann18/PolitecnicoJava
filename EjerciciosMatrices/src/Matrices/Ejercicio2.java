package Matrices;

public class Ejercicio2 {

	public static void main(String[] args) {

		int numeros[][] = new int[5][3];
		int aux = 0;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				numeros[i][j] = (int) (Math.random() * 500);
				if (aux < numeros[i][j]) {

					aux = numeros[i][j];
				}

			}

		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(numeros[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.print("Numeros mayor " + aux);
	}

}
