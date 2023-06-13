package CondicionalesComplejas;

public class Ejercicio4 {

	public static void main(String[] args) {

		int preguntas = 10;
		int correctas = 9;

		double porcentaje = (correctas * 100) / preguntas;

		if (porcentaje >= 90) {
			System.out.println("Nivel maximo");
		} else if (porcentaje >= 75 && porcentaje < 90) {

			System.out.println("nivel medio");
		} else if (porcentaje >= 50 && porcentaje < 75) {
			System.out.println("nivel regular");
		} else if (porcentaje < 50) {
			System.out.println("Pailos");
		}
	}

}
