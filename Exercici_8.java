import java.util.Scanner;

public class Exercici_8 {

	public static int numeroBase;
	public static int multiplicador;
	public static boolean numEsSencer = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introdueix un valor sencer entre 1 i 20.");

		while (!numEsSencer) {

			numeroBase = entrada.nextInt();
			entrada.hasNextLine();
			if (numeroBase < 1 || numeroBase > 20) {
				System.out.println(
						"El número introduit no es correcte, torni a intentar");
			} else {
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
