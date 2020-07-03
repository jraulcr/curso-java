
public class ManipulacionCadenas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase = "Hoy es un estupendo día para aprender a programar en Java";
		
		String fraseResumen = frase.substring(29, 57);
		
		System.out.println(fraseResumen);
		
		String alumno1 = "Juan";
		
		String alumno2 = "juan";
		
		System.out.println(alumno1.equals(alumno2));
		System.out.println(alumno1.equalsIgnoreCase(alumno2));
		
	}

}
