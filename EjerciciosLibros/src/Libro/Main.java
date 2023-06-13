package Libro;

public class Main {

	public static void main(String[] args) {
		
		Libro nacional = new Libro();
		
		
		nacional.setAutor("Gabriel Garcia Marquez");
		nacional.setTitulo("Cien Años De Soledad");
		nacional.setPaginas(482);
		
		
		nacional.mostrarLibro();
		
		
		Libro extranjero = new Libro();
		
		extranjero.setAutor("Reinhold Messner");
		extranjero.setTitulo("YETI: LEYENDA Y REALIDAD");
		extranjero.setPaginas(220);
		
		extranjero.mostrarLibro();
		
		System.out.println(nacional.compararLibros(nacional, extranjero));
	}

}
