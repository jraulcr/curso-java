/**
 * 
 */
package poo;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author Mabera
 *
 */
public class UsoPersona {
	/**
	 * @param args
	 */
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona[] lasPersonas = new Persona[2];
		lasPersonas[0] = new Empleado2("Luís Conde", 50000, 2009, 2, 25);
		lasPersonas[1] = new Alumno("Ana López", "Biología");
		
		for (Persona p : lasPersonas) {
			System.out.println(p.dameNombre() + ", " + p.dameDescripcion());
		}
	}
}


abstract class Persona{
	
	private String nombre;
	public abstract String dameDescripcion();	
	
	public Persona(String nom) {
		nombre=nom;		
	}
	
	public String dameNombre() {
		return nombre;
	} 
}


class Empleado2 extends Persona{
	
	private double sueldo;
	private Date altaContrato;
	private int id;
	private static int idSiguiente = 1;
	public Empleado2(String nom, double sue, int agno, int mes, int dia) {
		
		super(nom);
		
		sueldo=sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		altaContrato = calendario.getTime();
		++idSiguiente;
		id=idSiguiente;		
	}

	public String dameDescripcion() {
		return	"Este empleado tiene un ID=" + id + " Con un sueldo= " + sueldo;
	}

	/**
	 * @return the sueldo
	 */
	public double dameSueldo() {//Getter
		return sueldo;
	}

	/**
	 * @return the altaContrato
	 */
	public Date dameAltaContrato() {//Getter
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) {//Setter
		double aumento = sueldo*porcentaje/100;
		sueldo+=aumento;
	}
}

class Alumno extends Persona{
	
	private String carrera;
	
	public Alumno(String nom, String car) {
		super(nom);	
		carrera=car;
	}
	
	public String dameDescripcion() {
		return "Este alumno está estudiando la carrera de " + carrera;
	}
}