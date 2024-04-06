import java.util.Scanner;

public class ProjecteSalut1 {

	// Aqui declarem les constants

	public static boolean numSencer;

	// Límits

	public static final int MIN_TIS = 100000;
	public static final int MAX_TIS = 999999;

	public static final int MIN_SIMPTOMA = 0;
	public static final int MAX_SIMPTOMA = 3;

	public static final int MIN_EXPLORACIO = 0;
	public static final int MAX_EXPLORACIO = 3;

	public static final int MIN_PRIORITAT = 0;
	public static final int MAX_PRIORITAT = 5;

	public static final int MIN_TEMP = 27;
	public static final int MAX_TEMP = 45;

	// Simptomes

	public static final String DOLOR = "Dolor";
	public static final String LESIO_TRAUMATICA = "Lesió traumàtica";
	public static final String FEBRE_ALTA = "Febre alta";
	public static final String CONFUSIO = "Confusió o desorientació";

	// Exploracions Dolor

	public static final String TORACIC = "Dolor toràcic";
	public static final String ABDOMINAL = "Dolor abdominal";
	public static final String CAP = "Dolor cap";
	public static final String MIGRANYA = "Migranya";

	// Exploracions Lesió trauma

	public static final String OSSIA = "Fractura òssia";
	public static final String BALA = "Ferida de bala";
	public static final String CREMADA = "Cremada";
	public static final String CEREBRAL = "Lesió cerebral traumàtica";

	// Exploracions Febre alta

	public static final String PNEUMONIA = "Pneumònia";
	public static final String MENINGITIS = "Meningitis";
	public static final String INFECCIO = "Infecció Viral";
	public static final String ALERGIA = "Reacció alérgica";

	// Exploracions CiD

	public static final String INTOXICACIO = "Intoxicació per drogues o alcohol";
	public static final String DESHIDRATACIO = "Deshidratació severa";
	public static final String ACCIDENT_CV = "Accident cerebrovascular";
	public static final String HIPOGLUCEMIA = "Hipoglucèmia severa";

	// Aquí les variables

	public static String simptoma;
	public static String exploracio;
	public static int TIS;
	public static int numSimptoma;
	public static int numExploracio;
	public static int nivellPrioritat;
	public static int temperaturaActual;

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("TIS?");

		boolean isError = false; // variable per fer tracking dels errors (no
									// sencer o fora de rang), la iniciem en
									// FALSE

		isError = !entrada.hasNextInt(); // si no es sencer es registra...

		if (!isError) { // si no hi ha errors, seguim...
			TIS = entrada.nextInt();
			isError = TIS < MIN_TIS || TIS > MAX_TIS;

			if (!isError) { // si no hi ha errors seguim...
				System.out.println("\nSímptoma?:");
				System.out.println("  " + DOLOR + "(0)");
				System.out.println("  " + LESIO_TRAUMATICA + "(1)");
				System.out.println("  " + FEBRE_ALTA + "(2)");
				System.out.println("  " + CONFUSIO + "(3)");
				isError = !entrada.hasNextInt();
			}

			if (!isError) {
				numSimptoma = entrada.nextInt();
				isError = numSimptoma < MIN_SIMPTOMA
						|| numSimptoma > MAX_SIMPTOMA;
			}

			if (!isError) {
				System.out.println("\nExploració?:");
				switch (numSimptoma) {

					case 0 :
						simptoma = DOLOR;
						System.out.println("  " + TORACIC + "(0)");
						System.out.println("  " + ABDOMINAL + "(1)");
						System.out.println("  " + CAP + "(2)");
						System.out.println("  " + MIGRANYA + "(3)");

						break;

					case 1 :
						simptoma = LESIO_TRAUMATICA;
						System.out.println("  " + OSSIA + "(0)");
						System.out.println("  " + BALA + "(1)");
						System.out.println("  " + CREMADA + "(2)");
						System.out.println("  " + CEREBRAL + "(3)");

						break;

					case 2 :
						simptoma = FEBRE_ALTA;
						System.out.println("  " + PNEUMONIA + "(0)");
						System.out.println("  " + MENINGITIS + "(1)");
						System.out.println("  " + INFECCIO + "(2)");
						System.out.println("  " + ALERGIA + "(3)");

						break;

					case 3 :
						simptoma = CONFUSIO;
						System.out.println("  " + INTOXICACIO + "(0)");
						System.out.println("  " + DESHIDRATACIO + "(1)");
						System.out.println("  " + ACCIDENT_CV + "(2)");
						System.out.println("  " + HIPOGLUCEMIA + "(3)");

						break;
				}
				isError = !entrada.hasNextInt();
			}

			if (!isError) {
				numExploracio = entrada.nextInt();
				isError = numExploracio < MIN_EXPLORACIO
						|| numExploracio > MAX_EXPLORACIO;

			}

			if (!isError) {

				switch (numSimptoma) {
					case 0 :
						switch (numExploracio) {
							case 0 :
								exploracio = TORACIC;
								break;
							case 1 :
								exploracio = ABDOMINAL;
								break;
							case 2 :
								exploracio = CAP;
								break;
							case 3 :
								exploracio = MIGRANYA;
								break;
						}
						break;
					case 1 :
						switch (numExploracio) {
							case 0 :
								exploracio = OSSIA;
								break;
							case 1 :
								exploracio = BALA;
								break;
							case 2 :
								exploracio = CREMADA;
								break;
							case 3 :
								exploracio = CEREBRAL;
								break;
						}

						break;
					case 2 :
						switch (numExploracio) {
							case 0 :
								exploracio = PNEUMONIA;
								break;

							case 1 :
								exploracio = MENINGITIS;
								break;

							case 2 :
								exploracio = INFECCIO;
								break;

							case 3 :
								exploracio = ALERGIA;
								break;
						}
						break;
					case 3 :
						switch (numExploracio) {
							case 0 :
								exploracio = INTOXICACIO;
								break;

							case 1 :
								exploracio = DESHIDRATACIO;
								break;

							case 2 :
								exploracio = ACCIDENT_CV;
								break;

							case 3 :
								exploracio = HIPOGLUCEMIA;
								break;
						}
						break;

				}

				System.out.println("Nivell de prioritat?:");
				isError = !entrada.hasNextInt();
			}

			if (!isError) {
				nivellPrioritat = entrada.nextInt();
				isError = nivellPrioritat < MIN_PRIORITAT
						|| nivellPrioritat > MAX_PRIORITAT;
			}

			if (!isError) {
				System.out.println("Temperatura actual?");
				isError = !entrada.hasNextInt();
			}

			if (!isError) {
				temperaturaActual = entrada.nextInt();
				isError = temperaturaActual < MIN_TEMP
						|| temperaturaActual > MAX_TEMP;

			}

			if (isError) {
				System.out.println("Error de dades");
			} else {
				System.out.printf("%-8s %-25s %-35s %-15s %-10s", "TIS",
						"Símptoma", "Exploració", "Nivell prioritat",
						"Temperatura actual\n");
				System.out.printf("%-8s %-25s %-35s %-16s %-12s", TIS, simptoma,
						exploracio, nivellPrioritat, temperaturaActual);
			}

		}

	}
}
