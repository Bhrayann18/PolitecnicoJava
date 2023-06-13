package CondicionalesComplejas;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int numero = 2002;
		
		int cifras =(int)(Math.log10(numero)+1);
		
		if(cifras <=4) {
			System.out.println(cifras + " cifras ");
		}else {
			System.out.println(" 4 cifras ");
		}
	}

}
