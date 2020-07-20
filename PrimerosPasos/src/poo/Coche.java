/**
 * 
 */
package poo;

/**
 * @author Mabera
 *
 */
public class Coche {
	//Caracteristicas comunes o propiedades
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	String color;
	int pesoTotal;
	boolean asientosCuero, climatizador;
	 
//Establecemos el estado inicial del objeto Coche
	public Coche() {
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;
	}
	
	public String dimeLargo() { //Getter		
		return "El largo del coche es: " + largo;
	}
	
	public void establedeColor() { //Setter
		color="Azul";
	}
	
	public String dimeColor() { //Getter
		return "El color del coche es: " + color;
	}
}
