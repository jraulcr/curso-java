/**
 * 
 */
package poo;

/**
 * @author Mabera
 *
 */
public class Pruebas {

	public static void main(String[] args) {
		Empleados trabajador1= new Empleados("Paco");
		Empleados trabajador2= new Empleados("Ana");	
		Empleados trabajador3= new Empleados("Pepe");	
		
		trabajador1.cambiaSeccion("RR.HH.");
	//	trabajador1.cambiaNombre("Lucas");
		
		System.out.println(trabajador1.devuelveDatos());	
		System.out.println(trabajador2.devuelveDatos());
		System.out.println(trabajador3.devuelveDatos());
		
	}

}


class Empleados{
	
	private final String nombre;
	private String seccion;
	private int id;
	private static int idSiguiente = 1;
	
	public Empleados(String nom) {		
		nombre=nom;		
		seccion="Administración";
		id=idSiguiente;
		idSiguiente++;
	}
	
	public void cambiaSeccion(String seccion){//Setter
		this.seccion=seccion;				
	}
	/*public void cambiaNombre(String nombre){//Setter
		this.nombre=nombre;				
	}*/
	
	public String devuelveDatos() {//Getter
		return "El nombre es: " + nombre + " y la sección es: " + seccion + " ID: " + id; 
	}
}