/**
 * 
 */
package poo;

/**
 * @author Mabera
 *
 */
public class Coche {
	// Caracteristicas comunes o propiedades
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	private String color;
	private int pesoTotal;
	private boolean asientosCuero, climatizador;

//Establecemos el estado inicial del objeto Coche
	public Coche() {
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;
	}

	public String dimeDatosGenerales() { // Getter
		return "La plataforma del vehículo tiene " + ruedas + " ruedas" + " Mide " + largo / 1000
				+ " metros, con un ancho de " + ancho + " cm y un peso de plataforma de " + peso_plataforma + " kg";
	}

	public void establedeColor(String colorCoche) { // Setter
		color = colorCoche;
		// color="Azul";
	}

	public String dimeColor() { // Getter
		return "El color del coche es: " + color;
	}

	public void configuraAsientos(String asientosCuero) { // Setter
		if (asientosCuero.equals("si")) {
			this.asientosCuero = true;
		} else {
			this.asientosCuero = false;
		}
	}

	public String dimeAsientos() { // Getter
		if (asientosCuero) {
			return "El coche tiene asientos de cuero";
		} else {
			return "El coche tiene asientos de serie";
		}
	}

	public void configuraClimatizador(String climatizador) { // Setter
		if (climatizador.equals("si")) {
			this.climatizador = true;
		} else {
			this.climatizador = false;
		}
	}

	public String dimeClimatizador() { // Getter
		if (climatizador) {
			return "El coche incorpora climatizador";
		} else {
			return "El coche lleva aire acondicionado";
		}
	}

	public String dimePesoCoche() {//Getter y Setter
		int pesoCarroceria = 500;
		pesoTotal = peso_plataforma + pesoCarroceria;
		if (asientosCuero) {
			pesoTotal = pesoTotal + 50;
		} else {
			pesoTotal = pesoTotal + 20;
		}
		return "El peso del coche es " + pesoTotal;
	}

	public int precioCoche() {//Getter
		int precioFinal = 10000;
		if (asientosCuero) {
			precioFinal += 200;
		} else {
			precioFinal += 1500;
		}
		return precioFinal;
	}
}
