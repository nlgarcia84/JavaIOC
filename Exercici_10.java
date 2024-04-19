import java.util.Scanner;

public class Exercici_10 {

	public static final int VMIN = 5;
	public static final int VMAX = 10;

	public static void main(String[] args) {

		int acumulador = 0;

		// BUCLE DO WHILE PER REPETIR DOS COPS LA PART A-B
		do {
			Scanner lector = new Scanner(System.in);
			int valorUsuari = 0;
			boolean valorNOk = true;
			int intentsRestants = 3;

			while (valorNOk) {

				do {
					System.out
							.print("Introdueix un valor enter entre 0 i 10: ");
					valorUsuari = lector.nextInt();

					lector.nextLine();
					intentsRestants--;

					if (valorUsuari == -1) {
						// COMPROVEM SI EL VALORUSUARI ES -1
						System.out.println("Error, el valor es -1.");
						valorNOk = false;
						// COMPROVEM SI ESTÁ FORA DEL RANG DEMANAT
					} else if ((valorUsuari < VMIN || valorUsuari > VMAX)

							&& intentsRestants >= 1) {
						System.out.println("Error, et queden " + intentsRestants
								+ " intents.");
						// COMPROVEM SI ESTÁ DINS DEL RANG DEMANAT I ENCARA HI
						// HA INTENTS
					} else if ((valorUsuari >= VMIN || valorUsuari <= VMAX)
							&& intentsRestants >= 0) {
						System.out.println(
								"Dada correcta. Has escrit " + valorUsuari);
						valorNOk = false;
						// COMPROVEM SI HA GASTAT ELS INTENTS, EN CAS AFIRMATIU
						// TREIEM DEL PROG
					} else if (intentsRestants == 0) {
						System.out.println("No tens més intents.");
						valorNOk = false;
					} else {
						valorNOk = false;
					}
					// FORA DEL BUCLE COMPROVEM QUE NO ES -1 Y QUE EÑS INTENTS
					// RESTANTS SON DIFERENTS DE 0
				} while (((valorUsuari < VMIN && valorUsuari != -1)
						|| (valorUsuari > VMAX)) && intentsRestants != 0);
				// SI EL VALOR NO ES -1 I HI HA 0 O MÉS INTENTS TREIEM ELS
				// SENARS ENTRE 0 Y VALORUSUARI I ELS SUMEM

				if (valorUsuari != -1 && intentsRestants >= 0) {
					System.out.println("Els números senars entre 0 i "
							+ valorUsuari + " son:");
					int suma = 0;
					for (int i = 0; i <= valorUsuari; i++) {

						if (i % 2 != 0) {
							suma += i;
							System.out.print(i + ", ");
						}
					}
					System.out.println("y la suma d'ells es: " + suma);
				}

			}
			acumulador++;
			// EL BUCLE FARA DOS VOLTES
		} while (acumulador < 2);
	}

}
