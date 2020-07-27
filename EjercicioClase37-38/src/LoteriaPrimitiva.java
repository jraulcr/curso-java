import java.util.ArrayList;


/**
 * @author Juan Raúl Crespo
 *
 *
 *
 *Números de la série: 7 15 48 35 18 37 
Complementario: 23
 */
public class LoteriaPrimitiva {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<Integer> numLoteria = new ArrayList<>();

		int numero = 0;
		while (numero < 8) {
			
			int numAleatorios = (int) (Math.random() * 49 + 1);

			if (!numLoteria.contains(numAleatorios)) {
				numLoteria.add(numAleatorios);
				numero++;
			}			
		}

		System.out.print("Números de la série: ");

		for (int i = 0; i < numLoteria.size(); i++) {
			if (i < 6) {
				System.out.print(numLoteria.get(i).intValue() + " ");
			}else if (i == 6) {
				System.out.println("\nComplementario: " + numLoteria.get(i).intValue());
			}else if (i == 7) {
				System.out.println("Reintegro: " + numLoteria.get(i).intValue());
			}
		}
	}

}
