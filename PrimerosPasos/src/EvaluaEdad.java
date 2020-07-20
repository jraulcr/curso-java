import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mabera
 *
 */
public class EvaluaEdad {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce la edad, por favor: ");
		
		int edad = entrada.nextInt();
		
		if (edad >= 18) {
			
			System.out.println("Eres mayor de edad");	
			
		}else if(edad<40) {
			
			System.out.println("Eres joven");
			
		}else if(edad<65) {
			
			System.out.println("Eres maduro");
			
		}else {
			
			System.out.println("Cuidate");
			
		}
	}

}
