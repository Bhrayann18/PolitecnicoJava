package CondicionalesSimples;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int numero = (int)(Math.random()*100);
		
		if(numero>50) {
			
			System.out.println("El numero " + numero + " es mayor a 50");
		}else
			System.out.println("El numero " + numero + " es menor a 50");
	}

}
