import java.util.Scanner;

public class E05_LeyvaG {

	public static void main(String[] args) {

		// Identificació del nen

		System.out.println(
				"Benvinguts pares!\n\nSi us plau introdueixin el NR (Número de Registre) de la inscripció del seu fill/a i pulseu ENTER.");

		Scanner entrada = new Scanner(System.in);

		int resultat = 0;
		int numRegistre = 0;

		// Comprovació sencer

		do {

			// Comprobem primerament que la entrada sigui sencer, si no es
			// sencer avisem
			// per consola i si ho es la guardem a la variable numRegistre i
			// continuem

			// Cas1: No es sencer

			if (entrada.hasNextInt() == false) {
				System.out.println(
						"No es sencer. Si us plau torni a introduir el seu NR.");
				entrada.next(); // netegem el buffer
			}

			// Cas 2: Es sencer, OK

			else {

				// Procedim a llegir l'entrada

				numRegistre = entrada.nextInt();
				entrada.nextLine();

				// Comprobem el rang del NR, si está fora ho fem saber per
				// consola, si no seguim

				if (numRegistre < 1 || numRegistre > 499) {
					System.out.println(
							"Fora de rang. Si us plau torni a introduir el seu NR, recordi que el número es entre 1 i 499.");

				} ;

			} ;

		} while (numRegistre < 1 || numRegistre > 499);

		// Inici del qüestionari

		System.out.println(
				"Gracies. A continuació haurá de respondre a un breu qüestionari. Per accedir pulsi ENTER.");

		entrada.nextLine();

		System.out.println(
				"¿Té el nen almenys un germà matriculat al centre?[0:No - 1:Si]");

		// Verificarem a cada pregunta si es sencer i es 0 o 1

		int resposta1 = 0;

		do {
			if (entrada.hasNextInt() == false) {
				System.out.println("Error, no es sencer");
				entrada.next(); // netegem el buffer
			}

			else {
				resposta1 = entrada.nextInt();
				entrada.nextLine();
				if (resposta1 != 0 && resposta1 != 1) {
					System.out.println("Error, no es 0 o 1");
				} ;
			} ;
		} while (resposta1 != 0 && resposta1 != 1);

		int bonusGerma = resposta1;

		if (bonusGerma == 1) {
			resultat += 40;
		} ;

		System.out.println(
				"¿Viu el nen a la mateixa població que vosté?[0:No - 1:Si]");

		int resposta2 = 0;

		do {
			if (entrada.hasNextInt() == false) {
				System.out.println("Error, no es sencer");
				entrada.next(); // netegem el buffer
			}

			else {
				resposta2 = entrada.nextInt();
				entrada.nextLine();
				if (resposta2 != 0 && resposta2 != 1) {
					System.out.println("Error, no es 0 o 1");
				} ;
			} ;
		} while (resposta2 != 0 && resposta2 != 1);

		int bonusPoblacioNen = resposta2;

		System.out.println(
				"¿El pare o mare treballa a la mateixa població?[0:No - 1:Si]");

		int resposta3 = 0;

		do {
			if (entrada.hasNextInt() == false) {
				System.out.println("Error, no es sencer, introdueixi de nou.");
				entrada.next(); // netegem el buffer
			}

			else {
				resposta3 = entrada.nextInt();
				entrada.nextLine();
				if (resposta3 != 0 && resposta3 != 1) {
					System.out
							.println("Error, no es 0 o 1, introdueixi de nou.");
				} ;
			} ;
		} while (resposta3 != 0 && resposta3 != 1);

		int bonusPoblacioPares = resposta3;

		if (bonusPoblacioNen == 1) {
			resultat += 30;
		} else if ((bonusPoblacioPares == 1)) {
			resultat += 20;
		} else if ((bonusPoblacioNen == 1) && (bonusPoblacioPares == 1)) {
			resultat += 30;
		} ;

		System.out.println(
				"Té alguna discapacitat igual o superior al 33% o  malaltia crònica?[0:No - 1:Si]");

		int resposta4 = 0;

		do {
			if (entrada.hasNextInt() == false) {
				System.out.println("Error, no es sencer, introdueixi de nou.");
				entrada.next(); // netegem el buffer
			}

			else {
				resposta4 = entrada.nextInt();
				entrada.nextLine();
				if (resposta4 != 0 && resposta4 != 1) {
					System.out
							.println("Error, no es 0 o 1, introdueixi de nou.");
				} ;
			} ;
		} while (resposta4 != 0 && resposta4 != 1);

		int bonusDiscapacitat = resposta4;

		if (bonusDiscapacitat == 1) {
			resultat += 10;
		} ;

		System.out.println(
				"Forma part d'una família nombrosa o monoparental?[0:No - 1:Si]");

		int resposta5 = 0;

		do {
			if (entrada.hasNextInt() == false) {
				System.out.println("Error, no es sencer, introdueixi de nou.");
				entrada.next(); // netegem el buffer
			}

			else {
				resposta5 = entrada.nextInt();
				entrada.nextLine();
				if (resposta5 != 0 && resposta5 != 1) {
					System.out
							.println("Error, no es 0 o 1, introdueixi de nou.");
				} ;
			} ;
		} while (resposta5 != 0 && resposta5 != 1);

		int bonusFamiliaNM = resposta5;

		if (bonusFamiliaNM == 1) {
			resultat += 15;
		} ;

		System.out.println(
				"El pare, mare, tutor legal o germà ha estat escolaritzat a la mateixa escola?[0:No - 1:Si]");

		int resposta6 = 0;

		do {
			if (entrada.hasNextInt() == false) {
				System.out.println("Error, no es sencer, introdueixi de nou.");
				entrada.next(); // netegem el buffer
			}

			else {
				resposta6 = entrada.nextInt();
				entrada.nextLine();
				if (resposta6 != 0 && resposta6 != 1) {
					System.out
							.println("Error, no es 0 o 1, introdueixi de nou.");
				} ;
			} ;
		} while (resposta6 != 0 && resposta6 != 1);

		int bonusPareMareEscola = resposta6;

		if (bonusPareMareEscola == 1) {
			resultat += 5;
		} ;

		System.out
				.println("Gracies.\n\nEl resultat obtingut es de: " + resultat);

	};

}
