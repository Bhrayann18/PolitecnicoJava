package SwitchCase;

public class Ejercicio1 {

	public static void main(String[] args) {

		int tipo = 3;


		switch (tipo) {
		case 0:
			System.out.println("No se ha establecido el valor");
			break;
		case 1:
			System.out.println("Agua");
			break;
		case 2:
			System.out.println("Gasolina");
			break;
		case 3:
			System.out.println("Hormigon");
			break;
		default:
			System.out.println("No se ha establecido el valor");
		}
	}

}
