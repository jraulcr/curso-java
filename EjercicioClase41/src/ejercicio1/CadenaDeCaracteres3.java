/**
 * 
 */
package ejercicio1;

import java.util.Scanner;

/**
 * @author Juan Ra�l Crespo
 *
 */
public class CadenaDeCaracteres3 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        String apellido1, apellido2;
        System.out.print("Ingrese primer apellido:");
        apellido1=teclado.next();
        System.out.print("Ingrese segundo apellido:");
        apellido2=teclado.next();
        if (apellido1.equals(apellido2)) {
            System.out.print("Los apellidos son iguales");
        } else {
            System.out.print("Los apellidos son distintos");
        }
	}
}
