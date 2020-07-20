/**
 * 
 */

/**
 * @author Juan Raúl Crespo
 *
 */
public class Operadores2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20, b = 10, c = 30, result;
		//el resultado obtiene el máximo de tres
		//numeros
		result = ((a > b) ? (a > c) ? a : 
		c : (b > c) ? b : c);
		System.out.println("Máximo de tres números = "+result);
	}
}
