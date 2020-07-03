package ejercicio3;

import java.util.Scanner;

public class Sueldo {

	static Scanner entrada;

	public static void main(String[] args) {

		entrada = new Scanner(System.in);

		int horas;
		int sueldo;

		System.out.println("¿Cuantas horas has trabajado al mes? ");

		horas = entrada.nextInt();
		sueldo = horas * 10;

		System.out.println("Tu sueldo de este mes es de: " + sueldo + " €");

	}

}
