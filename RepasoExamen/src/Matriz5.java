import java.util.Scanner;
public class Matriz5 {
    private Scanner teclado;
    private int[][] mat;
    
    public void cargar() {
    	
        teclado=new Scanner(System.in);
        
        System.out.print("Cuantas fila tiene la matriz:");        
        int filas=teclado.nextInt();
        
        System.out.print("Cuantas columnas tiene la matriz:");        
        int columnas=teclado.nextInt();
        
        mat = new int[filas][columnas];
        
        for(int i=0;i<mat.length;i++) {        	
            for(int z=0;z<mat[i].length;z++) {            	
                System.out.print("Ingrese componente:");
                mat[i][z]=teclado.nextInt();                
            }
        }
    }
    
    public void imprimir() {
        for(int i=0;i<mat.length;i++) {        	
            for(int z=0;z<mat[i].length;z++) {            	
                System.out.print(mat[i][z] + " ");                
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
    
    public static void main(String[] ar) {
        Matriz5 ma=new Matriz5();
        ma.cargar();
        ma.imprimir();
        ma.imprimirUltimaFila();
    }   
}