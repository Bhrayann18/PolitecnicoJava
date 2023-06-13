package CiclosFor;

public class Ejercicio4 {

	public static void main(String[] args) {

		int numero = 2;

		int sumaIteracciones = 0;

		for (int i = 0; i <= numero; i++) {

			sumaIteracciones = sumaIteracciones + i;
		}
		System.out.println("Suma de las iteracciones es " + sumaIteracciones);
		System.out.println("La raiz cuadrada es: " + Math.sqrt(sumaIteracciones));
		System.out.println("Numero aleatorio " + Math.random() * sumaIteracciones);

		System.out.println("Divisores");

		for (int i = 1; i <= sumaIteracciones; i++) {

			if (numero % i == 0) {

				System.out.print(i + "");
			}
		}
		int suma = 0;
		for (int i = 1; i < sumaIteracciones; i++) {

			if (sumaIteracciones % i == 0) {

				suma = suma + i;

			}
		}
		if (suma == sumaIteracciones) {

			System.out.println(sumaIteracciones + " Es good");
		} else {
			System.out.println(sumaIteracciones + " No es good");
		}
		int factorial = 1;

		for (int i = sumaIteracciones; i > 0; i--, numero--) {

			factorial = factorial * sumaIteracciones;
		}
		System.out.println("El factorial es:" + factorial);
	}
}
