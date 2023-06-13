package CondicionalesComplejas;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int numeroUno =48;
		int numeroDos =48;
		int numeroTres =48;
		int mayor = numeroUno;
		
		if(numeroDos >mayor) {
			mayor = numeroDos;
			
		}
		if(numeroTres >mayor){
			mayor = numeroTres;
		}
		System.out.println("El numero mayor es " +mayor);
	}

}
