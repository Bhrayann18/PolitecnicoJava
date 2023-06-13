package ClaseMath;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		double notaUno = (int)(Math.random()*10);
		double notaDos = (int)(Math.random()*10);
		double notaTres = (int)(Math.random()*10);
		double notaCuatro = (int)(Math.random()*10);
		double notaCinco = (int)(Math.random()*10);
	
		
		double promedio = (notaUno+notaDos+notaTres+notaCuatro+notaCinco)/5;
		
		System.out.println("Promedio:" + promedio);
	}

}
