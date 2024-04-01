import java.util.Scanner;

public class E3_LeyvaG {

	// Declarem la constat llargada que es la mateixa per les dues piscines

	private static final float LLARGADA_PISCINA = 300.3F;

	public static void main(String[] args) {

		// Construim l'objecte entrada

		Scanner entrada = new Scanner(System.in);

		// Calcul area Piscina 1
		System.out.println("Introduexi l'ample de la Piscina 1");
		float realAmplP1 = entrada.nextFloat();
		float realAreaP1 = realAmplP1 * LLARGADA_PISCINA;
		int enterAreaP1 = (int) realAreaP1;
		System.out.println("L'area de la Piscina 1 es: " + enterAreaP1);

		// Calcul del volum de la Piscina 1
		System.out.println("Introduexi la profunditat de la Piscina 1");
		float realProfunditatP1 = entrada.nextFloat();
		int enterProfunditatP1 = (int) realProfunditatP1;
		int enterVolumP1 = enterAreaP1 * enterProfunditatP1;
		System.out.println("El volum de la Piscina 1 es: " + enterVolumP1);

		// Calcul area Piscina 2

		System.out.println("Introduexi l'ample de la Piscina 2");
		float realAmplP2 = entrada.nextFloat();
		float realAreaP2 = realAmplP2 * LLARGADA_PISCINA;
		int enterAreaP2 = (int) realAreaP2;
		System.out.println("L'area de la Piscina 2 es: " + enterAreaP2);

		// Calcul del volum de la Piscina 2

		System.out.println("Introduexi la profunditat de la Piscina 2");
		float realProfunditatP2 = entrada.nextFloat();
		int enterProfunditatP2 = (int) realProfunditatP2;
		int enterVolumP2 = enterAreaP2 * enterProfunditatP2;
		System.out.println("El volum de la Piscina 2 es: " + enterVolumP2);

		// Recalculem el volum després d'invertir els valors de les profunditats
		int enterProfunditatAux = enterProfunditatP1;
		enterProfunditatP1 = enterProfunditatP2;
		enterProfunditatP2 = enterProfunditatAux;
		enterVolumP1 = enterAreaP1 * enterProfunditatP1;
		enterVolumP2 = enterAreaP2 * enterProfunditatP2;
		System.out.println("El volum de la Piscina 1 es: " + enterVolumP1
				+ "y el de la Piscina 2 es: " + enterVolumP2);

	}

}
