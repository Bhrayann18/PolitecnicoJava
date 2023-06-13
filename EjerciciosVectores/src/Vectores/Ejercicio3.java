package Vectores;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		String palabra = "electroencefalografista";
		
		
		char characteres[] = new char[palabra.length()];
		
		for (int i = 0; i < palabra.length(); i++) {
			
			characteres[i]=palabra.charAt(i);
		}
		
		for(int i = 0; i<characteres.length;i++) {
			
			System.out.println("Caracter "+characteres[i]);
		}
	}

}
