package CiclosFor;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int entero = 28;
		
		int suma =0;
		for(int i = 1; i<entero;i++) {
			
			if(entero % i ==0) {
				
				suma = suma +i;
			}
		}
		if(suma == entero) {
			
			System.out.println(entero+ " es good");
		}
		else {
			System.out.println(entero+ " no es good");
		}
	}

}
