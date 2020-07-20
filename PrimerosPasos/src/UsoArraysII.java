/**
 * 
 */
import javax.swing.*;
/**
 * @author Mabera
 *
 */
public class UsoArraysII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		String [] paises =new String [8];
		
	/*	for (int i = 0; i < 8; i++) {
			
			paises[i] = JOptionPane.showInputDialog("Introduce pais" + (i+1));
			
		}*/
		
	/*	paises[0] = "España";
		paises[1] = "Mexico";
		paises[2] = "Peru";
		paises[3] = "Colombia";
		paises[4] = "Argentina";
		paises[5] = "Ecuador";
		paises[6] = "Chile";
		paises[7] = "Honduras";*/
		
	//	String [] paises = {"España", "Mexico", "Peru", "Colombia", "Argentina", "Ecuador", "Chile", "Honduras"};
		
	/*	for (String elemento : paises) {
			System.out.println("Pais: " + elemento);
		}*/
		
		int [] matriz_aleatorios =  new int[150];	
		
		for (int i = 0; i < matriz_aleatorios.length; i++) {
			
			matriz_aleatorios[i] = (int)Math.round(Math.random()*100);
			
		}
		
		for (int numeros : matriz_aleatorios) {
			
			System.out.print(numeros + " ");
			
		}

	}

}
