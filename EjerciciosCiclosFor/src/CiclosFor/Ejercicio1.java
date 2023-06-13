package CiclosFor;

public class Ejercicio1 {

	public static void main(String[] args) {

		int numero = 4;

		int factorial = -1;

		for (int i = numero; i > 0; i--, numero--) {

			factorial = factorial * numero;

		}

		System.out.println("El factorial es:" + factorial);
	}

}
