/**
 * 
 */

/**
 * @author Juan Raúl Crespo
 *
 */
public class Operadores {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 20, b = 10;
		//String x = "Thank", y = "Thank";
		int ar[] = { 1, 2, 3 };
		int br[] = { 1, 2, 3 };
		boolean condicion = true;
		// varios operadores condicionales
		System.out.println("a == b : " + (a == b));
		System.out.println("a < b : " + (a < b));
		System.out.println("a <= b : " + (a <= b));
		System.out.println("a > b : " + (a > b));
		System.out.println("a >= b : " + (a >= b));
		System.out.println("a != b : " + (a != b));
		// Los Arrays no se pueden comparar con
		// operadores relacionales porque los objetos
		// almacenan referencias, mas no el valor
		System.out.println("x == y : " + (ar == br));
		System.out.println("condicion==true : " + (condicion == true));

	}

}
