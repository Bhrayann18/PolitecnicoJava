package Matrices;

public class Ejercicio3 {

	public static void main(String[] args) {

		int matriz[][] = new int[3][4];

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 4; j++) {
				matriz[i][j] = (int) (Math.random() * 500);

			}

		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Fila");
		for (int i = 0; i < 4; i++){
			System.out.print(matriz[0][i]+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println("Columna");
		for (int i = 0; i < 3; i++) {
			System.out.println(matriz[i][1]+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println("Fila");
		for(int i = 0; i < 4; i++){
			System.out.print(matriz[2][i]+" ");
		}
	}

}
