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
				pass=JOptionPane.showInputDialog("Introduce la contrase�a. Por favor:");
				
				if (!clave.equals(pass)) {
					System.out.println("Contrase�a incorrecta");
				}
			}
			System.out.println("Contrase�a correcta. Acceso permitido");

	}

}
