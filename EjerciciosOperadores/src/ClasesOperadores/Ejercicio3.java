package ClasesOperadores;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int NumeroUno = 8;
		
		int NumeroDos = 2;
		
		
		int auxiliar = NumeroUno;
		
		NumeroUno = NumeroDos;
		
		NumeroDos = auxiliar;
		
		System.out.println("Numero uno es igual a="+NumeroUno);
		System.out.println("Numero Dos es igual a="+NumeroDos);
	}

}
