/**
 * 
 */

/**
 * @author Juan Ra�l Crespo
 *
 */
public class Operadores2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20, b = 10, c = 30, result;
		//el resultado obtiene el m�ximo de tres
		//numeros
		result = ((a > b) ? (a > c) ? a : 
		c : (b > c) ? b : c);
		System.out.println("M�ximo de tres n�meros = "+result);
	}
}
