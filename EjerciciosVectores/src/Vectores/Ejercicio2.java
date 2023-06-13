package Vectores;

public class Ejercicio2 {

	public static void main(String[] args) {

		double PromedioA = 0, PromedioB = 0, PromG = 0;
		

		double PromA = 0, PromB = 0;

		String estudiantesA[] = { "Uriel", "Edison", "Luis", "Kevin", "Erika", "Rojher", "Jose", "Walker", "Fodem",
				"Ake" };

		double notasA[] = { 10, 9, 5, 3, 8, 7, 10, 7, 10, 9 };

		String estudiantesB[] = { "David", "Bhrayann", "Neymar", "Messo", "Lampard", "Steve", "Hugo", "Harvets", "Luuk",
				"Robert" };

		double notasB[] = { 1, 10, 8, 2, 9, 6, 6, 7, 10, 10 };

		for (int i = 0; i < notasA.length; i++) {

			PromA = PromA + notasA[i];
			PromB = PromB + notasB[i];
		}

		PromedioA = PromA / 10;

		System.out.println("Promedio A: " + PromedioA);
		PromedioB = PromB / 10;
		System.out.println("Promedio B: " + PromedioB);

		PromG = (PromedioA + PromedioB) / 2;
		System.out.println("Promedio general: " + PromG);

		if (PromedioA > PromedioB) {

			System.out.println("El grupo con mejor promedio es el A");
		} else {
			System.out.println("El grupo con mejor promedio es el B");
		}

	}
}
