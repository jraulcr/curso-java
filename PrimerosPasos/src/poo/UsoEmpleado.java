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
public class UsoEmpleado {

	public static void main(String[] args) {

		Jefatura jefeRRHH = new Jefatura("Juan Ruiz", 1800, 2020, 9, 5); 
		
		jefeRRHH.estableceIncentivo(2570);
		
		Empleado[] misEmpleados =  new Empleado[6];
		misEmpleados[0] = new Empleado("Paco Gómez", 85000, 1990, 12, 17);
		misEmpleados[1] = new Empleado("Ana López", 95000, 1995, 6, 2);
		misEmpleados[2] = new Empleado("María Martín", 105000, 2002, 02, 15);
		misEmpleados[3] = new Empleado("Curro Jiménez");
		misEmpleados[4] = jefeRRHH; // Polimorfismo en accion. Principio de sustitución
		misEmpleados[5] = new Jefatura("María", 200000, 2020, 8, 1);
		
		Jefatura jefa_finanzas = (Jefatura) misEmpleados[5];
		jefa_finanzas.estableceIncentivo(5000);
		
		for (Empleado empleado : misEmpleados) {
			empleado.subeSueldo(5);//Aumentamos un 5 el sueldo
		}
		
		for (Empleado empleado : misEmpleados) {			
			System.out.println("Nombre: " + empleado.dameNombre() 
			+ " Sueldo: " + empleado.dameSueldo()
			+ " Fecha alta: " + empleado.dameAltaContrato());			
		}
		
	}
}

class Empleado {
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private int id;
	private static int idSiguiente = 1;
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		altaContrato = calendario.getTime();
		++idSiguiente;
		id=idSiguiente;		
	}
	//Si queremos crear un segundo constructor
	public Empleado(String nom) {
		this(nom, 30000, 2000, 01, 01);
	}

	/**
	 * @return the nombre
	 */
	public String dameNombre() {//Getter
		return nombre + " Id: " + id;
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

class Jefatura extends Empleado{
	
	private double incentivo;
	
	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		super(nom, sue, agno, mes, dia);
	}	
	
	public void estableceIncentivo(double b) {
		incentivo=b;
	}
	
	public double dameSueldo() {
		double sueldoJefe = super.dameSueldo();		
		return sueldoJefe + incentivo;
	}
}