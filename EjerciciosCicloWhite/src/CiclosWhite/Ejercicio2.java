package CiclosWhite;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		String palabra ="somos";
		String palindroma ="";
		int aux = palabra.length()-1;
		
		while(aux>=0) {
			palindroma = palindroma + palabra.charAt(aux);aux--;
		}
		if(palindroma.equals(palabra)) {
			System.out.println("Es palindroma");
		}
		else {
			System.out.println("No es palindroma");
		}
	}

}
