/**
 * 
 */
package calculadora;

import javax.swing.JOptionPane;

/**
 * @author Juan Raúl Crespo
 *
 */
public class Calcular {

	public static int suma(int numero1, int numero2) {
		return numero1 + numero2;
	}

	public static int resta(int numero1, int numero2) {
		return numero1 - numero2;
	}

	public static int multiplicacion(int numero1, int numero2) {
		return numero1 * numero2;
	}

	public static double division(int numero1, int numero2) {
		return (double) numero1 / numero2;
	}

	public static void main(String[] args) {

		int numero1 = 0;
		int numero2 = 0;
		
		Calculadora calcula = new Calculadora(numero1, numero2);

		calcula.setNumero1(Integer.parseInt(JOptionPane.showInputDialog("Introduce en primer número")));
		calcula.setNumero2(Integer.parseInt(JOptionPane.showInputDialog("Introduce en segundo número")));

		System.out.println("La suma de " + calcula.getNumero1() + " + " + calcula.getNumero2() + " es "
				+ suma(calcula.getNumero1(), calcula.getNumero2()));
		
		System.out.println("La resta de " + calcula.getNumero1() + " - " + calcula.getNumero2() + " es "
				+ resta(calcula.getNumero1(), calcula.getNumero2()));
		
		System.out.println("La multiplicación de " + calcula.getNumero1() + " * " + calcula.getNumero2() + " es "
				+ multiplicacion(calcula.getNumero1(), calcula.getNumero2()));
		
		System.out.println("La division de " + calcula.getNumero1() + " / " + calcula.getNumero2() + " es "
				+ division(calcula.getNumero1(), calcula.getNumero2()));

	}

}
