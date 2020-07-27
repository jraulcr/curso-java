package impuestoEmpleado;
/**
 * 
 */

/**
 * @author Juan Raúl Crespo
 *
 */
public class Empleado {

	private String nombreEmpleado;
	private double salario;

	public Empleado(String nombreEmpleado, double salario) {
		this.nombreEmpleado = nombreEmpleado;
		this.salario = salario;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public double getSalario() {
		return salario;
	}
}
