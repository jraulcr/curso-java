/**
 * 
 */
import javax.swing.*;
/**
 * @author Mabera
 *
 */
public class AccesoAplicacion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String clave="Juan";
			String pass="";
			
			while (!clave.equals(pass)) {
				pass=JOptionPane.showInputDialog("Introduce la contraseņa. Por favor:");
				
				if (!clave.equals(pass)) {
					System.out.println("Contraseņa incorrecta");
				}
			}
			System.out.println("Contraseņa correcta. Acceso permitido");

	}

}
