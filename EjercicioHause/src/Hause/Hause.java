package Hause;

public class Hause {

	private String ciudad;
	private String barrio;
	private String color;;
	private int pisos;
	private int habitaciones;
	private int baños;
	private int cocinas;

	public Hause(String ciudad, String barrio, String color) {
		super();
		this.ciudad = ciudad;
		this.barrio = barrio;
		this.color = color;
	}

	public Hause(String barrio, String color, int pisos) {
		super();
		this.barrio = barrio;
		this.color = color;
		this.pisos = pisos;
	}

	public Hause(int pisos, int habitaciones, int baños, int cocinas) {
		super();
		this.pisos = pisos;
		this.habitaciones = habitaciones;
		this.baños = baños;
		this.cocinas = cocinas;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getBarrio() {
		return barrio;
	}

	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPisos() {
		return pisos;
	}

	public void setPisos(int pisos) {
		this.pisos = pisos;
	}

	public int getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(int habitaciones) {
		this.habitaciones = habitaciones;
	}

	public int getBaños() {
		return baños;
	}

	public void setBaños(int baños) {
		this.baños = baños;
	}

	public int getCocinas() {
		return cocinas;
	}

	public void setCocinas(int cocinas) {
		this.cocinas = cocinas;
	}

}
