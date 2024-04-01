import java.util.Scanner;

public class E07_LeyvaG {

	// Declarem les constants dels diferents IVA
	public static final float IVA_SUPER_REDUIT = 4f;
	public static final float IVA_REDUIT = 8f;
	public static final float IVA_GENERAL = 21f;

	public static void main(String[] args) {

		// Iniciem l'scanner per llegir l'usuari
		Scanner lector = new Scanner(System.in);

		float preuBase;

		// Comprovem si el preu no es negatiu
		do {
			System.out.println("Introdueixi el preu base del producte");
			preuBase = lector.nextFloat();
			if (preuBase < 0) {
				System.out.println("El preu no pot ser inferior a 0.");
			}

		} while (preuBase < 0);

		lector.nextLine();

		// Comprovem si el número d'unitats no es negatiu
		int unitats;

		do {
			System.out.println("Introdueixi el número d'unitats");
			// Llegim el valor de l'usuari
			unitats = lector.nextInt();
			if (unitats < 0) {
				System.out.println(
						"El número d'unitats no pot ser inferior a 0.");
			}
		} while (unitats < 0);

		lector.nextLine();

		// Mostrem a l'usuari les diferents categories
		int categoria;

		// Verifiquem amb un bucle do-while si l'usuari introdueix un número
		// enter que no estigui comprés entre 0-6.
		do {

			System.out.println("Seleccioni la categoria: ");
			System.out.println("[1]Medicaments");
			System.out.println("[2]Farines");
			System.out.println("[3]Medicaments Veterinaris");
			System.out.println("[4]Aigues");
			System.out.println("[5]Cosmètics");
			System.out.println("[6]Begudes alcohòliques");

			// Llegim el valor de l'usuari
			categoria = lector.nextInt();
			lector.nextLine();

			if (categoria < 1 || categoria > 6) {
				System.out.println(
						"L'opció introduida es incorrecte, ha de ser entre 1-6.");
			}

		} while (categoria < 1 || categoria > 6);

		float preuFinalSenseIva = preuBase * unitats;
		float preuFinalAmbIva = 0f;
		float costEnviament = 0f;

		// Assignem el tipos d'IVA segons la categoria escolida
		switch (categoria) {
			case 1 :
			case 2 :
				preuFinalAmbIva = preuFinalSenseIva
						* (1 + (IVA_SUPER_REDUIT / 100));
				System.out.println("S'aplica un IVA superreduït (4%)");
				System.out.println(
						"El preu final amb l'IVA es: " + preuFinalAmbIva);
				break;
			case 3 :
			case 4 :
				preuFinalAmbIva = preuFinalSenseIva * (1 + (IVA_REDUIT / 100));
				System.out.println("S'aplica un IVA reduït (8%)");
				System.out.println(
						"El preu final amb l'IVA es: " + preuFinalAmbIva);
				break;
			case 5 :
			case 6 :
				preuFinalAmbIva = preuFinalSenseIva * (1 + (IVA_GENERAL / 100));
				System.out.println("S'aplica un IVA general (21%)");
				System.out.println(
						"El preu final amb l'IVA es: " + preuFinalAmbIva);
				break;
			default :
				System.out.println("Número de categoria incorrecte");
				break;
		};

		// Determinem el cost d'enviament segons el preuFinalSenseIva
		if (preuFinalSenseIva <= 100) {
			costEnviament = 3;
			System.out.println(
					"El cost d'enviament es de: " + costEnviament + " euros. ");
		}

		else if (preuFinalSenseIva >= 100 && preuFinalSenseIva <= 500) {
			costEnviament = 20;
			System.out.println(
					"El cost d'enviament es de: " + costEnviament + " euros. ");
		}

		else if (preuFinalSenseIva > 500) {
			costEnviament = 50;
			System.out.println(
					"El cost d'enviament es de: " + costEnviament + " euros. ");
		} ;

		// Tanquem l'scanner
		lector.close();
	}
}