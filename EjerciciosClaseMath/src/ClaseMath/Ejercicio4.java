package ClaseMath;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		double numero1 = Math.random()*50+1;
		double numero2 = Math.random()*50+1;
		
		int numero1Redondeado = (int)Math.ceil(numero1);
		int numero2Redondeado = (int)Math.round(numero2);
		
		System.out.println("Numero 1 ="+numero1Redondeado);
		System.out.println("Numero 2 ="+numero2Redondeado);
		
		System.out.println("Numero mayor es"+ Math.max(numero1, numero2));
		
	}

}
