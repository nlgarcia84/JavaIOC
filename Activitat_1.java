import java.util.Scanner;

public class Activitat_1 {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);

		System.out.println("Escriu un enter positiu superior a 1");

		boolean numCorrecte = false;

		while (!numCorrecte) {
			if (lector.hasNextInt()) {
				int numBase = lector.nextInt();
				lector.nextLine();

				numCorrecte = false;
			} else {
				System.out.println("El número no es sencer, torni a provar");
				lector.nextLine();
			}
		}

		System.out.println("El número es correcte");

	}

}
