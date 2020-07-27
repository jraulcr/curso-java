package impuestoEmpleado;
/**
 * 
 */

/**
 * @author Juan Raúl Crespo
 *
 */
public class OperacionesEmpleado {

	public static boolean isSalarioMasAlto(Empleado empleado) { 
		boolean isMasAlto=false;
		if (empleado.getSalario() > 3000.00) {
			isMasAlto=  true;
		} else {
			isMasAlto = false;
		}
		return isMasAlto;
	}

	public static void main(String[] args) {

		Empleado[] misEmpleados = new Empleado[3];
		misEmpleados[0] = new Empleado("Paco Pil", 85000);
		misEmpleados[1] = new Empleado("Chema Pamundi", 95000);
		misEmpleados[2] = new Empleado("María Dorada", 1000);

		for (Empleado empleado : misEmpleados) {

			if (isSalarioMasAlto(empleado)) {

				System.out.println(empleado.getNombreEmpleado() + ", tiene de salario " + empleado.getSalario()
						+ " €. Pagará impuestos.");

			} else {

				System.out.println(empleado.getNombreEmpleado() + ", tiene de salario " + empleado.getSalario()
						+ " €. No pagará impuestos.");
			}
		}
	}
}
