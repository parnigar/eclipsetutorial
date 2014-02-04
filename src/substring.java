
public class substring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cad="Perico de los palotes";
		System.out.println("los 7 últimos caracteres son "+cad.substring(14));
		System.out.println("los 7 últimos caracteres son "+cad.substring(14,16));
		System.out.println(cad.toUpperCase());
		System.out.println(cad.toLowerCase());
		System.out.println("la cadena empieza por A? "+cad.startsWith("A"));
		System.out.println("la cadena termina por Z? "+cad.endsWith("Z"));
	}

}
