package ejercicio3;
/**
 * @author Juan Raul Crespo
 *
 */
import java.util.Scanner;

public class Sueldo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int horas;
		int sueldo;

		System.out.println("¿Cuantas horas has trabajado al mes? ");

		horas = entrada.nextInt();
		sueldo = horas * 10;

		System.out.println("Tu sueldo de este mes es de: " + sueldo + " €");

	}

}
