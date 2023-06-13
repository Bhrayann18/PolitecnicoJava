package SwitchCase;

public class Ejercicio2 {

	public static void main(String[] args) {

		int numero1 = 4;
		int numero2 = 2;
		char operador = '/';
		int resultado = 0;

		switch (operador) {
		case '+':

			resultado = numero1 + numero2;
			System.out.println("Suma " + resultado);
			break;
		case '-':
			resultado = numero1 - numero2;
			System.out.println("Resta " + resultado);
			break;
		case '*':
			resultado = numero1 * numero2;
			System.out.println("Multiplicacion " + resultado);
			break;
		case '/':
			resultado = numero1 / numero2;
			System.out.println("Division " + resultado);
			break;
		default:
			System.out.println("Error " + resultado);
		}
	}

}
