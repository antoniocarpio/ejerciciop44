public class TestMatematicas {
	public static void main(String[] arg) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Introduce un número: ");
		int numero = sc.nextInt();
		if (Matematicas.esPar(numero))
			System.out.println("El número "+numero+" es par");
		else
			System.out.println("El número "+numero+" NO es par");
	}
}
