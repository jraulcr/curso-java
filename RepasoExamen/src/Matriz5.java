import java.util.Scanner;

public class Matriz5 {
	private Scanner teclado;
	private int[][] mat;

	public void cargar() {
		// Pedimos por consola el numero de filas y columas que compondrá la matriz
		teclado = new Scanner(System.in);
		System.out.print("Cuantas fila tiene la matriz:");
		int filas = teclado.nextInt();
		System.out.print("Cuantas columnas tiene la matriz:");
		int columnas = teclado.nextInt();

		// Creación de la matriz con la cantidad de filas y columnas que la compondrá
		mat = new int[filas][columnas];
		// Recorremos las filas. Por cada fila con 'mat.length' preguntara de cuantas
		// filas dispone
		for (int i = 0; i < mat.length; i++) {
			// Recorremos las columnas. Por cada columna con 'mat[i].length' preguntará
			// cuando elementos tiene la fila
			for (int j = 0; j < mat[i].length; j++) {
				// Pedimos que ingrese los componentes de la matriz
				System.out.print("Ingrese componente:");
				mat[i][j] = teclado.nextInt();
			}
		}
	}

	public void imprimir() {
		// Pedimos a la matriz cuantos elementos de filas tiene para mostrar
		for (int i = 0; i < mat.length; i++) {
			// Pedimos a la matriz cuantos elementos de columnas tiene para mostrar
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			// Salto de linea
			System.out.println();
		}
	}

	// Para imprimir la última fila debemos disponer un valor fijo en el subíndice
	// de la fila
	// (en este caso no podemos disponer un número fijo sino preguntarle a la misma
	// matriz
	// la cantidad de filas y restarle uno ya que las filas comienzan a numerarse a
	// partir de cero: mat[mat.length-1][c])
	// También la condición del for debemos acceder al atributo length de la última
	// fila mat[mat.length-1].length

	public void imprimirUltimaFila() {
		// Pedimos que imprima la última fila
		System.out.println("Ultima fila");
		// Recorremos por columnas. Preguntando la cantidad de filas indicando cual es
		// la última fila con el subindice-1
		for (int i = 0; i < mat[mat.length - 1].length; i++) {
			System.out.print(mat[mat.length - 1][i] + " ");
		}
	}

	public static void main(String[] args) {
		Matriz5 ma = new Matriz5();
		ma.cargar();
		ma.imprimir();
		ma.imprimirUltimaFila();
	}
}