public class Matematicas {	
	public static boolean esPar (int numero) {
		boolean esPar = false;
		if (numero % 2 == 0)
			esPar = true;
		return esPar;
		}
	public static boolean esDivisiblePorTres (int numero) {
		boolean esDivisiblePorTres = false;
		if (numero % 3 == 0)
			esDivisiblePorTres = true;
		return esDivisiblePorTres;
	}
	public static boolean esDivisiblePorCinco (int numero) {
		boolean esDivisiblePorCinco = false;
		if (numero % 5 == 0)
			esDivisiblePorCinco = true;
		return esDivisiblePorCinco;
	}
}
