import java.util.Scanner;


public class damecadena {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("dame una cadena");
		Scanner teclado=new Scanner(System.in);
		String cadena;
		int longitud;
		cadena=teclado.nextLine();
		longitud=cadena.length();
		System.out.println("longitud de cadena es "+longitud);
		teclado.close();
	}

}
