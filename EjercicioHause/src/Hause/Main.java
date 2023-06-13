package Hause;

public class Main {

	public static void main(String[] args) {

		Hause hause = new Hause("Bogota","Miravalle","Rojo");
		Hause rancho = new Hause("Miravalle","Azul",3);
		Hause nido = new Hause(3,5,1,1);
		
		System.out.println("hause");
		System.out.println("Ciudad" + hause.getCiudad());
		System.out.println("Barrio" + hause.getBarrio());
		System.out.println("Color" + hause.getColor());
		System.out.println();
		System.out.println("rancho");
		System.out.println("Barrio" + rancho.getBarrio());
		System.out.println("Color" + rancho.getColor());
		System.out.println("Pisos" + rancho.getPisos());
		System.out.println();
		System.out.println("nido");
		System.out.println("Pisos" + nido.getPisos());
		System.out.println("Habitaciones" + nido.getHabitaciones());
		System.out.println("Baños" + nido.getBaños());
		System.out.println("Cocinas" + nido.getCocinas());

	}

}
