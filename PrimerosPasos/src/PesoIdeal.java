/**
 * 
 */
import javax.swing.*;
/**
 * @author Mabera
 *
 */
public class PesoIdeal {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String genero = "";
		
		do {
			genero = JOptionPane.showInputDialog("Introduce tu género (H/M)");
		} while (!genero.equalsIgnoreCase("H") && !genero.equalsIgnoreCase("M"));
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura"));
		
		int pesoIdeal = 0;
		
		if(genero.equalsIgnoreCase("H")) {
			
			pesoIdeal = altura - 110;
			
		} else if (genero.equalsIgnoreCase("M")) {
			
			pesoIdeal =  altura - 120;			
		}
		
		System.out.println("Tu peso ideal es de: " + pesoIdeal + " Kg");
		
	}

}
 