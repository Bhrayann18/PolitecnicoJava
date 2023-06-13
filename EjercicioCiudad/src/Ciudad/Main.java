package Ciudad;

public class Main {

	public static void main(String[] args) {
		
		Ciudad Bogota = new Ciudad();
		
		Bogota.setNombre("Bogota");
		Bogota.setPoblacion(9000000);
		Bogota.setPais("Colombia");
		Bogota.setPresidente("Gustavo Petro");
		
		
		System.out.println("Ciudad = " +Bogota.getNombre());
		System.out.println("Poblacion = " +Bogota.getPoblacion());
		System.out.println("Pais = " + Bogota.getPais());
		System.out.println("Presidente = " + Bogota.getPresidente());
	}

}
