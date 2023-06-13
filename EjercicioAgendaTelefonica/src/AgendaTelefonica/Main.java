package AgendaTelefonica;

public class Main {

	public static void main(String[] args) {

		Agenda cuaderno = new Agenda();
		Contacto contacto = new Contacto();
		Contacto contacto1 = new Contacto();
		Contacto contacto2 = new Contacto();

		contacto.setNombre("Bhrayann");
		contacto.setNumero("3121543535");

		contacto1.setNombre("Andres");
		contacto1.setNumero("313242424");

		contacto2.setNombre("Juan");
		contacto2.setNumero("3211425355");

		cuaderno.registrarContacto(contacto);
		cuaderno.registrarContacto(contacto1);
		cuaderno.registrarContacto(contacto2);
		cuaderno.listarContactos();
		cuaderno.buscarContacto("Bhrayann");

		System.out.println("Contactos disponibles" + cuaderno.disponibles());
	}

}
