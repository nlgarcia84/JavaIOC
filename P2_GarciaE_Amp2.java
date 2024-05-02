/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class P2_GarciaE_Amp2 {
	public static final int MIN_TIS = 100000;
	public static final int MAX_TIS = 999999;
	public static final int MIN_SIMP = 0;
	public static final int MAX_SIMP = 3;
	public static final int MIN_EXP = 0;
	public static final int MAX_EXP = 3;
	public static final int MIN_PRI = 0;
	public static final int MAX_PRI = 5;
	public static final int MIN_TEMP = 27;
	public static final int MAX_TEMP = 45;
	public static void main(String[] args) {
		// Variables per emmagatzemar les dades

		Scanner scan = new Scanner(System.in);
		boolean error = true;
		boolean loop = true;
		int numPacients = 0;

		while (true) {

			while (loop) {
				int tis = 0, simptoma = 0, exploracio = 0, nivellPrioritat = 0,
						temperaturaActual = 0;
				int intntsTIS = 0, intntsSimp = 0, intntsExp = 0, intntsPri = 0,
						intntsTemp = 0;
				// Demanar i validar TIS
				while (intntsTIS < 3) {
					System.out.print("Targeta Individual Sanitaria (TIS?): ");
					tis = scan.nextInt();
					if (tis < MIN_TIS || tis > MAX_TIS) {
						System.out.println("Error: TIS fora de rang.");
						intntsTIS++;
						if (intntsTIS == 3) {
							System.out.print(
									"progrma finalitzat per error de dades");
							error = true;
							break;
						}
						continue;
					} else {
						break;
					}
				}
				if (error) {
					System.out.println("S'ha introduït" + numPacients
							+ "registre de pacients");
					break;
				}

				// Demanar i validar símptoma

				System.out.println("Símptoma?:");
				System.out.println(" Dolor (0)");
				System.out.println(" Lesió traumàtica (1)");
				System.out.println(" Febre alta (2)");
				System.out.println(" Confusió o desorientació (3)");
				System.out.print(": ");

				while (intntsSimp < 3) {
					simptoma = scan.nextInt();
					if (simptoma < MIN_SIMP || simptoma > MAX_SIMP) {
						System.out.println("Error: Síntoma fora de rang.");
						intntsSimp++;
						if (intntsSimp == 3) {
							System.out.print(
									"progrma finalitzat per error de dades");
							error = true;
							break;
						}
						continue;
					} else {
						break;
					}
				}
				if (error) {
					System.out.println("S'ha introduït" + numPacients
							+ "registre de pacients");
					continue;
				}

				System.out.println("Exploració inicial?:");
				switch (simptoma) {
					case 0 :
						System.out.println(" Dolor toràcic (0)");
						System.out.println(" Dolor abdominal (1)");
						System.out.println(" Dolor cap (2)");
						System.out.println(" Migraña (3)");
						break;
					case 1 :
						System.out.println(" Fractura òssia (0)");
						System.out.println(" Ferida de bala (1)");
						System.out.println(" Cremada (2)");
						System.out.println(" Lesió cerebral traumàtica (3)");
						break;
					case 2 :
						System.out.println(" Pneumònia (0)");
						System.out.println(" Meningitis (1)");
						System.out.println(" Infecció viral (2)");
						System.out.println(" Reacció al·lèrgica (3)");
						break;
					case 3 :
						System.out.println(
								" Intoxicació per drogues o alcohol (0)");
						System.out.println(" Deshidratació severa (1)");
						System.out.println(" Accident cerebrovascular (2)");
						System.out.println(" Hipoglucèmia severa (3)");
						break;

				}

				System.out.print(": ");
				while (intntsExp < 3) {
					exploracio = scan.nextInt();
					if (exploracio < MIN_EXP || exploracio > MAX_EXP) {
						System.out.println("Error: Exploració fora de rang.");
						intntsExp++;
						if (intntsExp == 3) {
							System.out.print(
									"progrma finalitzat per error de dades");
							error = true;
							break;
						}
						continue;
					} else {
						break;
					}
				}
				if (error) {
					System.out.println("S'ha introduït" + numPacients
							+ "registre de pacients");
					continue;
				}

				// Demanar i validar nivell de prioritat

				while (intntsPri < 3) {
					System.out.print("Nivell de prioritat?: ");
					nivellPrioritat = scan.nextInt();
					if (nivellPrioritat < MIN_PRI
							|| nivellPrioritat > MAX_PRI) {
						System.out.println(
								"Error: Nivell de prioritat fora de rang.");
						intntsPri++;
						if (intntsPri == 3) {
							System.out.print(
									"progrma finalitzat per error de dades");
							error = true;
							break;
						}
						continue;
					} else {
						break;
					}
				}
				if (error) {
					System.out.println("S'ha introduït" + numPacients
							+ "registre de pacients");
					continue;
				}

				// Demanar i validar temperatura actual
				while (intntsTemp < 3) {
					System.out.print("Temperatura actual?: ");
					temperaturaActual = scan.nextInt();
					if (temperaturaActual < MIN_TEMP
							|| temperaturaActual > MAX_TEMP) {
						System.out.println("Error: Temperatura fora de rang.");
						error = false;
						intntsTemp++;
						if (intntsTemp == 3) {
							System.out.print(
									"progrma finalitzat per error de dades");
							error = true;
							break;
						}
						continue;
					} else {
						break;
					}
				}
				if (error) {
					System.out.println("S'ha introduït" + numPacients
							+ "registre de pacients");
					continue;
				}

				// Mostrar resum de dades si no hi ha hagut errors

				System.out.println(
						"TIS\tSímptoma\tExploració\tNivell prioritat\tTemperatura actual");
				System.out.println(tis + "\t" + TextSimptoma(simptoma) + "\t"
						+ TextExploracio(simptoma, exploracio) + "\t\t"
						+ nivellPrioritat + "\t\t\t" + temperaturaActual);
				// sumar el numero de pacientes
				numPacients++;
				// Preguntar si se quiere introducir otro paciente
				System.out.print("un altre? (1: Sí / 0: No): ");
				int opcio = scan.nextInt();
				if (opcio == 1) {

					break;
				} else if (opcio == 0) {
					System.out.println("S'han introduït " + numPacients
							+ " registres de pacients");

					return;
				}
			}
		}
	}

	// el uso de return esta "prohibido" cierto, en su lugar deberia declarar
	// las opciones como
	// static final string y llamarlas desde aqui, tipo case 0:
	// nomsimptoma=DOLOR_NOM; break;
	// si lo hago asi la parte de exploracion no me va, sorry, return se queda
	// porque no soy mas listo
	private static String TextSimptoma(int simptoma) {
		switch (simptoma) {
			case 0 :
				return "Dolor";
			case 1 :
				return "Lesió traumàtica";
			case 2 :
				return "Febre alta";
			case 3 :
				return "Confusió o desorientació";
			default :
				return "";
		}
	}

	private static String TextExploracio(int simptoma, int exploracio) {
		switch (simptoma) {
			case 0 :
				switch (exploracio) {
					case 0 :
						return "Dolor toràcic";
					case 1 :
						return "Dolor abdominal";
					case 2 :
						return "Dolor cap";
					case 3 :
						return "Migraña";
				}
			case 1 :
				switch (exploracio) {
					case 0 :
						return "Fractura òssia";
					case 1 :
						return "Ferida de bala";
					case 2 :
						return "Cremada";
					case 3 :
						return "Lesió cerebral traumàtica";
				}
			case 2 :
				switch (exploracio) {
					case 0 :
						return "Pneumònia";
					case 1 :
						return "Meningitis";
					case 2 :
						return "Infecció viral";
					case 3 :
						return "Reacció al·lèrgica";
				}
			case 3 :
				switch (exploracio) {
					case 0 :
						return "Intoxicació per drogues o alcohol";
					case 1 :
						return "Deshidratació severa";
					case 2 :
						return "Accident cerebrovascular";
					case 3 :
						return "Hipoglucèmia severa";
				}
			default :
				return "";
		}
	}
}
