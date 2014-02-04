import java.util.Scanner;

public class Erroresed {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n1, n2;
		int suma;
		int producto;
		System.out.println("Dame dos números");
		Scanner teclado = new Scanner(System.in);
		n1 = teclado.nextInt();
		n2 = teclado.nextInt();
		suma = n1 + n2;
		producto = n1 * n2;
		if (n1 > n2)
			System.out.println("Resultado " + suma);
		else
			System.out.println("Resultado " + producto);
		teclado.close();

	}

}
