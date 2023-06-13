package CiclosWhite;

public class Ejercicio1 {

	public static void main(String[] args) {

		String palabra = "PROGRAMACION";
		String invertido = "";

		int aux = palabra.length() - 1;
		while (aux >= 0) {
			
			invertido = invertido + palabra.charAt(aux);aux--;
		}
		System.out.println(invertido);
	}

}
