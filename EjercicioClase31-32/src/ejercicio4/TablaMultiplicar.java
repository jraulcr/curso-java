package ejercicio4;

import java.util.Scanner;

public class TablaMultiplicar {

	static Scanner entrada;

	public static void main(String[] args) {

		int tabla;

		int resultado;
		
		entrada=new Scanner(System.in);

		System.out.println("Introduce un número: ");

		tabla = entrada.nextInt();

		for (int i = 0; i <= 10; i++) {
			resultado = tabla * i;
			System.out.println(tabla + " X " + i + " = " + resultado);
		}

	}

}
