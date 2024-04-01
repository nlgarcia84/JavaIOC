
public class PiscinasCalculos {
	
	// Funció per calcular l'àrea de la piscina escollida

	public static int areaPiscina(int largoPiscina, int anchoPiscina) {
		return largoPiscina * anchoPiscina;
	};
	
	// Funció per calcular el volum de la piscina
	
	public static int volumPiscina(int areaPiscina, int profunditatPiscina) {
		return areaPiscina * profunditatPiscina;
	};

	
	public static void main(String[]args) {
		
		// Declarem i inicialitzem variables
		
		int llargPiscina1 = 300;
		int llargPiscina2 = llargPiscina1;
		
		int amplePiscina1 = 150;
		int amplePiscina2 = 80;
		
		int profunditatPiscina1 = 20;
		int profunditatPiscina2 = 35;
		int profunditatAux = 20;
		 
		int llargadaTotal = llargPiscina2;
		int ampladaTotal = amplePiscina1 + amplePiscina2;
		
		
		// Calcul de les àrees
		
		int resultatAreaPiscina1 = PiscinasCalculos.areaPiscina(llargPiscina1, amplePiscina1);
		int resultatAreaPiscina2 = PiscinasCalculos.areaPiscina(llargPiscina2, amplePiscina2);
		
		int resultatAreaTotalPiscinesJuntes = resultatAreaPiscina1 + resultatAreaPiscina2;
		
		// Calcul dels volums
		
		int resultatVolumPiscina1 = PiscinasCalculos.volumPiscina(resultatAreaPiscina1, profunditatPiscina1);
		int resultatVolumPiscina2 = PiscinasCalculos.volumPiscina(resultatAreaPiscina2, profunditatPiscina2);
		int resultatVolumTotalPiscinesJuntes = resultatVolumPiscina1 + resultatVolumPiscina2;
		
		// Calcul dels volums invertint les variables profunditat
		
		int resultatVolumPiscina1Invers = PiscinasCalculos.volumPiscina(resultatAreaPiscina1, profunditatPiscina2);
		int resultatVolumPiscina2Invers = PiscinasCalculos.volumPiscina(resultatAreaPiscina2, profunditatAux);
		
		// Imprimim per consola els resultats
		
		System.out.println("1. El area de la Piscina  1 es igual a " + resultatAreaPiscina1 + " y el area de la Piscina  2 es igual a " + resultatAreaPiscina2 + ".");
		System.out.println("2. El volum de la Piscina  1 es igual a " + resultatVolumPiscina1 + " y el volum de la Piscina  2 es igual a " + resultatVolumPiscina2 + ".");
		System.out.println("3. Les dues piscines juntes tindrien una llargada total de " + llargadaTotal + " y una amplada total de " + ampladaTotal + ".");
		System.out.println("4. L'area total si estiguesin juntes les dues piscines seria de: " + resultatAreaTotalPiscinesJuntes + ".");
		System.out.println("5. El volum total si estiguesin juntes les dues piscines seria de: " + resultatVolumTotalPiscinesJuntes + ".");
		System.out.println("6. Si intercanviem la profunditat de les piscines, el volum de la Piscina 1 sería de: " + resultatVolumPiscina1Invers + " el llarg: " + llargPiscina1 + " i l'ample " + amplePiscina1);
		System.out.println("7. Si intercanviem la profunditat de les piscines, el volum de la Piscina 2 sería de: " + resultatVolumPiscina2Invers + " el llarg: " + llargPiscina2 + " i l'ample " + amplePiscina2);
		
	};
	
}
