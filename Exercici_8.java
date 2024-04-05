import java.util.Scanner;

public class Exercici_8 {

	// Declarem les variables que utilitzarem durant el programa

	public static int numeroBase;
	public static int multiplicador;
	public static boolean numEsSencer = false;

	public static void main(String[] args) {

		// Iniciem l'objecte Scanner

		Scanner entrada = new Scanner(System.in);

		// Demanem a l'usuari que introdueixi el número

		System.out.println("Introdueix un valor sencer entre 1 i 20.");

		// Comprovem que el número que ens ha introduït es sencer

		while (!numEsSencer) {

			numeroBase = entrada.nextInt();
			entrada.hasNextLine();

			// Si no ho es li tornará a demanar constantment

			if (numeroBase < 1 || numeroBase > 20) {
				System.out.println(
						"El número introduit no es correcte, torni a intentar");
			} else {

				// Si ho es pasem a calcular els múltiples entre 0 i 100

				numEsSencer = true;

				while (multiplicador >= 0 && multiplicador <= 100) {

					multiplicador++;
					int multiple = numeroBase * multiplicador;
					System.out.println(multiple);
				}
			}
		}

	}

}
