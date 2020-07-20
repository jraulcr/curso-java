/**
 * 
 */
package ejercicio2;

/**
 * @author Juan Raúl Crespo
 *
 */
public class Operators2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30;
		boolean condition = true;
		// operador de pre-incremento
		// a = a+1 y entonces c = a;
		c = ++a;
		System.out.println("Valor de c (++a) = " + c);
		// operador de post-incremento
		// c=b entonces b=b+1 (b pasa a ser 11)
		c = b++;
		System.out.println("Valor de c (b++) = " + c);
		// operador de pre-decremento
		// d=d-1 entonces c=d
		c = --d;
		System.out.println("Valor de c (--d) = " + c);
		// operador de post-decremento
		// c=e entonces e=e-1 (e pasa a ser 39)
		c = e--;
		System.out.println("Valor de c (e--) = " + c);
		// Operador lógico not
		System.out.println("Valor de !condition = " + !condition);
	}
}
