package ClasesOperadores;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		int ladoCuadrado = 8;
		
		
		int area = ladoCuadrado * ladoCuadrado;
		
		int perimetro = ladoCuadrado + ladoCuadrado + ladoCuadrado + ladoCuadrado ;
		
		System.out.println("El area del cuadro es "+area);
		System.out.println("El area del cuadro es "+perimetro);
		
		
		int baseTriangulo = 9;
		int alturaTriangulo = 8;
		
		int ladoUnoTriangulo = 8;
		int ladoDosTriangulo =8;
		
		area = (baseTriangulo*alturaTriangulo)/2;
		perimetro = baseTriangulo + ladoUnoTriangulo + ladoDosTriangulo;
		
		System.out.println("Area del triangulo es igual a ="+area);
		System.out.println("Perimetro del triangulo es igual a ="+perimetro);
		
		int baseRectangulo = 8;
		int alturaRectangulo = 6;
		
		area = baseRectangulo * alturaRectangulo;
		
		perimetro = (2*alturaRectangulo)+(2*baseRectangulo);
		
		System.out.println("Area del rectangulo es igual a ="+area);
		System.out.println("Perimetro del rectangulo es igual a ="+perimetro);
		
	}

}
