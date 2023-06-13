package Vectores;

public class Ejercicio1 {

	public static void main(String[] args) {

		double persona[] = new double[5];

		float peso[] = { 55.9f, 45.5f, 67.3f, 89.4f, 45.3f };

		float promedio = 0.0f;

		int max = 0;
		int min = 0;

		for (int i = 0; i < persona.length; i++) {

			promedio = promedio + peso[i];
		}

		promedio = promedio / 5;

		for (int i = 0; i < peso.length; i++) {

			if (peso[i] > promedio) {

				max++;
			} else {
				min++;
			}
		}

		System.out.println("El promedio es :" + promedio);
		System.out.println("Por encima del promedio :" + max);
		System.out.println("Por debajo del promedio :" + min);

	}

}
