/**
 * 
 */
package poo;

import javax.swing.JOptionPane;

/**
 * @author Mabera
 *
 */
public class UsoCoche {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Instanciar una clase o
		//Ejemplar de Clase
		
		Coche micoche = new Coche();
		
		micoche.establedeColor(JOptionPane.showInputDialog("Introduce color"));
		
		micoche.dimeDatosGenerales();
		 
		
	//	System.out.println("Este coche tiene: " + Renault.dimeLargo());
		
		System.out.println(micoche.dimeDatosGenerales());
		
		System.out.println(micoche.dimeColor());
		
		micoche.configuraAsientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
		
		System.out.println(micoche.dimeAsientos());
		
		micoche.configuraClimatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
		
		System.out.println(micoche.dimeClimatizador());
		
		System.out.println(micoche.dimePesoCoche());
		
		System.out.println("El precio final del coche es: " + micoche.precioCoche());
		
	} 

} 
