import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mabera
 *
 */
public class Matriznm {

    private Scanner teclado;
    private int[][] mat;
    
    public void cargar() {
    	teclado = new Scanner(System.in);
    	System.out.println("Dime cuantas columnas hay");
    	int columnas = teclado.nextInt();
    	System.out.println("Dime cuantas filas hay");
    	int filas = teclado.nextInt();    	
    	mat= new int[columnas][filas];
    	
    	for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
                System.out.print("Ingresa el componente:");
                mat[i][j]=teclado.nextInt();   
			}
		}    	
    }
    
    public void imprimir() {
    	for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				 System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
    }
    
    public void imprimirUltimaFila() {
    	System.out.println("Ultima fila");
        for(int i=0; i<mat[mat.length-1].length; i++) {
             System.out.print(mat[mat.length-1][i]+" ");
        }
    }
    
	public static void main(String[] args) {
        Matriznm ma=new Matriznm();
        ma.cargar();
        ma.imprimir();
        ma.imprimirUltimaFila();


	}

}
