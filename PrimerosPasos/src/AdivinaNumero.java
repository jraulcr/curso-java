import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mabera
 *
 */
public class AdivinaNumero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int aleatorio = (int) (Math.random()*100); 

		Scanner entrada = new Scanner(System.in);
		
		int numero=0;
		
		int intentos=0;
		
		//while (numero!=aleatorio) {
		do {
			intentos++;
			
			System.out.println("Introduce un número,  por favor");
			
			numero=entrada.nextInt(); 
			
			if (aleatorio<numero) {
				
				System.out.println("Mas bajo");
				
			} else if (aleatorio>numero) {
				
				System.out.println("Mas alto");
				
			}
		} while (numero!=aleatorio);
		
		System.out.println("Correcto. Lo has conseguido en " + intentos + " intentos");

	}
}
