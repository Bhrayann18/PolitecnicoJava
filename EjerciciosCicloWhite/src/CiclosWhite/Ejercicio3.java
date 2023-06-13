package CiclosWhite;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		String frase = "Porta fames dis aenean platea neque semper? Conubia eleifend commodo maecenas\r\n"
				+ "risus risus pellentesque. Eros iaculis duis posuere integer purus euismod consequat.\r\n"
				+ "Vel congue curabitur penatibus ac mus nisi iaculis; scelerisque feugiat blandit molestie\r\n"
				+ "euismod. Tincidunt risus sociis nostra fermentum laoreet aliquet aptent est. Platea\r\n"
				+ "non proin aliquet scelerisque nam maecenas elit cum";
		
		int aux = frase.length()-1;
		int vocales = 0;
		
		while (aux>=0) {
			
			if(frase.charAt(aux)== 'a' || frase.charAt(aux)=='e'||frase.charAt(aux) == 'i'||frase.charAt(aux) == 'o' || frase.charAt(aux)=='u') {
				
				vocales++;
			}
			aux--;
		}
		System.out.println("La cantidad de vocales son "+vocales);
	}

}
